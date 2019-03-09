package com.example.kunalparte.sugartask.Products.interfaces;

import com.example.kunalparte.sugartask.Products.models.Products;

public interface ProductDetailContract {

    interface View{
        void showProduct(Products products);
    }

    interface UserInteractionListener{
        void loadProduct(Products products);
    }
}
