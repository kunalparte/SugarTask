package com.example.kunalparte.sugartask.Products.adapters;

import android.app.Activity;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.kunalparte.sugartask.Products.interfaces.RecyclerViewItemClickListener;
import com.example.kunalparte.sugartask.Products.models.Products;
import com.example.kunalparte.sugartask.R;
import com.example.kunalparte.sugartask.utils.GlideLoader;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ProductsRecyclerAdpter extends RecyclerView.Adapter<ProductsRecyclerAdpter.VHolder> {

    private Activity activity;
    private List<Products> products;
    private List<Products> collapsedProductList;
    private RecyclerViewItemClickListener recyclerViewItemClickListener;
    private String categoryType = "";

    public ProductsRecyclerAdpter(Activity activity, List<Products>products, RecyclerViewItemClickListener recyclerViewItemClickListener,String categoryType){
        this.activity = activity;
        this.products = products;
        this.recyclerViewItemClickListener = recyclerViewItemClickListener;
        this.categoryType = categoryType;
        collapsedProductList = new ArrayList<>(products);
    }

    @NonNull
    @Override
    public VHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(activity).inflate(R.layout.product_list_item,viewGroup,false);
        return new VHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull VHolder vHolder, int i) {
        vHolder.positionClicked = i;
        GlideLoader.url(activity).load(products.get(i).getImage().getSrc()).into(vHolder.imageView);
        vHolder.productTitle.setText(products.get(i).getTitle());
    }

    @Override
    public int getItemCount() {
        return products.size();
    }

    public void expandedCollapsedList(List<Products> productsList){
        products = productsList;
        notifyItemRangeInserted(getItemCount()+1, 2);
    }

    public class VHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        @BindView(R.id.imageView)
        ImageView imageView;

        @BindView(R.id.productTitle)
        TextView productTitle;

        int positionClicked = 0;

        public VHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            recyclerViewItemClickListener.onProductRecyclerItemClicked(positionClicked,categoryType);
        }
    }
}
