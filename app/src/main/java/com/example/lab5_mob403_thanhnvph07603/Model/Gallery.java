package com.example.lab5_mob403_thanhnvph07603.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Gallery {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("gallery_id")
    @Expose
    private String gallery_id;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("owner")
    @Expose
    private String owner;
    @SerializedName("username")
    @Expose
    private String username;
    @SerializedName("iconsever")
    @Expose
    private String iconsever;
    @SerializedName("iconfarm")
    @Expose
    private Integer iconfarm;
    @SerializedName("primary_photo_id")
    @Expose
    private String primary_photo_id;
    @SerializedName("date_create")
    @Expose
    private String date_create;
    @SerializedName("date_update")
    @Expose
    private String date_update;
    @SerializedName("count_photos")
    @Expose
    private Integer count_photos;
    @SerializedName("count_videos")
    @Expose
    private Integer count_videos;
    @SerializedName("count_total")
    @Expose
    private Integer count_total;
    @SerializedName("count_views")
    @Expose
    private Integer count_views;
    @SerializedName("count_comments")
    @Expose
    private Integer count_comments;

    @SerializedName("title")
    @Expose
    private Title title;

    @SerializedName("description")
    @Expose
    private Description description;

    @SerializedName("sort_group")
    @Expose
    private Integer sort_group;

    @SerializedName("primary_photo_sever")
    @Expose
    private String primary_photo_sever;
    @SerializedName("primary_photo_farm")
    @Expose
    private Integer primary_photo_farm;
    @SerializedName("primary_photo_secret")
    @Expose
    private String primary_photo_secret;

    @SerializedName("primary_photo_extra")
    @Expose
    private PrimaryPhotoExtra primaryPhotoExtra;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGallery_id() {
        return gallery_id;
    }

    public void setGallery_id(String gallery_id) {
        this.gallery_id = gallery_id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getIconsever() {
        return iconsever;
    }

    public void setIconsever(String iconsever) {
        this.iconsever = iconsever;
    }

    public Integer getIconfarm() {
        return iconfarm;
    }

    public void setIconfarm(Integer iconfarm) {
        this.iconfarm = iconfarm;
    }

    public String getPrimary_photo_id() {
        return primary_photo_id;
    }

    public void setPrimary_photo_id(String primary_photo_id) {
        this.primary_photo_id = primary_photo_id;
    }

    public String getDate_create() {
        return date_create;
    }

    public void setDate_create(String date_create) {
        this.date_create = date_create;
    }

    public String getDate_update() {
        return date_update;
    }

    public void setDate_update(String date_update) {
        this.date_update = date_update;
    }

    public Integer getCount_photos() {
        return count_photos;
    }

    public void setCount_photos(Integer count_photos) {
        this.count_photos = count_photos;
    }

    public Integer getCount_videos() {
        return count_videos;
    }

    public void setCount_videos(Integer count_videos) {
        this.count_videos = count_videos;
    }

    public Integer getCount_total() {
        return count_total;
    }

    public void setCount_total(Integer count_total) {
        this.count_total = count_total;
    }

    public Integer getCount_views() {
        return count_views;
    }

    public void setCount_views(Integer count_views) {
        this.count_views = count_views;
    }

    public Integer getCount_comments() {
        return count_comments;
    }

    public void setCount_comments(Integer count_comments) {
        this.count_comments = count_comments;
    }

    public Title getTitle() {
        return title;
    }

    public void setTitle(Title tile) {
        this.title = tile;
    }

    public Description getDescription() {
        return description;
    }

    public void setDescription(Description description) {
        this.description = description;
    }

    public Integer getSort_group() {
        return sort_group;
    }

    public void setSort_group(Integer sort_group) {
        this.sort_group = sort_group;
    }

    public String getPrimary_photo_sever() {
        return primary_photo_sever;
    }

    public void setPrimary_photo_sever(String primary_photo_sever) {
        this.primary_photo_sever = primary_photo_sever;
    }

    public Integer getPrimary_photo_farm() {
        return primary_photo_farm;
    }

    public void setPrimary_photo_farm(Integer primary_photo_farm) {
        this.primary_photo_farm = primary_photo_farm;
    }

    public String getPrimary_photo_secret() {
        return primary_photo_secret;
    }

    public void setPrimary_photo_secret(String primary_photo_secret) {
        this.primary_photo_secret = primary_photo_secret;
    }

    public PrimaryPhotoExtra getPrimaryPhotoExtra() {
        return primaryPhotoExtra;
    }

    public void setPrimaryPhotoExtra(PrimaryPhotoExtra primaryPhotoExtra) {
        this.primaryPhotoExtra = primaryPhotoExtra;
    }
}
