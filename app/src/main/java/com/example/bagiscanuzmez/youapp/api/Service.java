package com.example.bagiscanuzmez.youapp.api;

import com.example.bagiscanuzmez.youapp.adapter.MoviesAdapter;
import com.example.bagiscanuzmez.youapp.model.MoviesResponse;
import com.example.bagiscanuzmez.youapp.model.ActorResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by bagiscanuzmez on 12.05.2018.
 */

public interface Service {

    @GET("movie/popular")
    Call<MoviesResponse>getPopularMovies(@Query("api_key") String apiKey);

    @GET("movie/top_rated")
    Call<MoviesResponse>getTopRatedMovies(@Query("api_key") String apiKey);

    @GET("person/popular")
    Call<ActorResponse>getPopularActors(@Query("api_key") String apiKey);
}
