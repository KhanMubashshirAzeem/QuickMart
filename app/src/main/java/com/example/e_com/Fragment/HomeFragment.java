package com.example.e_com.Fragment;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.e_com.Adapter.MainAdapter;
import com.example.e_com.Adapter.TopProductAdapter;
import com.example.e_com.Model.MainModelItem;
import com.example.e_com.Model.TopProductModel;
import com.example.e_com.databinding.FragmentHomeBinding;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {
    FragmentHomeBinding binding;
    private MainAdapter mainAdapter;
    private List<MainModelItem> itemList;

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentHomeBinding.inflate(inflater, container, false);

        // Initialize product list and adapter for the main section
        itemList = new ArrayList<>();
        // Populate itemList as before...

        binding.recyclerViewMain.setLayoutManager(new GridLayoutManager(getContext(), 2));
        mainAdapter = new MainAdapter(getContext(), itemList);
        binding.recyclerViewMain.setAdapter(mainAdapter);




        return binding.getRoot();
    }

}
