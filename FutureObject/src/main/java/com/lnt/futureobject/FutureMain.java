package com.lnt.futureobject;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class FutureMain {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        SquareCalculator squareCalculator = new SquareCalculator();
        Future<Integer> future = squareCalculator.calculate(10);

        while(!future.isDone()) {
            System.out.println("Calculating...");
            Thread.sleep(3000);
        }

        Integer result = future.get();
        System.out.println("Result " + result);
        if (future.isDone())
            System.out.println("Task Completed");
        future.cancel(true);
        squareCalculator.shutdown();
    }
}
