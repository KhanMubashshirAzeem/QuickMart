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

public class TopProductAdapter extends RecyclerView.Adapter<TopProductAdapter.TopProductViewHolder> {

    private Context context;
    private List<MainModelItem> topProductList;

    public TopProductAdapter(Context context, List<MainModelItem> topProductList) {
        this.context = context;
        this.topProductList = topProductList;
    }

    @NonNull
    @Override
    public TopProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.top_product_item, parent, false);
        return new TopProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TopProductViewHolder holder, int position) {
        MainModelItem product = topProductList.get(position);
        holder.productName.setText(product.getTitle());
        holder.productPrice.setText("$" + product.getPrice());
        holder.productCategory.setText(product.getCategory());

        // Load product image using Glide
        Glide.with(context).load(product.getImage()).into(holder.productImage);

        // Set rating and rating count
        holder.ratingTop.setText("Rating: " + product.getRating().getRate());
        holder.ratingCountTop.setText("(" + product.getRating().getCount() + " reviews)");
    }

    @Override
    public int getItemCount() {
        return topProductList.size();
    }

    public class TopProductViewHolder extends RecyclerView.ViewHolder {
        TextView productName, productPrice, productCategory, ratingTop, ratingCountTop;
        ImageView productImage;

        public TopProductViewHolder(@NonNull View itemView) {
            super(itemView);
            productName = itemView.findViewById(R.id.productNameTop);
            productPrice = itemView.findViewById(R.id.productPriceTop);
            productImage = itemView.findViewById(R.id.productImageTop);
            productCategory = itemView.findViewById(R.id.productCategoryTop);
            ratingTop = itemView.findViewById(R.id.ratingTop);
            ratingCountTop = itemView.findViewById(R.id.ratingCountTop);
        }
    }
}
