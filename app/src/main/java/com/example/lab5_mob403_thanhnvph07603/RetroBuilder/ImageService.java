package com.example.lab5_mob403_thanhnvph07603.RetroBuilder;

import com.example.lab5_mob403_thanhnvph07603.Model.FPhoto;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ImageService {
    @GET("services/rest/")
    Call<FPhoto> getListImage(@Query("extras") String extras,
                              @Query("nojsoncallback") String nojsoncallback,
                              @Query("galleryid") String galleryid,
                              @Query("userid") String userid,
                              @Query("format") String format,
                              @Query("api_key") String api_key,
                              @Query("method") String method,
                              @Query("page") int page,
                              @Query("per_page") int per_page);
}
