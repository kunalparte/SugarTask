package com.example.kunalparte.sugartask.Products.adapters;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.kunalparte.sugartask.Products.interfaces.RecyclerViewItemClickListener;
import com.example.kunalparte.sugartask.Products.models.Categories;
import com.example.kunalparte.sugartask.Products.models.Products;
import com.example.kunalparte.sugartask.R;
import com.example.kunalparte.sugartask.utils.NestedRecyclerGridLayoutManager;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class CategoriesAdapter extends RecyclerView.Adapter<CategoriesAdapter.VHolder> {

    private Activity activity;
    private List<Categories.Category> categories;
    private RecyclerViewItemClickListener recyclerViewItemClickListener;
    private ProductsRecyclerAdpter productsRecyclerAdpter;

    public CategoriesAdapter(Activity activity, List<Categories.Category> categories, RecyclerViewItemClickListener recyclerViewItemClickListener){
        this.activity = activity;
        this.categories = categories;
        this.recyclerViewItemClickListener = recyclerViewItemClickListener;
    }

    @NonNull
    @Override
    public VHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(activity).inflate(R.layout.categories_list_item,viewGroup,false);
        return new VHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final VHolder vHolder, final int i) {
        vHolder.pos = i;
        vHolder.categoriesTitle.setText(categories.get(i).getTitle());
        final List<Products> productsList = new ArrayList<>();
        initChildLayoutManager(vHolder.recyclerView,createCollapsedList(categories.get(i).getProducts()),categories.get(i).getTitle());

        vHolder.toggler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (vHolder.toggler.getDrawable().getConstantState() == activity.getDrawable(R.drawable.ic_keyboard_arrow_down_black_24dp).getConstantState()){
                    vHolder.toggler.setImageResource(R.drawable.ic_keyboard_arrow_up_black_24dp);
                    initChildLayoutManager(vHolder.recyclerView,createExpandList(categories.get(i).getProducts()),categories.get(i).getTitle());
                }else {
                    vHolder.toggler.setImageResource(R.drawable.ic_keyboard_arrow_down_black_24dp);
                    initChildLayoutManager(vHolder.recyclerView,createCollapsedList(categories.get(i).getProducts()),categories.get(i).getTitle());
                }
            }
        });
    }

    public List<Products> createExpandList(List<Products>products){
        return products;
    }

    public List<Products>createCollapsedList(List<Products>products){
        List<Products> productsList = new ArrayList<>();
        for (int i = 0; i< products.size(); i++){
            if (i > 1){
                break;
            }
            productsList.add(products.get(i));
        }
        return productsList;
    }

    private void initChildLayoutManager(RecyclerView recyclerView, List<Products> childData,String cat) {
        recyclerView.setLayoutManager(new NestedRecyclerGridLayoutManager(activity));
        ProductsRecyclerAdpter productAdapter = new ProductsRecyclerAdpter(activity,childData,recyclerViewItemClickListener,cat);
        recyclerView.setAdapter(productAdapter);
    }

    @Override
    public int getItemCount() {
        return categories.size();
    }

    public class VHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        @BindView(R.id.productImageRecycler)
        RecyclerView recyclerView;

        @BindView(R.id.toggler)
        FloatingActionButton toggler;

        @BindView(R.id.categoryTitle)
        TextView categoriesTitle;

        int pos = 0;
        public VHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this,itemView);
        }

        @Override
        public void onClick(View v) {
            recyclerViewItemClickListener.onRecyclerViewItemClicked(pos);
        }
    }
}
