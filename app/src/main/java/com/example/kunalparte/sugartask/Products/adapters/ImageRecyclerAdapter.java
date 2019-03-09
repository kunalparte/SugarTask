package com.example.kunalparte.sugartask.Products.adapters;

import android.app.Activity;
import android.media.Image;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.kunalparte.sugartask.Products.models.ImagesBean;
import com.example.kunalparte.sugartask.R;
import com.example.kunalparte.sugartask.utils.GlideLoader;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ImageRecyclerAdapter extends RecyclerView.Adapter<ImageRecyclerAdapter.VHolder> {

    private Activity activity;
    private List<ImagesBean> imagesBeans;

    public ImageRecyclerAdapter(Activity activity, List<ImagesBean> images){
        this.imagesBeans = images;
        this.activity = activity;
    }

    @NonNull
    @Override
    public VHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(activity).inflate(R.layout.image_list_item, viewGroup,false);
        return new VHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull VHolder vHolder, int i) {
        GlideLoader.url(activity).load(imagesBeans.get(i).getSrc()).into(vHolder.imageView);
    }

    @Override
    public int getItemCount() {
        return imagesBeans.size();
    }

    public class VHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.imageListItem)
        ImageView imageView;

        public VHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
