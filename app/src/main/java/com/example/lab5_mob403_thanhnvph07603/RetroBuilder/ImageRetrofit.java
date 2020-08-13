package com.example.lab5_mob403_thanhnvph07603.RetroBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ImageRetrofit {
    private static final String BASE_URL = "https://www.flickr.com/";
    public static ImageService service;


    public static ImageService serviceDownload;

    public static ImageService getInstance() {

        if (service == null) {
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
            service = retrofit.create(ImageService.class);
        }
        return service;
    }
}
