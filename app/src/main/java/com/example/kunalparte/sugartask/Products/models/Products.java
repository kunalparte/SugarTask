package com.example.kunalparte.sugartask.Products.models;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.RequiresApi;

import java.util.List;

public class Products implements Parcelable {


    public static Creator<Products> CREATER = new Creator<Products>() {
        @Override
        public Products createFromParcel(Parcel source) {
            return new Products(source);
        }

        @Override
        public Products[] newArray(int size) {
            return new Products[size];
        }
    };
    /**
     * id : 2367560286291
     * title : Uptown Curl Lengthening Mascara - 01 Black Beauty (Black)
     * body_html : <div class="col-md-12 video" style="text-align: left;"><iframe class="youtubevideo" width="420" height="300" src="https://www.youtube.com/embed/fanjqo3RIMU" frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen=""></iframe></div>
     <p>Get ready to stir up a storm with a wink!<br> <br>Here is theÂ <strong>SUGAR Uptown Curl Lengthening MascaraÂ </strong>- fulfilling all your lash fantasies. Caution: You are about to be the center of attraction with this volumizing, lengthening &amp; curling mascara that comes with a hi-tech curved brush &amp; an extreme black formula. This magic wand easily pulls through each lash smoothly and lays down a generous amount of product in one swipe - giving your lashes a gravity defying lift, an instant curl and a dramatic voluminous look thatâ€™s smudge-proof and clump-free, lasting for 8+ hours.</p>
     <p><strong>How to Apply:</strong>Â Prepare for the lash lift! Hold your mascara and position the wand in such a way that the claw brush spoons the curve of your lashes. Starting from the root, sweep the wand upward, guiding the shape of your lashes. For extra definition and fullness, wiggle the brush from side to side. Apply multiple coats for volume. Now move to your lower lashes: smoothen the lashes with the hollow side of the brush, from the center to the outer corner and return towards the inner corner of the eyelid. The result: incredible control for insane lashes!</p>
     <p><strong>Benefits:Â </strong>Create fluttery fullness with this ergonomically curved brush with fine bristles that coats the product on to each lash giving special attention to the inner lashes, finally saving you from the struggle to maneuver it in all different angles. The ultra-creamy, fibrous texture comes in a formula thatâ€™s not too dry, not too wet, lightweight and intensely black. This unique formula also boosts the growth of your natural lashes, fuels thickness and strength on regular use.</p>
     <p><strong>Additional Details:</strong>Â TheÂ <strong>SUGAR Uptown Curl Lengthening MascaraÂ </strong>is paraben-free. Easy removal with warm water or makeup remover. One swipe of either loosens the film and allows the formula to slide off easily.<br> <br>Available in the shade "<strong>01 Black Beauty (Black)</strong>".<br><br>Made in Taiwan.<br>Net Weight: 5g<br>Â <br> <strong>List of Ingredients:</strong>Â Water, Styrene/Acrylates Copolymer, Synthetic Beeswax, Candelilla Cera, Polyester-5, Palmitic Acid, Paraffin, Oryza Sativa (Rice Bran) Wax, Stearic Acid, Triethanolamine, Ammonium Acrylates Copolymer, Nylon-6, Glycol Montanate, 1,3-Butylene Glycol, Phenoxyethanol, Copernicia Cerifera Cera, Sudium Dehydrocetate, Caprylyl Glycol and Hydrated Silica. May contain CI 77266 (D&amp;C Black 2).</p>
     * vendor : SUGAR Cosmetics
     * product_type : Mascara
     * created_at : 2018-12-25T10:14:43+05:30
     * handle : uptown-curl-lengthening-mascara-01-black-beauty
     * updated_at : 2019-02-21T12:10:56+05:30
     * published_at : 2018-12-31T10:44:28+05:30
     * template_suffix :
     * tags :
     * published_scope : web
     * admin_graphql_api_id : gid://shopify/Product/2367560286291
     * variants : [{"id":21267210207315,"product_id":2367560286291,"title":"Default Title","price":"499.00","sku":"8906090495653","position":1,"inventory_policy":"deny","compare_at_price":null,"fulfillment_service":"manual","inventory_management":"shopify","option1":"Default Title","option2":null,"option3":null,"created_at":"2018-12-25T10:14:43+05:30","updated_at":"2019-02-21T12:10:56+05:30","taxable":true,"barcode":"","grams":0,"image_id":null,"weight":0,"weight_unit":"kg","inventory_item_id":21778187649107,"inventory_quantity":7595,"old_inventory_quantity":7595,"requires_shipping":true,"admin_graphql_api_id":"gid://shopify/ProductVariant/21267210207315"}]
     * options : [{"id":3271842234451,"product_id":2367560286291,"name":"Title","position":1,"values":["Default Title"]}]
     * images : [{"id":7164295446611,"product_id":2367560286291,"position":1,"created_at":"2018-12-31T12:59:02+05:30","updated_at":"2018-12-31T12:59:39+05:30","alt":null,"width":1025,"height":1440,"src":"https://cdn.shopify.com/s/files/1/0906/2558/products/New-Mascara02-compressor_1.png?v=1546241379","variant_ids":[],"admin_graphql_api_id":"gid://shopify/ProductImage/7164295446611"},{"id":7164295413843,"product_id":2367560286291,"position":2,"created_at":"2018-12-31T12:59:01+05:30","updated_at":"2018-12-31T12:59:39+05:30","alt":null,"width":1025,"height":1440,"src":"https://cdn.shopify.com/s/files/1/0906/2558/products/New-Mascara01-compressor_1.png?v=1546241379","variant_ids":[],"admin_graphql_api_id":"gid://shopify/ProductImage/7164295413843"},{"id":7164295512147,"product_id":2367560286291,"position":3,"created_at":"2018-12-31T12:59:03+05:30","updated_at":"2018-12-31T12:59:39+05:30","alt":null,"width":1025,"height":1440,"src":"https://cdn.shopify.com/s/files/1/0906/2558/products/New-Mascara03-compressor.png?v=1546241379","variant_ids":[],"admin_graphql_api_id":"gid://shopify/ProductImage/7164295512147"},{"id":7164295708755,"product_id":2367560286291,"position":4,"created_at":"2018-12-31T12:59:04+05:30","updated_at":"2018-12-31T12:59:39+05:30","alt":null,"width":1025,"height":1440,"src":"https://cdn.shopify.com/s/files/1/0906/2558/products/New-Mascara04-compressor.png?v=1546241379","variant_ids":[],"admin_graphql_api_id":"gid://shopify/ProductImage/7164295708755"}]
     * image : {"id":7164295446611,"product_id":2367560286291,"position":1,"created_at":"2018-12-31T12:59:02+05:30","updated_at":"2018-12-31T12:59:39+05:30","alt":null,"width":1025,"height":1440,"src":"https://cdn.shopify.com/s/files/1/0906/2558/products/New-Mascara02-compressor_1.png?v=1546241379","variant_ids":[],"admin_graphql_api_id":"gid://shopify/ProductImage/7164295446611"}
     */

