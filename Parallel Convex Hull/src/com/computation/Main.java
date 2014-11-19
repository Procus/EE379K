package com.computation;

import com.computation.algo.GiftWrapping;
import com.computation.common.ConvexHull;
import com.computation.common.Point2DCloud;
import com.computation.experimental.OptimalThreadCountFinder;

import javax.swing.*;
import java.lang.reflect.InvocationTargetException;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, UnsupportedLookAndFeelException,
            InstantiationException, IllegalAccessException, InvocationTargetException, InterruptedException {

        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

        //OptimalThreadCountFinder.DPI_SCALING =
                Point2DCloud.DPI_SCALING = 1; /* Set display scaling */

       // OptimalThreadCountFinder optimalThreadCountFinder = new OptimalThreadCountFinder();
       // optimalThreadCountFinder.find();

        //Mathew's Concurrent Quick Hull Implementation
//        ConvexHull convexHull = new QuickHull(/* pointCount */ 10000, /* width */ 800, /* height */ 600, /* threadCount */ 15, false);
//        convexHull.show();

        //Kapil's Concurrent Gift Wrapping Implemntation (max at 4 threads)
        ConvexHull convexHull = new GiftWrapping(100, 1000, 1000, 15, false);
        convexHull.show();
    }
}
