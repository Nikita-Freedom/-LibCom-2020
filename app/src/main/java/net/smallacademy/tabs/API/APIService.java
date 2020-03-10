package net.smallacademy.tabs.API;

import net.smallacademy.tabs.Recipe;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface APIService {
    @GET("cookdev/get_recipes.php")
    Call<List<Recipe>> getCooks(@Query("category") int category);

    @GET("cookdev/get_events2.php")
    Call<List<Recipe>> getCooks2(@Query("category") int category);

    @GET("cookdev/get_day3.php")
    Call<List<Recipe>> getCooks3(@Query("category") int category);

    @GET("cookdev/get_day4.php")
    Call<List<Recipe>> getCooks4(@Query("category") int category);
}