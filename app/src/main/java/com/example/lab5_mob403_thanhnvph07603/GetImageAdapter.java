package com.example.lab5_mob403_thanhnvph07603;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lab5_mob403_thanhnvph07603.Model.Photo;
import com.squareup.picasso.Picasso;

import java.util.List;

public class GetImageAdapter extends RecyclerView.Adapter<GetImageHolder> {

    Context context;
    List<Photo> photoList;

    public GetImageAdapter(Context context, List<Photo> photoList) {
        this.context = context;
        this.photoList = photoList;
    }

    @NonNull
    @Override
    public GetImageHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_getimage, parent, false);
        GetImageHolder getImageHolder = new GetImageHolder(view);

        return getImageHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull GetImageHolder holder, int position) {
        Photo photo = photoList.get(position);
        Picasso.get().load(photo.getUrlS()).into(holder.imgImage);
    }

    @Override
    public int getItemCount() {
        return photoList.size();
    }
}
