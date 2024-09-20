package com.example.e_com.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.e_com.Adapter.MainAdapter;
import com.example.e_com.Model.MainModelItem;
import com.example.e_com.R;
import com.example.e_com.databinding.FragmentHomeBinding;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {
    FragmentHomeBinding binding;
    private MainAdapter mainAdapter;
    private List<MainModelItem> itemList;
    String imageUrl = "https://t3.ftcdn.net/jpg/05/71/06/76/360_F_571067620_JS5T5TkDtu3gf8Wqm78KoJRF1vobPvo6.jpg";

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(inflater, container, false);

        itemList = new ArrayList<>();

        itemList.add(new MainModelItem("1", R.drawable.img_4, "$200.00", "SONY Premium Wireless Headphones", "Headphones", "Model: WH-1000XM4, Black"));
        itemList.add(new MainModelItem("1", R.drawable.img_3, "$200.00", "SONY Premium Wireless Headphones", "Headphones", "Model: WH-1000XM4, Black"));
        itemList.add(new MainModelItem("1", R.drawable.img_4, "$200.00", "SONY Premium Wireless Headphones", "Headphones", "Model: WH-1000XM4, Black"));
        itemList.add(new MainModelItem("1", R.drawable.img_2, "$200.00", "SONY Premium Wireless Headphones", "Headphones", "Model: WH-1000XM4, Black"));
        itemList.add(new MainModelItem("1", R.drawable.img_3, "$200.00", "SONY Premium Wireless Headphones", "Headphones", "Model: WH-1000XM4, Black"));
        itemList.add(new MainModelItem("1", R.drawable.img_3, "$200.00", "SONY Premium Wireless Headphones", "Headphones", "Model: WH-1000XM4, Black"));
        itemList.add(new MainModelItem("1", R.drawable.img_4, "$200.00", "SONY Premium Wireless Headphones", "Headphones", "Model: WH-1000XM4, Black"));
        itemList.add(new MainModelItem("1", R.drawable.img_2, "$200.00", "SONY Premium Wireless Headphones", "Headphones", "Model: WH-1000XM4, Black"));

        binding.recyclerViewMain.setLayoutManager(new GridLayoutManager(getContext(), 2));
        mainAdapter = new MainAdapter(getContext(), itemList);
        binding.recyclerViewMain.setAdapter(mainAdapter);


        return binding.getRoot();
    }
}