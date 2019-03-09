package com.example.kunalparte.sugartask.Products.models;

import android.os.Parcel;
import android.os.Parcelable;

public class VariantsBean implements Parcelable {
    private long id;
    private long product_id;
    private String title;
    private String price;
    private String sku;
    private int position;
    private String inventory_policy;
    private Object compare_at_price;
    private String fulfillment_service;
    private String inventory_management;
    private String option1;
    private Object option2;
    private Object option3;
    private String created_at;
    private String updated_at;
    private boolean taxable;
    private String barcode;
    private int grams;
    private Object image_id;
    private String weight;
    private String weight_unit;
    private long inventory_item_id;
    private int inventory_quantity;
    private int old_inventory_quantity;
    private boolean requires_shipping;
    private String admin_graphql_api_id;

    public static Creator<VariantsBean> CREATOR = new Creator<VariantsBean>() {
        @Override
        public VariantsBean createFromParcel(Parcel source) {
            return new VariantsBean(source);
        }

        @Override
        public VariantsBean[] newArray(int size) {
            return new VariantsBean[size];
        }
    };

    public VariantsBean(VariantsBean source) {
        this.id = source.id;
        this.product_id = source.product_id;
        this.title = source.title;
        this.price = source.price;
        this.sku = source.sku;
        this.position = source.position;
        this.inventory_policy = source.inventory_policy;
        this.fulfillment_service = source.fulfillment_service;
        this.inventory_management = source.inventory_management;
        this.option1 = source.option1;
        this.created_at = source.created_at;
        this.updated_at = source.updated_at;
        this.barcode = source.barcode;
        this.grams = source.grams;
        this.weight = source.weight;
        this.weight_unit = source.weight_unit;
        this.inventory_item_id = source.inventory_item_id;
        this.inventory_quantity = source.inventory_quantity;
        this.old_inventory_quantity = source.old_inventory_quantity;
        this.admin_graphql_api_id = source.admin_graphql_api_id;
    }

    protected VariantsBean(Parcel source) {
        this.id = source.readLong();
        this.product_id = source.readLong();
        this.title = source.readString();
        this.price = source.readString();
        this.sku = source.readString();
        this.position = source.readInt();
        this.inventory_policy = source.readString();
        this.fulfillment_service = source.readString();
        this.inventory_management = source.readString();
        this.option1 = source.readString();
        this.created_at = source.readString();
        this.updated_at = source.readString();
        this.barcode = source.readString();
        this.grams = source.readInt();
        this.weight = source.readString();
        this.weight_unit = source.readString();
        this.inventory_item_id = source.readInt();
        this.inventory_quantity = source.readInt();
        this.old_inventory_quantity = source.readInt();
        this.admin_graphql_api_id = source.readString();
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String getInventory_policy() {
        return inventory_policy;
    }

    public void setInventory_policy(String inventory_policy) {
        this.inventory_policy = inventory_policy;
    }

    public Object getCompare_at_price() {
        return compare_at_price;
    }

    public void setCompare_at_price(Object compare_at_price) {
        this.compare_at_price = compare_at_price;
    }

    public String getFulfillment_service() {
        return fulfillment_service;
    }

    public void setFulfillment_service(String fulfillment_service) {
        this.fulfillment_service = fulfillment_service;
    }

    public String getInventory_management() {
        return inventory_management;
    }

    public void setInventory_management(String inventory_management) {
        this.inventory_management = inventory_management;
    }

    public String getOption1() {
        return option1;
    }

    public void setOption1(String option1) {
        this.option1 = option1;
    }

    public Object getOption2() {
        return option2;
    }

    public void setOption2(Object option2) {
        this.option2 = option2;
    }

    public Object getOption3() {
        return option3;
    }

    public void setOption3(Object option3) {
        this.option3 = option3;
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

    public boolean isTaxable() {
        return taxable;
    }

    public void setTaxable(boolean taxable) {
        this.taxable = taxable;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public int getGrams() {
        return grams;
    }

    public void setGrams(int grams) {
        this.grams = grams;
    }

    public Object getImage_id() {
        return image_id;
    }

    public void setImage_id(Object image_id) {
        this.image_id = image_id;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getWeight_unit() {
        return weight_unit;
    }

    public void setWeight_unit(String weight_unit) {
        this.weight_unit = weight_unit;
    }

    public long getInventory_item_id() {
        return inventory_item_id;
    }

    public void setInventory_item_id(long inventory_item_id) {
        this.inventory_item_id = inventory_item_id;
    }

    public int getInventory_quantity() {
        return inventory_quantity;
    }

    public void setInventory_quantity(int inventory_quantity) {
        this.inventory_quantity = inventory_quantity;
    }

    public int getOld_inventory_quantity() {
        return old_inventory_quantity;
    }

    public void setOld_inventory_quantity(int old_inventory_quantity) {
        this.old_inventory_quantity = old_inventory_quantity;
    }

    public boolean isRequires_shipping() {
        return requires_shipping;
    }

    public void setRequires_shipping(boolean requires_shipping) {
        this.requires_shipping = requires_shipping;
    }

    public String getAdmin_graphql_api_id() {
        return admin_graphql_api_id;
    }

    public void setAdmin_graphql_api_id(String admin_graphql_api_id) {
        this.admin_graphql_api_id = admin_graphql_api_id;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeLong(this.id);
        dest.writeLong(this.product_id);
        dest.writeString(this.title);
        dest.writeString(this.price);
        dest.writeString(this.sku);
        dest.writeInt(this.position);
        dest.writeString(this.inventory_policy);
        dest.writeString(this.fulfillment_service);
        dest.writeString(this.inventory_management);
        dest.writeString(this.option1);
        dest.writeString(this.created_at);
        dest.writeString(this.updated_at);
        dest.writeString(this.barcode);
        dest.writeInt(this.grams);
        dest.writeString(this.weight);
        dest.writeString(this.weight_unit);
        dest.writeLong(this.inventory_item_id);
        dest.writeInt(this.inventory_quantity);
        dest.writeInt(this.old_inventory_quantity);
        dest.writeString(this.admin_graphql_api_id);
    }
}
