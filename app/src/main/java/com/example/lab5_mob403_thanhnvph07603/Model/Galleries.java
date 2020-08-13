package com.example.lab5_mob403_thanhnvph07603.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Galleries {

    @SerializedName("total")
    @Expose
    private Integer total;
    @SerializedName("per_page")
    @Expose
    private Integer per_page;
    @SerializedName("user_id")
    @Expose
    private String user_id;
    @SerializedName("continuation")
    @Expose
    private double continuation;
    @SerializedName("gallery")
    @Expose
    private List<Gallery> galleryList;

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getPer_page() {
        return per_page;
    }

    public void setPer_page(Integer per_page) {
        this.per_page = per_page;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public double getContinuation() {
        return continuation;
    }

    public void setContinuation(double continuation) {
        this.continuation = continuation;
    }

    public List<Gallery> getGalleryList() {
        return galleryList;
    }

    public void setGalleryList(List<Gallery> galleryList) {
        this.galleryList = galleryList;
    }
}
