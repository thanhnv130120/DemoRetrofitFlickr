package com.example.lab5_mob403_thanhnvph07603.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FGallery {

    @SerializedName("galleries")
    @Expose
    private Galleries galleries;

    @SerializedName("stat")
    @Expose
    private String stat;

    public Galleries getGalleries() {
        return galleries;
    }

    public void setGalleries(Galleries galleries) {
        this.galleries = galleries;
    }

    public String getStat() {
        return stat;
    }

    public void setStat(String stat) {
        this.stat = stat;
    }
}
