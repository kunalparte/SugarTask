package com.example.kunalparte.sugartask.Products.views;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.kunalparte.sugartask.Products.adapters.CategoriesAdapter;
import com.example.kunalparte.sugartask.Products.api.CategoriesApiRequestImpl;
import com.example.kunalparte.sugartask.Products.interfaces.CategoriesContract;
import com.example.kunalparte.sugartask.Products.interfaces.ProductsContract;
import com.example.kunalparte.sugartask.Products.interfaces.RecyclerViewItemClickListener;
import com.example.kunalparte.sugartask.Products.models.Categories;
import com.example.kunalparte.sugartask.Products.models.ImagesBean;
import com.example.kunalparte.sugartask.Products.models.Products;
import com.example.kunalparte.sugartask.Products.presenter.CategoriesPresenter;
import com.example.kunalparte.sugartask.Products.presenter.ProductsPresenter;
import com.example.kunalparte.sugartask.R;
import com.example.kunalparte.sugartask.utils.GenericFragmentPagerAdapter;
import com.example.kunalparte.sugartask.utils.VerticalViewPager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements CategoriesContract.View, RecyclerViewItemClickListener,ProductsContract.View {

    @BindView(R.id.fragmentPager)
    VerticalViewPager fragmentPager;

    @BindView(R.id.categoriesRecycler)
    RecyclerView categoriesRecycler;

    private Categories categoriesResp;
    private CategoriesPresenter categoriesPresenter;
    private GenericFragmentPagerAdapter fragmentPagerAdapter;

    private CategoriesAdapter categoriesAdapter;
    private ProductsPresenter productsPresenter;
    private LinearLayoutManager linearLayoutManager;

    private Map<String, List<Products>> productHashMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        init();
        categoriesPresenter.loadCategories();
    }

    @Override
    public void showCategories(final Categories categories) {
//        setViewPager(categories);
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                categoriesResp = categories;
                setDataOnAdapter(categories.getCategories());
                for (Categories.Category  category : categoriesResp.getCategories()){
                    productHashMap.put(category.getTitle(), category.getProducts());
                }
            }
        });
    }

    public void init(){
        categoriesPresenter = new CategoriesPresenter(this,new CategoriesApiRequestImpl());
        productsPresenter = new ProductsPresenter(this);
        linearLayoutManager = new LinearLayoutManager(this);
        categoriesRecycler.setLayoutManager(linearLayoutManager);
        categoriesResp = new Categories();
        productHashMap = new HashMap<>();
    }

    public void setDataOnAdapter(List<Categories.Category> categories){
        categoriesAdapter = new CategoriesAdapter(this,categories,this);
        categoriesRecycler.setAdapter(categoriesAdapter);
        categoriesAdapter.notifyDataSetChanged();
    }


    @Override
    public void onRecyclerViewItemClicked(int position) {

    }

    @Override
    public void onProductRecyclerItemClicked(int position, String categoryType) {
        List<Products> productsList = productHashMap.get(categoryType);
        productsPresenter.onProductItemClicked(productsList.get(position));
    }

    @Override
    public void showProducts(List<Products> products) {

    }

    @Override
    public void showProductDetails(Products products) {
        Products products1 = new Products(products);
        List<ImagesBean> imagesBeans = products1.getImages();
        Intent intent = new Intent(this,ProductDetailActivity.class);
        intent.putExtra("products", products1);
        intent.putParcelableArrayListExtra("images", (ArrayList<? extends Parcelable>) imagesBeans);
        startActivity(intent);
    }
}
