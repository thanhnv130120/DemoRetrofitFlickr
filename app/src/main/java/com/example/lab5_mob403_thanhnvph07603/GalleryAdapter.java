package com.example.lab5_mob403_thanhnvph07603;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lab5_mob403_thanhnvph07603.Model.Gallery;

import java.util.List;

public class GalleryAdapter extends RecyclerView.Adapter<GalleryHolder> {

    Context context;
    List<Gallery> galleryList;


    public GalleryAdapter(Context context, List<Gallery> galleryList) {
        this.context = context;
        this.galleryList = galleryList;
    }

    @NonNull
    @Override
    public GalleryHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_image, parent, false);
        GalleryHolder galleryHolder = new GalleryHolder(view);

        return galleryHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull GalleryHolder holder, int position) {
        Gallery gallery = galleryList.get(position);
        holder.tvTitle.setText(gallery.getTitle().getTitle()+"");
        String GALL_ID = gallery.getGallery_id()+"";

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context,GetImageActivity.class);
                intent.putExtra("Gall_key",GALL_ID);
                context.startActivity(intent);

            }
        });

    }

    @Override
    public int getItemCount() {
        return galleryList.size();
    }
}
