package com.lrb.cinema;

import java.util.ArrayList;
import java.util.List;

public class CinemaApplicationRun {
    public static void main(String[] args) {
        List<Viewer> viewers = new ArrayList<>();

        viewers.add(new Viewer("Nick", 30));
        viewers.add(new Viewer("Sam", 32));
        viewers.add(new Viewer("Jack", 45));
        viewers.add(new Viewer("Tim", 18));
        viewers.add(new Viewer("Max", 22));

        System.out.println("Средний возраст зрителей: " + new ViewerStatistics().averageAge(viewers));
    }
}
