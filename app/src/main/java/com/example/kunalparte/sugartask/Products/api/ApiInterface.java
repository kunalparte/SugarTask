package com.example.kunalparte.sugartask.Products.api;

import com.example.kunalparte.sugartask.Products.models.Products;
import com.example.kunalparte.sugartask.Products.models.ProductsRootResponse;
import com.example.kunalparte.sugartask.utils.Consts;
import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface ApiInterface {

    @GET(Consts.CATEGORIES_URL)
    public Call<JsonObject> getAllCategories();

    @GET
    Call<ProductsRootResponse> getProducts(@Url String url);
}
