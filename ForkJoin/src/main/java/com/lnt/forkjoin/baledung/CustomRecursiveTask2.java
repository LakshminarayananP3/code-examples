package com.lnt.forkjoin.baledung;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;
import java.util.logging.Logger;

public class CustomRecursiveTask2 extends RecursiveTask<Integer> {
    private int[] arr;
    Logger logger;
    private static final int THRESHOLD = 5;

    public CustomRecursiveTask2(int[] arr, Logger logger) {
        this.arr = arr;
        this.logger = logger;
    }

    @Override
    protected Integer compute() {
        if (arr.length > THRESHOLD) {
            return ForkJoinTask.invokeAll(createSubtasks())
                    .stream()
                    .mapToInt(ForkJoinTask::join)
                    .sum();
        } else {
            return processing(arr);
        }
    }

    private Collection<CustomRecursiveTask2> createSubtasks() {
        List<CustomRecursiveTask2> dividedTasks = new ArrayList<>();
        dividedTasks.add(new CustomRecursiveTask2(
                Arrays.copyOfRange(arr, 0, arr.length / 2), logger));
        dividedTasks.add(new CustomRecursiveTask2(
                Arrays.copyOfRange(arr, arr.length / 2, arr.length), logger));
        return dividedTasks;
    }

    private Integer processing(int[] arr) {
        logger.info(String.valueOf(arr.length));
        return Arrays.stream(arr)
                .map(a -> a * 10)
                .sum();
    }
}
