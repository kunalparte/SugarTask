package com.example.kunalparte.sugartask.Products.presenter;

import com.example.kunalparte.sugartask.Products.interfaces.ApiServiceContract;
import com.example.kunalparte.sugartask.Products.interfaces.CategoriesContract;
import com.example.kunalparte.sugartask.Products.interfaces.ProductsContract;
import com.example.kunalparte.sugartask.Products.models.Categories;

public class CategoriesPresenter implements CategoriesContract.UserInteractionListener, ApiServiceContract.CategoriesApiCall {

    private CategoriesContract.View categoriesView;
    private ApiServiceContract.CategoriesApiRequest categoriesApiRequest;

    public CategoriesPresenter(CategoriesContract.View view, ApiServiceContract.CategoriesApiRequest categoriesApiRequest){
        this.categoriesView = view;
        this.categoriesApiRequest = categoriesApiRequest;
    }

    @Override
    public void loadCategories() {
        categoriesApiRequest.onCategoriesApiCall(this);
    }

    @Override
    public void onResponseSuccess(Categories categories) {
        categoriesView.showCategories(categories);
    }

    @Override
    public void onResponseError(String error) {

    }
}
