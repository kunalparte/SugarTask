package com.example.kunalparte.sugartask.Products.models;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

import okio.Options;

public class OptionsBean implements Parcelable {

    private long id;
    private long product_id;
    private String name;
    private int position;
    private List<String> values;

    public static Creator<OptionsBean> CREATOR = new Creator<OptionsBean>() {
        @Override
        public OptionsBean createFromParcel(Parcel source) {
            return new OptionsBean(source);
        }

        @Override
        public OptionsBean[] newArray(int size) {
            return new OptionsBean[size];
        }
    };

    public OptionsBean(OptionsBean source){
        this.id = source.id;
        this.product_id = source.product_id;
        this.name = source.name;
        this.position = source.position;
        this.values = source.values;
    }

    protected OptionsBean(Parcel source) {
        this.id = source.readLong();
        this.product_id = source.readLong();
        this.name = source.readString();
        this.position = source.readInt();
        this.values = source.createStringArrayList();
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public List<String> getValues() {
        return values;
    }

    public void setValues(List<String> values) {
        this.values = values;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeLong(this.id );
        dest.writeLong(this.product_id);
        dest.writeString(this.name );
        dest.writeInt(this.position );
        dest.writeStringList(this.values );
    }
}
