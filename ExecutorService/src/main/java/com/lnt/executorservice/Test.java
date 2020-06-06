package com.lnt.executorservice;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

@Data
@NoArgsConstructor
public class Test {

    public int arr[];
    public int start;
    public int end;
    public int count;
    public int searchEle;
    public ExecutorService executorService;

    public Test(int arr[], int start, int end, int count, int searchEle, ExecutorService executorService) {
        this.arr = arr;
        this.start = start;
        this.end = end;
        this.count = count;
        this.searchEle = searchEle;
        this.executorService = executorService;
    }


    public List<Future<Integer>> find() {
        List<Future<Integer>> futureList = new ArrayList<>();
        while (end > arr.length) {
            if(end < arr.length)
                end+=5;
            else
                end = arr.length;
            int newArr[] = Arrays.copyOfRange(arr, start, end);
            Future<Integer> future = executorService.submit(() -> {
                for (int i = start; i < end; i++) {
                    if (arr[i] == searchEle)
                        count++;
                }
                return count;
            });
            futureList.add(future);
        }
        return futureList;
    }

}
