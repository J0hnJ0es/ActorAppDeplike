package com.example.bagiscanuzmez.youapp.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bagiscanuzmez on 15.05.2018.
 */
//package com.example.bagiscanuzmez.youapp.model;

        import com.google.gson.annotations.SerializedName;

        import java.io.Serializable;
        import java.util.ArrayList;
        import java.util.List;


/**
 *
 * It can be seen, this is the Actor class
 * This class has profilePath for url, shows adult or not, his/her id, his/her id and popularity
 * All of them are getters and setters
 */
public class Actor {
    @SerializedName("profile_path")
    private String profilePath;
    @SerializedName("adult")
    private boolean adult;
    @SerializedName("id")
    private Integer id;
    @SerializedName("name")
    private String name;
    @SerializedName("popularity")
    private Double popularity;

    public Actor(String profilePath, boolean adult, Integer id, String name, Double popularity){
        this.profilePath = profilePath;
        this.adult = adult;
        this.id = id;
        this.name = name;
        this.popularity = popularity;

    }

    public String getProfilePath(){
        return "https://image.tmdb.org/t/p/w500" + profilePath;
    }

    public void setProfilePath(String profilePath){
        this.profilePath = profilePath;
    }

    public boolean isAdult(){
        return adult;
    }

    public void setAdult(boolean adult){
        this.adult = adult;
    }

    public Integer getId(){
        return id;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Double getPopularity(){
        return popularity;
    }

    public void setPopularity(Double popularity){
        this.popularity = popularity;
    }

    /*@SerializedName("poster_path")
    private  String posterPath;
    @SerializedName("adult")
    private boolean adult;
    @SerializedName("overview")
    private String overview;
    @SerializedName("release_date")
    private String releaseDate;
    @SerializedName("original_title")
    private String originalTitle;
    @SerializedName("genre_ids")
    private List<Integer> genreIds = new ArrayList<Integer>();
    @SerializedName("id")
    private Integer id;
    @SerializedName("media_type")
    private String media_type;
    @SerializedName("original_language")
    private String originalLanguage;
    @SerializedName("title")
    private String title;
    @SerializedName("backdrop_path")
    private String backdropPath;
    @SerializedName("popularity")
    private double popularity;
    @SerializedName("vote_count")
    private Integer voteCount;
    @SerializedName("video")
    private Boolean video;
    @SerializedName("vote_average")
    private Double voteAverage;*/

    /*public Actor(String posterPath, boolean adult, String overview, String releaseDate, String originalTitle,
                 List<Integer> genreIds, Integer id, String media_type, String originalLanguage, String title,
                 String backdropPath, Double popularity, Integer voteCount, Boolean video, Double voteAverage){
        this.posterPath = posterPath;
        this.adult = adult;
        this.overview = overview;
        this.releaseDate = releaseDate;
        this.genreIds = genreIds;
        this.id = id;
        this.originalTitle = originalTitle;
        this.originalLanguage = originalLanguage;
        this.title = title;
        this.backdropPath = backdropPath;
        this.popularity = popularity;
        this.voteCount = voteCount;
        this.video = video;
        this.voteAverage = voteAverage;
        this.media_type = media_type;
    }
    String baseImageUrl = "https://image.tmdb.org/t/p/w500";

    public String getPosterPath(){
        return "https://image.tmdb.org/t/p/w500" + posterPath;
    }

    public void setPosterPath(String posterPath){
        this.posterPath = posterPath;
    }

    public boolean isAdult(){
        return adult;
    }

    public void setAdult(boolean adult){
        this.adult = adult;
    }

    public String getOverview(){
        return overview;
    }

    public void setOverview(String overview){
        this.overview = overview;
    }

    public String getReleaseDate(){
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate){
        this.releaseDate = releaseDate;
    }

    public List<Integer> getGenreIds(){
        return genreIds;
    }

    public void setGenreIds(ArrayList<Integer> genreIds){
        this.genreIds = genreIds;
    }

    public Integer getId(){
        return id;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public String getOriginalTitle(){
        return originalTitle;
    }

    public void setOriginalTitle(String originalTitle){
        this.originalTitle = originalTitle;
    }

    public String getOriginalLanguage(){
        return originalLanguage;
    }

    public void setOriginalLanguage(String originalLanguage){
        this.originalLanguage = originalLanguage;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getBackdropPath(){
        return backdropPath;
    }

    public void setBackdropPath(String backdropPath){
        this.backdropPath = backdropPath;
    }

    public Double getPopularity(){
        return popularity;
    }

    public void setPopularity(Double popularity){
        this.popularity = popularity;
    }

    public Integer getVoteCount(){
        return voteCount;
    }

    public void setVoteCount(Integer voteCount){
        this.voteCount = voteCount;
    }

    public boolean getVideo(){
        return video;
    }

    public void setVideo(boolean video){
        this.video = video;
    }

    public Double getVoteAverage(){
        return voteAverage;
    }

    public void setVoteAverage(Double voteAverage){
        this.voteAverage = voteAverage;
    }

    public String getMediaType(){
        return media_type;
    }

    public void setMediaType(String media_type){
        this.media_type = media_type;
    }*/

}

