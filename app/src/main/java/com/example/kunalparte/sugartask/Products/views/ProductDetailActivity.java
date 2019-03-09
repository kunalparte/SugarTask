package com.example.kunalparte.sugartask.Products.views;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import com.example.kunalparte.sugartask.Products.adapters.ImageRecyclerAdapter;
import com.example.kunalparte.sugartask.Products.interfaces.ProductDetailContract;
import com.example.kunalparte.sugartask.Products.models.ImagesBean;
import com.example.kunalparte.sugartask.Products.models.Products;
import com.example.kunalparte.sugartask.Products.presenter.ProductDetailsPresenter;
import com.example.kunalparte.sugartask.R;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ProductDetailActivity extends AppCompatActivity implements ProductDetailContract.View {

    @BindView(R.id.titleTExtView)
    TextView titleTextView;

    @BindView(R.id.priceTExtView)
    TextView priceTextView;

    @BindView(R.id.descTExtView)
    TextView descTextView;

    @BindView(R.id.imageRecyclerView)
    RecyclerView imaeRecyclerView;

    private ProductDetailsPresenter productDetailsPresenter;
    private GridLayoutManager gridLayoutManager;
    private ImageRecyclerAdapter imageRecyclerAdapter;
    private Products products;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_detail);
        ButterKnife.bind(this);
        getIntentData();
        init();
        productDetailsPresenter.loadProduct(products);
    }

    private void init() {
        productDetailsPresenter = new ProductDetailsPresenter(this);
        gridLayoutManager = new GridLayoutManager(this, 1);
        gridLayoutManager.setOrientation(GridLayoutManager.HORIZONTAL);
        imaeRecyclerView.setLayoutManager(gridLayoutManager);
    }

    public void getIntentData(){
//        products = new Products();
        Intent intent = getIntent();
        products = intent.getExtras().getParcelable("products");
        List<ImagesBean> imagesBeans = intent.getExtras().getParcelableArrayList("images");
        products.setImages(imagesBeans);
    }

    @Override
    public void showProduct(Products products) {
        setProductOnView(products);
    }

    public void setProductOnView(Products productOnView){
        titleTextView.setText(productOnView.getTitle());
        priceTextView.setText( "Rs" + productOnView.getVariants().get(0).getPrice());
        descTextView.setText(getDescription(products));
        setDataOnAdapter(productOnView.getImages());

    }

    public String getDescription(Products products){
        String desc = "Vendor : " +  products.getVendor() + "\n\n"
                + "Product Type : " + products.getProduct_type() + "\n\n"
                + "Created At : "+ products.getCreated_at();
        return desc;
    }

    public void setDataOnAdapter(List<ImagesBean> imagesBeans){
        imageRecyclerAdapter = new ImageRecyclerAdapter(this, imagesBeans);
        imaeRecyclerView.setAdapter(imageRecyclerAdapter);
        imageRecyclerAdapter.notifyDataSetChanged();
    }
}
