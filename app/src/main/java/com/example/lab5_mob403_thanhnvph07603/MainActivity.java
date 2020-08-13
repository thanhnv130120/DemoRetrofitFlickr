package com.example.lab5_mob403_thanhnvph07603;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.lab5_mob403_thanhnvph07603.Model.FGallery;
import com.example.lab5_mob403_thanhnvph07603.RetroBuilder.Lab5Retrofit;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity implements Callback<FGallery> {

    private RecyclerView rcImage;
    private static final String FULL_EXTRAS = "views,media,path_alias,url_sq,url_t,url_s,url_q,url_m,url_n,url_z,url_c,url_l,url_o";
    private static final String USER_ID = "189476946@N08";
    private static final String KEY_TOKEN = "4e9ec8efb9660bd2b2b7f102e4fe3a55";
    private static final String GET_GALLERY = "flickr.galleries.getList";
    private int page =1;
    GalleryAdapter galleryAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rcImage = findViewById(R.id.rcImage);

        Lab5Retrofit.getInstance().getListGelle(FULL_EXTRAS,
                "1", USER_ID, "json", KEY_TOKEN, GET_GALLERY, page,
                15).enqueue(this);
    }


    @Override
    public void onResponse(Call<FGallery> call, Response<FGallery> response) {
            galleryAdapter = new GalleryAdapter(MainActivity.this,
                    response.body().getGalleries().getGalleryList());
            LinearLayoutManager linearLayoutManager =
                    new LinearLayoutManager(MainActivity.this);
            rcImage.setLayoutManager(linearLayoutManager);
            rcImage.setAdapter(galleryAdapter);
    }

    @Override
    public void onFailure(Call<FGallery> call, Throwable t) {

    }
}