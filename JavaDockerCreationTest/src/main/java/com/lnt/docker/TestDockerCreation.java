package com.lnt.docker;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/*
 * @author Lakshminarayanan
 * @created 26/07/20 6:36 PM
 */
public class TestDockerCreation {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello Docker");
        File file = new File(TestDockerCreation.class.getResource("/dir1/file1.txt").toURI());
        System.out.println("file path " + file.getAbsolutePath());
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;
        while((line = br.readLine()) != null)
            System.out.println("file lines--> " + line);
        br.close();

    }
}
