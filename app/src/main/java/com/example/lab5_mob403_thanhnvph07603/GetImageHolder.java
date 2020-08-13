package com.example.lab5_mob403_thanhnvph07603;

import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class GetImageHolder extends RecyclerView.ViewHolder {

    public ImageView imgImage;

    public GetImageHolder(@NonNull View itemView) {
        super(itemView);
        imgImage = itemView.findViewById(R.id.imgImage);
    }
}
