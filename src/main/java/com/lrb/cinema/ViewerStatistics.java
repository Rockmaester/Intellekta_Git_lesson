package com.lrb.cinema;

import java.util.List;

public class ViewerStatistics {
    public double averageAge(List<Viewer> list){
        double sum = 0.0;
        for(Viewer x : list){
            sum += x.getAge();
        }
        return sum / list.size();
    }
}
