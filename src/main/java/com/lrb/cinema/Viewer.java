package com.lrb.cinema;

public class Viewer {
    private String nickName;
    private int age;
    private int movieCount;

    public Viewer(String nickName, int age, int movieCount) {
        this.nickName = nickName;
        this.age = age;
        this.movieCount = movieCount;
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
}
