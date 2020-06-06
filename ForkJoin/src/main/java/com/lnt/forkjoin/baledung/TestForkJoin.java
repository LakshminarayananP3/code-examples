package com.lnt.forkjoin.baledung;

import java.util.concurrent.ForkJoinPool;

public class TestForkJoin {

    public static void main(String[] args) {
        System.out.println("STarted");
        int[] arr = new int[1000000001];
        for (int i=1;i<=100000000;i++){
            arr[i] = i;
        }
        System.out.println(arr.length);

    }

    void begin() {
//        ForkJoinPool commonPool = ForkJoinPool.commonPool();

    }
}
