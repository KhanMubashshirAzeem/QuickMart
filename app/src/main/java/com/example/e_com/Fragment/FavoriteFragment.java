package com.example.e_com.Fragment;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.e_com.Adapter.FavoriteAdapter;
import com.example.e_com.Model.FavoriteModel;
import com.example.e_com.R;
import com.example.e_com.databinding.FragmentFavoriteBinding;

import java.util.ArrayList;
import java.util.List;

public class FavoriteFragment extends Fragment {
    FragmentFavoriteBinding binding;
    private List<FavoriteModel> favoriteList;
    private FavoriteAdapter favoriteAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentFavoriteBinding.inflate(inflater, container, false);
        View rootView = binding.getRoot();

        // Initialize favorite list with sample data (replace with your data)
        favoriteList = new ArrayList<>();

        favoriteList.add(new FavoriteModel("Headphones", "WH-1000XM4", "349.99", R.drawable.img_3));
        favoriteList.add(new FavoriteModel("Smartphone", "Galaxy S21", "999.99", R.drawable.img_2));
        favoriteList.add(new FavoriteModel("Laptop", "MacBook Pro", "1299.99", R.drawable.img_4));
        favoriteList.add(new FavoriteModel("Headphones", "WH-1000XM4", "349.99", R.drawable.img_3));
        favoriteList.add(new FavoriteModel("Smartphone", "Galaxy S21", "999.99", R.drawable.img_2));
        favoriteList.add(new FavoriteModel("Laptop", "MacBook Pro", "1299.99", R.drawable.img_4));

        // Set up the RecyclerView
        binding.favoriteRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        favoriteAdapter = new FavoriteAdapter(getContext(), favoriteList);
        binding.favoriteRecyclerView.setAdapter(favoriteAdapter);

        return rootView;
    }
}
