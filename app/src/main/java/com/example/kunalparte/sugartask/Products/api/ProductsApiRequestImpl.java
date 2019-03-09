package com.example.kunalparte.sugartask.Products.api;

import android.os.AsyncTask;

import com.example.kunalparte.sugartask.Products.interfaces.ApiServiceContract;
import com.example.kunalparte.sugartask.Products.models.Categories;
import com.example.kunalparte.sugartask.Products.models.Products;
import com.example.kunalparte.sugartask.Products.models.ProductsRootResponse;
import com.example.kunalparte.sugartask.utils.ServiceGenerater;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ProductsApiRequestImpl implements ApiServiceContract.ProductsApiRequest {

    public ProductsApiRequestImpl(){

    }

    @Override
    public void onProductsApiCall(ApiServiceContract.ProductsApiCall productsApiCall, List<String> productsUrls, String category) {
        new ProductsTask(productsUrls,productsApiCall,category).execute();
    }

    public class ProductsTask extends AsyncTask<Void, Void, Void>{

        private List<String> productsUrls;
        private ApiServiceContract.ProductsApiCall productsApiCall;
        private String category = "";

        public ProductsTask(List<String> productsUrl, ApiServiceContract.ProductsApiCall productsApiCall,String category){
            this.productsUrls = productsUrl;
            this.productsApiCall = productsApiCall;
            this.category = category;
        }

        @Override
        protected Void doInBackground(Void... voids) {
            if (productsUrls.size() > 0) {
                List<Products> productsList = new ArrayList<>();
                for (int i = 0; i< productsUrls.size(); i++) {
                    try {
                        Call<ProductsRootResponse> productsCall = ServiceGenerater.createProductApiService(ApiInterface.class).getProducts(category.toLowerCase() + "/" + String.valueOf(i+1) + ".json");
                        Response<ProductsRootResponse> products1 = productsCall.execute();
                        productsList.addAll(products1.body().getProducts());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                productsApiCall.onResponseSuccess(productsList);
            }
            return null;
        }
    }
}
