package com.gilangkusumajati.bakingapp.api;

import com.gilangkusumajati.bakingapp.model.Recipe;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Gilang Kusuma Jati on 8/27/17.
 */

public class RecipeAPIClient {

    private static RecipeAPIClient client = new RecipeAPIClient();

    private RecipeAPI api;

    private RecipeAPIClient() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(RecipeAPI.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        api = retrofit.create(RecipeAPI.class);
    }

    public static RecipeAPIClient getInstance() {
        return client;
    }

    public Call<List<Recipe>> getRecipes() {
        return api.getRecipes();
    }
}
