package com.gilangkusumajati.bakingapp.api;

import com.gilangkusumajati.bakingapp.model.Recipe;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Gilang Kusuma Jati on 8/27/17.
 */

public interface RecipeAPI {
    public static final String BASE_URL = "https://d17h27t6h515a5.cloudfront.net";

    @GET("topher/2017/May/59121517_baking/baking.json")
    Call<List<Recipe>> getRecipes();
}
