package com.lnt.forkjoin.jenkov;

import java.util.concurrent.RecursiveTask;

public class Forkjoin {
    public static void main(String[] args) {
        System.out.println("Started");
        int val = 1000000000;
        int[] arr = new int[val];
        for (int i = 0; i < val; i++) {
            arr[i] = i;
        }
        System.out.println(arr.length);
        Testing testing = new Testing(arr, 0, arr.length-1, 99);
        System.out.println("final result " + testing.compute());
    }
}

class Testing extends RecursiveTask<Integer> {

    int[] arr;
    int start;
    int end;
    int searchEle;
    int count;

    public Testing() {

    }

    public Testing(int[] arr, int start, int end, int searchEle) {
        this.arr = arr;
        this.searchEle = searchEle;
        this.start = start;
        this.end = end;
    }


    @Override
    protected Integer compute() {
        int size = end - start + 1;
        if (size > 1000) {
            int mid = (end + start) / 2;
            Testing testing1 = new Testing(arr, start, mid, 9999);
            Testing testing2 = new Testing(arr, mid, end, 9999);
            testing1.fork();
            testing2.fork();
            int result = 0;
            try{
                result = testing1.join() + testing2.join();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return  result;
//            System.out.println("Result " + result);
        } else {
            return process();
        }
    }

    private Integer process() {
        for (int i = start; i <= end; i++) {
            if (searchEle == arr[i])
                count++;
        }
        return count;
    }
}

