package com.example.lab5_mob403_thanhnvph07603;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.lab5_mob403_thanhnvph07603.Model.FPhoto;
import com.example.lab5_mob403_thanhnvph07603.RetroBuilder.ImageRetrofit;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class GetImageActivity extends AppCompatActivity implements Callback<FPhoto> {
    RecyclerView rcGetImage;
    GetImageAdapter getImageAdapter;

    private static final String FULL_EXTRAS = "views,media,path_alias,url_sq,url_t,url_s,url_q,url_m,url_n,url_z,url_c,url_l,url_o";
    private static final String USER_ID = "189476946@N08";
    private static final String KEY_TOKEN = "4e9ec8efb9660bd2b2b7f102e4fe3a55";
    private static final String GET_PHOTO = "flickr.galleries.getPhotos";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_image);
        rcGetImage = findViewById(R.id.rcGetImage);

        ImageRetrofit.getInstance().getListImage(FULL_EXTRAS, "1", "72157715258724557", USER_ID, "json", KEY_TOKEN, GET_PHOTO, 1, 10).enqueue(this);

    }

    @Override
    public void onResponse(Call<FPhoto> call, Response<FPhoto> response) {
        getImageAdapter = new GetImageAdapter(GetImageActivity.this,
                response.body().getPhotos().getPhoto());
        LinearLayoutManager linearLayoutManager =
                new LinearLayoutManager(GetImageActivity.this);
        rcGetImage.setLayoutManager(linearLayoutManager);
        rcGetImage.setAdapter(getImageAdapter);
    }

    @Override
    public void onFailure(Call<FPhoto> call, Throwable t) {

    }
}