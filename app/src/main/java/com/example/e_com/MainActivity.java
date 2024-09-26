package com.example.e_com;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

import com.example.e_com.databinding.ActivityMainBinding;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.FirebaseFirestore;

import org.json.JSONObject;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;

public class MainActivity extends AppCompatActivity {

    // View Binding for the activity's views
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Enable Edge-to-Edge UI for modern navigation gestures
        EdgeToEdge.enable(this);

        // Inflate the layout using View Binding to access the views in the layout
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Handle system bars insets for better UI experience
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Get the FragmentManager to manage fragments
        FragmentManager fragmentManager = getSupportFragmentManager();

        // Get the Navigation Host Fragment from the layout
        Fragment navHostFragment = fragmentManager.findFragmentById(R.id.fragmentContainerView);

        // Check if the fragment is a NavHostFragment instance (NavHostFragment manages navigation within fragments)
        if (navHostFragment instanceof NavHostFragment) {
            // Get the NavController from the NavHostFragment to control navigation actions
            NavController navController = ((NavHostFragment) navHostFragment).getNavController();

            // Set up the BottomNavigationView to work with NavController for fragment navigation
            NavigationUI.setupWithNavController(binding.bottomNavigationView, navController);
        }



    }
}
