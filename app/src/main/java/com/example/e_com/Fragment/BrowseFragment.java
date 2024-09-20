package com.example.e_com.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import com.example.e_com.databinding.FragmentBrowseBinding;

import java.util.ArrayList;

public class BrowseFragment extends Fragment {
    FragmentBrowseBinding binding;
    ListView listView;
    SearchView searchView;

    // Define array adapter for ListView
    ArrayAdapter<String> adapter;
    // Define array List for List View data
    ArrayList<String> mylist;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentBrowseBinding.inflate(inflater,container,false);

        setCategoryList();
        searchViewMethod();

        return binding.getRoot();
    }

    private void searchViewMethod() {
        binding.searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                if(mylist.contains(query)){
                    adapter.getFilter().filter(query);
                } else {
                    Toast.makeText(getContext(), "No Match found",Toast.LENGTH_LONG).show();
                }
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                // Filter list as text changes
                adapter.getFilter().filter(newText);
                return false;
            }
        });
    }


    private void setCategoryList() {
        listView = binding.listView;

        // Add items to Array List
        mylist = new ArrayList<>();
        mylist.add("Audio");
        mylist.add("Electronics");
        mylist.add("Photo");
        mylist.add("Gaming");
        mylist.add("Advanced Networking");
        mylist.add("Interview prep with c++");
        mylist.add("Interview prep with java");
        mylist.add("data structures with c");
        mylist.add("data structures with java");

        // Set adapter to ListView
        adapter = new ArrayAdapter<>(getContext(), android.R.layout.simple_expandable_list_item_1, mylist);
        listView.setAdapter(adapter);
    }
}