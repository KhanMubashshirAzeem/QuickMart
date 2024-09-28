package com.example.e_com.Fragment;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.e_com.Adapter.MainAdapter;
import com.example.e_com.Adapter.TopProductAdapter;
import com.example.e_com.Model.MainModelItem;
import com.example.e_com.databinding.FragmentHomeBinding;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    FragmentHomeBinding binding;
    private MainAdapter mainAdapter;
    private TopProductAdapter topProductAdapter;
    private List<MainModelItem> itemList;

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentHomeBinding.inflate(inflater, container, false);

        // Initialize product list
        itemList = new ArrayList<>();
        // Add sample data
        itemList.add(new MainModelItem(1, "Fjallraven - Foldsack No. 1 Backpack", 109.95, "Your perfect pack for everyday use and walks in the forest.", "men's clothing", "https://fakestoreapi.com/img/81fPKd-2AYL._AC_SL1500_.jpg", new MainModelItem.Rating(3.9, 120)));
        itemList.add(new MainModelItem(1, "Fjallraven - Foldsack No. 1 Backpack", 109.95, "Your perfect pack for everyday use and walks in the forest.", "men's clothing", "https://fakestoreapi.com/img/81fPKd-2AYL._AC_SL1500_.jpg", new MainModelItem.Rating(3.9, 120)));
        itemList.add(new MainModelItem(1, "Fjallraven - Foldsack No. 1 Backpack", 109.95, "Your perfect pack for everyday use and walks in the forest.", "men's clothing", "https://fakestoreapi.com/img/81fPKd-2AYL._AC_SL1500_.jpg", new MainModelItem.Rating(3.9, 120)));
        itemList.add(new MainModelItem(1, "Fjallraven - Foldsack No. 1 Backpack", 109.95, "Your perfect pack for everyday use and walks in the forest.", "men's clothing", "https://fakestoreapi.com/img/81fPKd-2AYL._AC_SL1500_.jpg", new MainModelItem.Rating(3.9, 120)));

        // Set up RecyclerView
        binding.recyclerViewMain.setLayoutManager(new GridLayoutManager(getContext(), 2));
        mainAdapter = new MainAdapter(getContext(), itemList);
        binding.recyclerViewMain.setAdapter(mainAdapter);

        // Set up RecyclerView
        binding.recyclerViewTopProducts.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));
        topProductAdapter = new TopProductAdapter(getContext(), itemList);
        binding.recyclerViewTopProducts.setAdapter(topProductAdapter);

        return binding.getRoot();
    }
}
