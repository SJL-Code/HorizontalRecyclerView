package com.gzwlw.recyclerview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context context;
    private ArrayList<Drawable> imageList;

    public RecyclerViewAdapter(Context context, ArrayList<Drawable> imageList) {
        this.context = context;
        this.imageList = imageList;
    }

    @Override
    public int getItemCount() {
        return imageList.size();
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        RecyclerView.ViewHolder viewHolder;

        View view = LayoutInflater.from(context).inflate(R.layout.item_layout,null);
        viewHolder = new MyViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        MyViewHolder myViewHolder = (MyViewHolder) holder;
        myViewHolder.imageView.setImageDrawable(imageList.get(position));
    }

    private class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;

        private MyViewHolder(View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageView);
        }
    }
}
