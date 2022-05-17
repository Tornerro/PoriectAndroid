package com.example.v3;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MovieViewModel extends ViewModel {
    private List<String> moviesList =  new ArrayList<>();
    private List<String> favMoviesList = new ArrayList<>();

    public List<String> getAllMovies() {
        return moviesList;
    }

    public List<String> getFavMovies() {
        return favMoviesList;
    }

    public void addMovie(String s) {
        favMoviesList.add(s);
    }

    public void removeMovie(String s) {
        favMoviesList.remove(s);
    }
}
