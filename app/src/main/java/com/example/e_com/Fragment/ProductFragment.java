package com.example.e_com.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.example.e_com.R;
import com.example.e_com.databinding.FragmentProductBinding;

public class ProductFragment extends Fragment {
    FragmentProductBinding productBinding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        productBinding = FragmentProductBinding.inflate(inflater, container, false);

        // Retrieve the arguments passed from the adapter
        if (getArguments() != null) {
            String productName = getArguments().getString("product_name");
            String productPrice = getArguments().getString("product_price");
            String productImage = getArguments().getString("product_image");
            String productCategory = getArguments().getString("product_category");
            String productModel = getArguments().getString("product_model");

            // Display the product details in your fragment views
            productBinding.nameProduct.setText(productName);
            productBinding.priceProduct.setText(productPrice);
            productBinding.productCategory.setText(productCategory);
            productBinding.modalProduct.setText(productModel);

            // Load the product image using Glide
            Glide.with(getContext())
                    .load(productImage)
                    .into(productBinding.imageProduct);
        }

        return productBinding.getRoot();
    }
}