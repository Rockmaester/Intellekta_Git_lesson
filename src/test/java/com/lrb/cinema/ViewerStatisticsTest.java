package com.lrb.cinema;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ViewerStatisticsTest{

    public Viewer viewer1 = null;
    public Viewer viewer2 = null;

    List<Viewer> testList = null;

    @Before
    public void setup(){
        viewer1 = new Viewer("Nik", 2, 2);
        viewer2 = new Viewer("Sam", 3, 3);
        testList = new ArrayList<Viewer>();
        testList.add(viewer1);
        testList.add(viewer2);
    }

    @Test
    public void testAverageAge() {
        Assert.assertEquals(2.5, new ViewerStatistics().averageAge(testList), 0.001);
    }
}