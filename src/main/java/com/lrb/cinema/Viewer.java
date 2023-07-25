package com.lrb.cinema;

import java.util.ArrayList;
import java.util.List;

public class Viewer {
    private String nickName;
    private int age;
    private int movieCount;
    private List<Cinema> movies;

    public Viewer(String nickName, int age) {
        this.nickName = nickName;
        this.age = age;
        this.movieCount = 0;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMovieCount() {
        return movieCount;
    }

    public void setMovieCount(int movieCount) {
        this.movieCount = movieCount;
    }

    public List<Cinema> getMovies() {
        return movies;
    }

    public void setMovies(List<Cinema> movies) {
        this.movies = movies;
    }

    public void watchMovie(Cinema movie){
        if(this.movies == null) movies = new ArrayList<>();
        movies.add(movie);
        this.movieCount++;
    }
}
