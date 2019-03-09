package com.example.kunalparte.sugartask.Products.interfaces;

import com.example.kunalparte.sugartask.Products.models.Categories;

public interface CategoriesContract {

    interface View{

        void showCategories(Categories categories);

    }

    interface UserInteractionListener{

        void loadCategories();
    }
}
