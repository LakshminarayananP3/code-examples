package com.lnt.test;

/*
 * @author Lakshminarayanan
 * @project CommandLineExecutor
 * @created 06/06/20
 */

public class RuntimeDemo {

    public static void main(String[] args) {
        try {

            // create a new array of 2 strings
            String[] cmdArray = new String[2];

            // first argument is the program we want to open
            cmdArray[0] = "pwd";

            // second argument is a txt file we want to open with notepad
            cmdArray[1] = "pbcopy";

            // print a message
            System.out.println("Executing notepad.exe and opening example.txt");

            // create a process and execute cmdArray
            Process process = Runtime.getRuntime().exec(cmdArray);

            // print another message
            System.out.println("example.txt should now open.");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