    private long id;
    private String title;
    private String body_html;
    private String vendor;
    private String product_type;
    private String created_at;
    private String handle;
    private String updated_at;
    private String published_at;
    private String template_suffix;
    private String tags;
    private String published_scope;
    private String admin_graphql_api_id;
    private ImagesBean image;
    private List<VariantsBean> variants;
    private List<OptionsBean> options;
    private List<ImagesBean> images;

    public Products(Products others){
        this.id = others.id;
        this.title = others.title;
        this.body_html = others.body_html;
        this.vendor = others.vendor;
        this.product_type = others.product_type;
        this.created_at = others.created_at;
        this.handle = others.handle;
        this.updated_at = others.updated_at;
        this.published_at = others.published_at;
        this.template_suffix = others.template_suffix;
        this.tags = others.tags;
        this.published_scope = others.published_scope;
        this.admin_graphql_api_id = others.admin_graphql_api_id;
        this.variants = others.variants; ;
        this.options = others.options;
        this.images = others.images;
        this.image = others.image;

    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    protected Products(Parcel source) {
        this.id = source.readLong();
        this.title = source.readString();
        this.body_html = source.readString();
        this.vendor = source.readString();
        this.product_type = source.readString();
        this.created_at = source.readString();
        this.handle = source.readString();
        this.updated_at = source.readString();
        this.published_at = source.readString();
        this.template_suffix = source.readString();
        this.tags = source.readString();
        this.published_scope = source.readString();
        this.admin_graphql_api_id = source.readString();
        this.variants = source.createTypedArrayList(VariantsBean.CREATOR); ;
        this.options = source.createTypedArrayList(OptionsBean.CREATOR);
        this.images = source.createTypedArrayList(ImagesBean.CREATOR);
        this.image = (ImagesBean) source.readValue(ImagesBean.class.getClassLoader());
    }

    public static Creator<Products> CREATOR = new Creator<Products>() {
        @Override
        public Products createFromParcel(Parcel source) {
            return new Products(source);
        }

        @Override
        public Products[] newArray(int size) {
            return new Products[size];
        }
    };

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody_html() {
        return body_html;
    }

    public void setBody_html(String body_html) {
        this.body_html = body_html;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getProduct_type() {
        return product_type;
    }

    public void setProduct_type(String product_type) {
        this.product_type = product_type;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getHandle() {
        return handle;
    }

    public void setHandle(String handle) {
        this.handle = handle;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public String getPublished_at() {
        return published_at;
    }

    public void setPublished_at(String published_at) {
        this.published_at = published_at;
    }

    public String getTemplate_suffix() {
        return template_suffix;
    }

    public void setTemplate_suffix(String template_suffix) {
        this.template_suffix = template_suffix;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getPublished_scope() {
        return published_scope;
    }

    public void setPublished_scope(String published_scope) {
        this.published_scope = published_scope;
    }

    public String getAdmin_graphql_api_id() {
        return admin_graphql_api_id;
    }

    public void setAdmin_graphql_api_id(String admin_graphql_api_id) {
        this.admin_graphql_api_id = admin_graphql_api_id;
    }

    public ImagesBean getImage() {
        return image;
    }

    public void setImage(ImagesBean image) {
        this.image = image;
    }

    public List<VariantsBean> getVariants() {
        return variants;
    }

    public void setVariants(List<VariantsBean> variants) {
        this.variants = variants;
    }

    public List<OptionsBean> getOptions() {
        return options;
    }

    public void setOptions(List<OptionsBean> options) {
        this.options = options;
    }

    public List<ImagesBean> getImages() {
        return images;
    }

    public void setImages(List<ImagesBean> images) {
        this.images = images;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeLong(this.id);
        dest.writeString(this.title);
        dest.writeString(this.body_html);
        dest.writeString(this.vendor);
        dest.writeString(this.product_type);
        dest.writeString(this.created_at);
        dest.writeString(this.handle);
        dest.writeString(this.updated_at);
        dest.writeString(this.published_at);
        dest.writeString(this.template_suffix);
        dest.writeString(this.tags);
        dest.writeString(this.published_scope);
        dest.writeString(admin_graphql_api_id);
        dest.writeTypedList(this.variants);
        dest.writeTypedList(this.options);
        dest.writeTypedList(this.images);
        dest.writeValue(this.image);
    }
}
