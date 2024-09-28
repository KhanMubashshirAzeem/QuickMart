package com.example.e_com.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.e_com.Model.MainModelItem;
import com.example.e_com.R;

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
        // Inflate the layout for each item in the RecyclerView
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.main_card_view, parent, false);
        return new MainViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MainViewHolder holder, int position) {
        MainModelItem modelItem = itemList.get(position);

        // Load image from URL using Glide
        Glide.with(context)
                .load(modelItem.getImage())
                .into(holder.image);

        // Set text for the views
        holder.name.setText(modelItem.getTitle());
        holder.price.setText("$" + modelItem.getPrice());
        holder.category.setText(modelItem.getCategory());
        holder.model.setText("Model: " + modelItem.getDescription());

        // Set rating and count separately
        holder.rating.setText("" + modelItem.getRating().getRate());
        holder.ratingCount.setText("(" + modelItem.getRating().getCount() + " reviews)");
    }

    @Override
    public int getItemCount() {
        return itemList.size();  // Return the total number of items in the list
    }

    public static class MainViewHolder extends RecyclerView.ViewHolder {
        ImageView image, like;
        TextView price, name, category, model, rating, ratingCount;

        public MainViewHolder(@NonNull View itemView) {
            super(itemView);
            // Initialize views
            image = itemView.findViewById(R.id.imageMain);
            like = itemView.findViewById(R.id.likeMain);
            price = itemView.findViewById(R.id.priceMain);
            name = itemView.findViewById(R.id.nameMain);
            category = itemView.findViewById(R.id.categoryMain);
            model = itemView.findViewById(R.id.modalMain);
            rating = itemView.findViewById(R.id.ratingMain);
            ratingCount = itemView.findViewById(R.id.ratingCountMain);
        }
    }
}
