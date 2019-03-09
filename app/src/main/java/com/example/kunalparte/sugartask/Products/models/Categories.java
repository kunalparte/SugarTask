package com.example.kunalparte.sugartask.Products.models;

import java.util.List;

public class Categories {

    private List<Category> categories;

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public static class Category{

        public Category(){

        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        private String title;

        private List<String> categoriesUrl;

        private List<Products> products;

        public List<Products> getProducts() {
            return products;
        }

        public void setProducts(List<Products> products) {
            this.products = products;
        }

        public List<String> getCategoriesUrl() {
            return categoriesUrl;
        }

        public void setCategoriesUrl(List<String> categoriesUrl) {
            this.categoriesUrl = categoriesUrl;
        }
    }
}
