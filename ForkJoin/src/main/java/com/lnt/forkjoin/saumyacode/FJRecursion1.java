package com.lnt.forkjoin.saumyacode;

/*
 * @author Lakshminarayanan
 * @project ForkJoin
 * @created 08/06/20
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;


public class FJRecursion1 extends RecursiveAction {

    private String inputString;

    protected static int sThreshold = 20;

    static PrintWriter outFile;


    public FJRecursion1(String c) {

        inputString = c;

    }


    private void computeDirectly(String fileString) {

        //just return the upper case

        try {

            outFile.write(fileString.toUpperCase());

            Thread.sleep(10);

        } catch (Exception e) {

            e.printStackTrace();

        }

    }


    @Override

    protected void compute() {

        if (inputString.length() < sThreshold) {

            computeDirectly(inputString);

            return;

        }

        System.out.println("Splitting task for " + inputString);

        int length = inputString.length();

        //split inputString to 2 parts

        invokeAll(new FJRecursion1(inputString.substring(0, length / 2)),

                new FJRecursion1(inputString.substring(length / 2 - 1, length)));

    }


    public static void main(String[] args) throws FileNotFoundException {

        outFile = new PrintWriter(new File("/Users/admin/GitHub/code-examples/ForkJoin/src/main/java/com/lnt/forkjoin" +
                "/saumyacode/out.txt"));

        Scanner inputSc = new Scanner(new File("/Users/admin/GitHub/code-examples/ForkJoin/src/main/java/com/lnt/forkjoin/saumyacode/input.txt"));


        String stringReadFromFile = "";

        while (inputSc.hasNextLine()) {

            stringReadFromFile += inputSc.next();

        }

        inputSc.close();

        FJRecursion1 fb = new FJRecursion1(stringReadFromFile);

//        System.out.println("Biggest string "+stringReadFromFile);

        ForkJoinPool pool = new ForkJoinPool();


        long startTime = System.currentTimeMillis();

        pool.invoke(fb);

        outFile.flush();

        long endTime = System.currentTimeMillis();

        System.out.println("Time taken " + (endTime - startTime));

    }

}
