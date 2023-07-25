package com.lrb.cinema;

import java.util.ArrayList;
import java.util.List;

public class CinemaApplicationRun {
    public static void main(String[] args) {
        List<Viewer> viewers = new ArrayList<>();

        viewers.add(new Viewer("Nick", 30, 1));
        viewers.add(new Viewer("Sam", 32, 2));
        viewers.add(new Viewer("Jack", 45, 4));
        viewers.add(new Viewer("Tim", 18, 3));
        viewers.add(new Viewer("Max", 22, 1));

        System.out.println("Средний возраст зрителей: " + new ViewerStatistics().averageAge(viewers));
    }
}
