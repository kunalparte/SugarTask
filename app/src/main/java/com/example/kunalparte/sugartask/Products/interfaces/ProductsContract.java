package com.example.kunalparte.sugartask.Products.interfaces;

import com.example.kunalparte.sugartask.Products.models.Products;

import java.util.List;

public interface ProductsContract {

    interface View{

        void showProducts(List<Products> products);

        void showProductDetails(Products products);
    }

    interface  UserInteractionListener{

        void loadProducts();

        void onProductItemClicked(Products products);
    }
}
