package com.example.e_com;

import com.example.e_com.Model.MainModelItem;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ProductAPI {
    @GET("products")
    Call<List<MainModelItem>> getProduct();
}
