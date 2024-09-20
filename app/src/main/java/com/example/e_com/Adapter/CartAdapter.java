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
import com.example.e_com.Model.CartModel;
import com.example.e_com.R;

import java.util.List;

public class CartAdapter extends RecyclerView.Adapter<CartAdapter.CartViewHolder> {

    private Context context;
    private List<CartModel> cartList;

    // Updated constructor to use CartModel
    public CartAdapter(List<CartModel> cartList, Context context) {
        this.cartList = cartList;
        this.context = context;
    }

    @NonNull
    @Override
    public CartViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.card_item, parent, false);
        return new CartViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CartViewHolder holder, int position) {
        CartModel currentItem = cartList.get(position);

        holder.productName.setText(currentItem.getProductName());
        holder.productModel.setText(currentItem.getProductModel());
        holder.productPrice.setText("$" + String.valueOf(currentItem.getProductPrice()));

        // Load image using Glide
        Glide.with(context).load(currentItem.getProductImage()).into(holder.productImage);

    }


    @Override
    public int getItemCount() {
        return cartList.size();
    }

    public class CartViewHolder extends RecyclerView.ViewHolder {
        TextView productName, productModel, productPrice;
        ImageView productImage, cartIcon;

        public CartViewHolder(@NonNull View itemView) {
            super(itemView);
            productName = itemView.findViewById(R.id.productName);
            productModel = itemView.findViewById(R.id.productModel);
            productPrice = itemView.findViewById(R.id.productPrice);
            productImage = itemView.findViewById(R.id.productImage);
            cartIcon = itemView.findViewById(R.id.cartIcon);
        }
    }
}
