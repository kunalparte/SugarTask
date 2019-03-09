package com.example.kunalparte.sugartask.Products.models;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

public class ImagesBean implements Parcelable {

    private long id;
    private long product_id;
    private int position;
    private String created_at;
    private String updated_at;
    private Object alt;
    private int width;
    private int height;
    private String src;
    private String admin_graphql_api_id;
    private List<String> variant_ids;

    public static final Creator<ImagesBean> CREATOR = new Creator<ImagesBean>() {
        @Override
        public ImagesBean createFromParcel(Parcel source) {
            return new ImagesBean(source);
        }

        @Override
        public ImagesBean[] newArray(int size) {
            return new ImagesBean[size];
        }
    };

    protected ImagesBean(Parcel source) {
        this.id = source.readLong();
        this.product_id = source.readLong();
        this.position = source.readInt();
        this.created_at = source.readString();
        this.updated_at = source.readString();
        this.width = source.readInt();
        this.height = source.readInt();
        this.src = source.readString();
        this.admin_graphql_api_id = source.readString();
    }

    public ImagesBean(ImagesBean source) {
        this.id = source.id;
        this.product_id = source.product_id;
        this.position = source.position;
        this.created_at = source.created_at;
        this.updated_at = source.updated_at;
        this.width = source.width;
        this.height = source.height;
        this.src = source.src;
        this.admin_graphql_api_id = source.admin_graphql_api_id;
    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getProduct_id() {
        return product_id;
    }

    public void setProduct_id(long product_id) {
        this.product_id = product_id;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public Object getAlt() {
        return alt;
    }

    public void setAlt(Object alt) {
        this.alt = alt;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public String getAdmin_graphql_api_id() {
        return admin_graphql_api_id;
    }

    public void setAdmin_graphql_api_id(String admin_graphql_api_id) {
        this.admin_graphql_api_id = admin_graphql_api_id;
    }

    public List<String> getVariant_ids() {
        return variant_ids;
    }

    public void setVariant_ids(List<String> variant_ids) {
        this.variant_ids = variant_ids;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeLong(this.id);
        dest.writeLong(this.product_id);
        dest.writeInt(this.position);
        dest.writeString(this.created_at);
        dest.writeString(this.updated_at);
        dest.writeInt(this.width);
        dest.writeInt(this.height);
        dest.writeString(this.src);
        dest.writeString(this.admin_graphql_api_id);
    }
}
