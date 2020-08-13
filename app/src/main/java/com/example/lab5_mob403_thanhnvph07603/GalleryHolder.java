package com.example.lab5_mob403_thanhnvph07603;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class GalleryHolder extends RecyclerView.ViewHolder {

    public ImageView imgItem;
    public TextView tvTitle, tvView;

    public GalleryHolder(@NonNull View itemView) {
        super(itemView);
        imgItem = itemView.findViewById(R.id.imgItem);
        tvTitle = itemView.findViewById(R.id.tvTitle);
        tvView = itemView.findViewById(R.id.tvView);
    }
}
