package com.lnt.parallelstreams;

import java.util.ArrayList;
import java.util.List;

public class ParallelStreamDemo {

    public static void main(String[] args) {

        long t1, t2;
        List<Integer> eList = new ArrayList<Integer>();
        for (int i = 0; i < 100; i++) {
            eList.add(20000);
            eList.add(3000);
            eList.add(15002);
            eList.add(7856);
            eList.add(200);
            eList.add(50000);
        }

        /***** Here We Are Creating A 'Sequential Stream' & Displaying The Result *****/
        t1 = System.currentTimeMillis();
        System.out.println("Sequential Stream Count?= " + eList.stream().filter(e -> e > 15000).count());

        t2 = System.currentTimeMillis();
        System.out.println("Sequential Stream Time Taken?= " + (t2 - t1) + "\n");

        /***** Here We Are Creating A 'Parallel Stream' & Displaying The Result *****/
        t1 = System.currentTimeMillis();
        System.out.println("Parallel Stream Count?= " + eList.parallelStream().filter(e -> e > 15000).count());

        t2 = System.currentTimeMillis();
        System.out.println("Parallel Stream Time Taken?= " + (t2 - t1));
    }
}