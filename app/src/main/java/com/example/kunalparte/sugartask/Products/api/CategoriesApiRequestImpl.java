package com.example.kunalparte.sugartask.Products.api;

import android.os.AsyncTask;

import com.example.kunalparte.sugartask.Products.interfaces.ApiServiceContract;
import com.example.kunalparte.sugartask.Products.models.Categories;
import com.example.kunalparte.sugartask.Products.models.Products;
import com.example.kunalparte.sugartask.Products.models.ProductsRootResponse;
import com.example.kunalparte.sugartask.utils.ServiceGenerater;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Handler;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CategoriesApiRequestImpl implements ApiServiceContract.CategoriesApiRequest {

    public CategoriesApiRequestImpl(){

    }

    @Override
    public void onCategoriesApiCall(final ApiServiceContract.CategoriesApiCall categoriesApiCall) {
        Call<JsonObject> categoriesCall = ServiceGenerater.createProductApiService(ApiInterface.class).getAllCategories();
        categoriesCall.enqueue(new Callback<JsonObject>() {
            @Override
            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
                if (response.isSuccessful()){
                    if (response.body() != null){
                        new CategoriesCall(categoriesApiCall,response.body()).execute();

                    }
                }
            }

            @Override
            public void onFailure(Call<JsonObject> call, Throwable t) {
                categoriesApiCall.onResponseError(t.getMessage());
            }
        });
    }

    public class CategoriesCall extends AsyncTask<Void,Void,Void>{

        private ApiServiceContract.CategoriesApiCall categoriesApiCall;
        private JsonObject response;

        public CategoriesCall(ApiServiceContract.CategoriesApiCall categoriesApiCall,JsonObject response){
            this.response = response;
            this.categoriesApiCall = categoriesApiCall;
        }

        @Override
        protected Void doInBackground(Void... voids) {
            Categories categories = new Categories();
            List<Categories.Category> categoriesList = new ArrayList<>();
            JsonArray jsonArray = response.getAsJsonArray("category");
            for (int i = 0; i < jsonArray.size(); i++){
                JsonObject categoryJsonObject = jsonArray.get(i).getAsJsonObject();
                Iterator iterator = categoryJsonObject.keySet().iterator();
                while (iterator.hasNext()){
                    String keys = (String) iterator.next();
                    JsonArray productUrlArr = categoryJsonObject.getAsJsonArray(keys);
                    List<Products> prodUrls = new ArrayList<>();
                    for (int j = 0; j < productUrlArr.size(); j++){
                        Categories.Category category = new Categories.Category();
                        JsonObject jsonObject = productUrlArr.get(j).getAsJsonObject();
                        Iterator iterator1 = jsonObject.keySet().iterator();
                        int count = 0;
                        while(iterator1.hasNext()){
                            String url = jsonObject.get(iterator1.next().toString()).getAsString();
                            try {
                                count++;
                                Call<ProductsRootResponse> productsCall = ServiceGenerater.createProductApiService(ApiInterface.class).getProducts(keys.toLowerCase() + "/" + String.valueOf(count) + ".json");
                                Response<ProductsRootResponse> products1 = productsCall.execute();
                                prodUrls.addAll(products1.body().getProducts());
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
//                                        prodUrls.add(url);
                        }
                        category.setProducts(prodUrls);
                        category.setTitle(keys);
                        categoriesList.add(category);
                    }

                }
            }
            categories.setCategories(categoriesList);
            categoriesApiCall.onResponseSuccess(categories);

            return null;
        }
    }
}
