package com.example.kunalparte.sugartask.Products.presenter;

import com.example.kunalparte.sugartask.Products.interfaces.ProductDetailContract;
import com.example.kunalparte.sugartask.Products.models.Products;

public class ProductDetailsPresenter implements ProductDetailContract.UserInteractionListener {

    private ProductDetailContract.View view;

    public ProductDetailsPresenter(ProductDetailContract.View view){
        this.view = view;
    }

    @Override
    public void loadProduct(Products products) {
        view.showProduct(products);
    }
}
