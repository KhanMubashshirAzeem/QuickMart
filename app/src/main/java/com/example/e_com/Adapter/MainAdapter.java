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

        Glide.with(context).load(modelItem.getImageItem()).into(holder.image);


        holder.name.setText(modelItem.getNameItem());
        holder.price.setText(modelItem.getPriceItem());
        holder.category.setText(modelItem.getCategoryItem());
        holder.model.setText(modelItem.getModelItem());

//        // Set onClickListener for each item
//        holder.itemView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                // Create a new ProductFragment instance
//                ProductFragment productFragment = new ProductFragment();
//
//                // Prepare data to send to the fragment
//                Bundle bundle = new Bundle();
//                bundle.putString("product_name", modelItem.getNameItem());
//                bundle.putString("product_price", modelItem.getPriceItem());
//                bundle.putString("product_image", modelItem.getImageItem());
//                bundle.putString("product_category", modelItem.getCategoryItem());
//                bundle.putString("product_model", modelItem.getModelItem());
//
//                // Set the arguments to the fragment
//                productFragment.setArguments(bundle);
//
//                // Perform fragment transaction to replace the current fragment with ProductFragment
//                FragmentManager fragmentManager = ((AppCompatActivity) context).getSupportFragmentManager();
//                fragmentManager.beginTransaction()
//                        .replace(R.id.fragmentContainerView, productFragment)
//                        .addToBackStack(null)
//                        .commit();
//            }
//        });


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
