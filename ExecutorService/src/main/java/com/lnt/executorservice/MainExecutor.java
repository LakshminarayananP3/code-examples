package com.lnt.executorservice;

import java.util.List;
import java.util.concurrent.*;

public class MainExecutor {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(8);
        int arr[] = new int[100];
        for(int i=0;i<100;i++){
            arr[i] = i;
        }
        Test test = new Test(arr, 0, arr.length - 1, 0, 14, executorService);
        int count = 0;
        List<Future<Integer>> futureList = test.find();
        while (!futureList.isEmpty()) {
            for(Future<Integer> future: futureList) {
                if (future.isDone()) {
                    count+=future.get();
                    futureList.remove(future);
                }
            }
            TimeUnit.SECONDS.sleep(1);
        }
        System.out.println("Count" + count);
        executorService.shutdown();
    }
}
