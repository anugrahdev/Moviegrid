package com.anugraha.project.moviegrid.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MovieStateResponse {


    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("favorite")
    @Expose
    private Boolean favorite;
    @SerializedName("rated")
    @Expose
    private Rated rated;
    @SerializedName("watchlist")
    @Expose
    private Boolean watchlist;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getFavorite() {
        return favorite;
    }

    public void setFavorite(Boolean favorite) {
        this.favorite = favorite;
    }

    public Rated getRated() {
        return rated;
    }

    public void setRated(Rated rated) {
        this.rated = rated;
    }

    public Boolean getWatchlist() {
        return watchlist;
    }

    public void setWatchlist(Boolean watchlist) {
        this.watchlist = watchlist;
    }



}