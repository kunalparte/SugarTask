package com.example.kunalparte.sugartask.Products.interfaces;

import com.example.kunalparte.sugartask.Products.models.Categories;
import com.example.kunalparte.sugartask.Products.models.Products;

import java.util.List;

public interface ApiServiceContract {

    interface CategoriesApiRequest{

        void onCategoriesApiCall(CategoriesApiCall categoriesApiCall);
    }

    interface ProductsApiRequest{

        void onProductsApiCall(ProductsApiCall productsApiCall, List<String> productsUrls, String category);
    }

    interface CategoriesApiCall{
        void onResponseSuccess(Categories categories);

        void onResponseError(String error);
    }

    interface ProductsApiCall{

        void onResponseSuccess(List<Products> productsList);

        void onResponseError(String error);
    }
}
