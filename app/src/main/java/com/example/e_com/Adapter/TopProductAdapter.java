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
import com.example.e_com.Model.TopProductModel;
import com.example.e_com.R;

import java.util.List;

public class TopProductAdapter extends RecyclerView.Adapter<TopProductAdapter.TopProductViewHolder> {

    private Context context;
    private List<TopProductModel> topProductList;

    public TopProductAdapter(Context context, List<TopProductModel> topProductList) {
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
        TopProductModel product = topProductList.get(position);
        holder.productName.setText(product.getName());
        holder.productPrice.setText("$" + product.getPrice());
        holder.productCategory.setText(product.getCategory());
        holder.productModel.setText(product.getModel());

        Glide.with(context).load(product.getImage()).into(holder.productImage);
    }

    @Override
    public int getItemCount() {
        return topProductList.size();
    }

    public class TopProductViewHolder extends RecyclerView.ViewHolder {
        TextView productName, productPrice,productModel,productCategory;
        ImageView productImage,favIcon;

        public TopProductViewHolder(@NonNull View itemView) {
            super(itemView);
            productName = itemView.findViewById(R.id.productNameTop);
            productPrice = itemView.findViewById(R.id.productPriceTop);
            productImage = itemView.findViewById(R.id.productImageTop);
            productModel = itemView.findViewById(R.id.productModelTop);
            productCategory = itemView.findViewById(R.id.productCategoryTop);
            favIcon = itemView.findViewById(R.id.favoriteIconTop);

        }
    }
}
