package com.example.lab5_mob403_thanhnvph07603.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class User {
    @SerializedName("nsid")
    @Expose
    private String nsid;
    @SerializedName("path_alias")
    @Expose
    private String path_alias;
    @SerializedName("username")
    @Expose
    private String username;
    @SerializedName("ispro")
    @Expose
    private Integer ispro;
    @SerializedName("is_ad_free")
    @Expose
    private Integer is_ad_free;
    @SerializedName("is_ad_delete")
    @Expose
    private Integer is_ad_delete;
    @SerializedName("realname")
    @Expose
    private String realname;
    @SerializedName("datecreate")
    @Expose
    private String datecreate;

    public String getNsid() {
        return nsid;
    }

    public void setNsid(String nsid) {
        this.nsid = nsid;
    }

    public String getPath_alias() {
        return path_alias;
    }

    public void setPath_alias(String path_alias) {
        this.path_alias = path_alias;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getIspro() {
        return ispro;
    }

    public void setIspro(Integer ispro) {
        this.ispro = ispro;
    }

    public Integer getIs_ad_free() {
        return is_ad_free;
    }

    public void setIs_ad_free(Integer is_ad_free) {
        this.is_ad_free = is_ad_free;
    }

    public Integer getIs_ad_delete() {
        return is_ad_delete;
    }

    public void setIs_ad_delete(Integer is_ad_delete) {
        this.is_ad_delete = is_ad_delete;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getDatecreate() {
        return datecreate;
    }

    public void setDatecreate(String datecreate) {
        this.datecreate = datecreate;
    }
}
