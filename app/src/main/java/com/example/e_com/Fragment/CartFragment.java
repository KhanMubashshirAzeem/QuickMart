package com.example.e_com.Fragment;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.e_com.Adapter.CartAdapter;
import com.example.e_com.Model.CartModel;
import com.example.e_com.R;
import com.example.e_com.databinding.FragmentCartBinding;

import java.util.ArrayList;
import java.util.List;

public class CartFragment extends Fragment {
    FragmentCartBinding binding;
    private List<CartModel> cartItems;
    private CartAdapter cartAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment using ViewBinding
        binding = FragmentCartBinding.inflate(inflater, container, false);

        // Initialize cart items with sample data
        cartItems = new ArrayList<>();
        cartItems.add(new CartModel("GOOGLE Nest Mini", "Product Model", R.drawable.img_4, 70.99, 2));
        cartItems.add(new CartModel("GOOGLE Nest Mini", "Product Model", R.drawable.img_2, 70.99, 1));
        cartItems.add(new CartModel("GOOGLE Nest Mini", "Product Model", R.drawable.img_3, 70.99, 3));
        cartItems.add(new CartModel("GOOGLE Nest Mini", "Product Model", R.drawable.img_4, 70.99, 2));
        cartItems.add(new CartModel("GOOGLE Nest Mini", "Product Model", R.drawable.img_2, 70.99, 1));
        cartItems.add(new CartModel("GOOGLE Nest Mini", "Product Model", R.drawable.img_3, 70.99, 3));

        // Set up the RecyclerView
        binding.cartRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        cartAdapter = new CartAdapter(cartItems, getContext());
        binding.cartRecyclerView.setAdapter(cartAdapter);

        return binding.getRoot();
    }
}
