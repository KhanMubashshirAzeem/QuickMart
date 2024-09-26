package com.example.e_com.Adapter;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.e_com.Fragment.ProductFragment;
import com.example.e_com.Model.MainModelItem;
import com.example.e_com.R;
import com.example.e_com.databinding.FragmentProductBinding;

import java.util.List;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.MainViewHolder> {

    private List<MainModelItem> itemList;
    private Context context;

    public MainAdapter(Context context, List<MainModelItem> itemList) {
        this.context = context;
        this.itemList = itemList;
    }

    @NonNull
    @Override
    public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.main_card_view, parent, false);
        return new MainViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MainViewHolder holder, int position) {
        MainModelItem modelItem = itemList.get(position);

        // Load image from URL using Glide
        Glide.with(context)
                .load(modelItem.getImageItem())  // Load the URL
                .into(holder.image);

        holder.name.setText(modelItem.getNameItem());
        holder.price.setText("$" + modelItem.getPriceItem());
        holder.category.setText(modelItem.getCategoryItem());
        holder.model.setText(modelItem.getModelItem());

        // Set onClickListener for each item (if needed)
    }



    @Override
    public int getItemCount() {
        return itemList.size();
    }

    public static class MainViewHolder extends RecyclerView.ViewHolder {
        ImageView image, like;
        TextView price, name, category, model;

        public MainViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.imageMain);
            like = itemView.findViewById(R.id.likeMain);
            price = itemView.findViewById(R.id.priceMain);
            name = itemView.findViewById(R.id.nameMain);
            category = itemView.findViewById(R.id.categoryMain);
            model = itemView.findViewById(R.id.modalMain);
        }
    }
}
