package com.example.bagiscanuzmez.youapp.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by bagiscanuzmez on 15.05.2018.
 */

//package com.example.bagiscanuzmez.youapp.model;

        import com.google.gson.annotations.SerializedName;

        import java.util.List;

/**
 * Created by bagiscanuzmez on 12.05.2018.
 */

/***
 * This is the part at the beginning. Before getting the actors details, API shows this pages
 * in order to implement simpler.
 */

public class ActorResponse {
    @SerializedName("page")
    private int page;
    @SerializedName("results")
    private List<Actor> results;
    @SerializedName("total_results")
    private int totalResults;
    @SerializedName("total_pages")
    private int totalPages;

    public int getPage(){
        return page;
    }

    public void setPage(int page){
        this.page = page;
    }

    public List<Actor> getResults(){
        return results;
    }

    public List<Actor> getActors(){
        return results;
    }

    public void setResults(List<Actor> results){
        this.results = results;
    }

    public void setMovies(List<Actor> results){
        this.results = results;
    }

    public int getTotalResults(){
        return totalResults;
    }

    public void setTotalResults(int totalResults){
        this.totalResults = totalResults;
    }

    public int getTotalPages(){
        return totalPages;
    }

    public void setTotalPages(int totalPages){
        this.totalPages = totalPages;
    }
}
