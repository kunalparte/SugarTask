package com.example.kunalparte.sugartask.Products.presenter;

import com.example.kunalparte.sugartask.Products.interfaces.ApiServiceContract;
import com.example.kunalparte.sugartask.Products.interfaces.ProductsContract;
import com.example.kunalparte.sugartask.Products.models.Products;

import java.util.List;

public class ProductsPresenter implements ProductsContract.UserInteractionListener, ApiServiceContract.ProductsApiCall {

    private ApiServiceContract.ProductsApiRequest productsApiRequest;
    private ProductsContract.View productsView;
    private List<String> productsUrl;
    private String categoryTitle = "";

    public ProductsPresenter(ProductsContract.View view){
        this.productsView = view;

    }

    @Override
    public void loadProducts() {

    }

    @Override
    public void onProductItemClicked(Products products) {
        productsView.showProductDetails(products);
    }

    @Override
    public void onResponseSuccess(List<Products> productsList) {
//        productsView.showProducts(productsList);
    }

    @Override
    public void onResponseError(String error) {

    }
}
