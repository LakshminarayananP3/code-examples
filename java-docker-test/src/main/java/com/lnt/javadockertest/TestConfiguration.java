package com.lnt.javadockertest;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/*
 * @author Lakshminarayanan
 * @created 28/07/20 6:52 PM
 */

public class TestConfiguration {

    @Bean
    CommandLineRunner init() throws IOException {
        return args -> {
            InputStream file = this.getClass().getClassLoader().getResourceAsStream("dir1/file1.txt");

            BufferedReader br = new BufferedReader(new InputStreamReader(file));
            String line;
            while ((line = br.readLine()) != null)
                System.out.println("file lines--------> " + line);
            br.close();
        };
    }
}
