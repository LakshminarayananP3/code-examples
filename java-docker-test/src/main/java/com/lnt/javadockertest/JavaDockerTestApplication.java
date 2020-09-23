package com.lnt.javadockertest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.util.ResourceUtils;

import java.io.*;
import java.net.URLDecoder;
import java.util.Arrays;

@SpringBootApplication
public class JavaDockerTestApplication implements CommandLineRunner {

	@Autowired
	ResourceLoader resourceLoader;

	public static void main(String[] args) {
		SpringApplication.run(JavaDockerTestApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
        testResourceFile();
        testRuntimeException();
	}

    private void testRuntimeException() {
	    throw new RuntimeException("Run time exception");
    }

    private void testResourceFile() throws Exception  {
        //		System.out.println("--------------------------------Test command line runner");
        //		System.out.println("Hello Docker");
        //		InputStream file = this.getClass().getClassLoader().getResourceAsStream("dir1/file1.txt");
        //		File file = ResourceUtils.getFile("classpath:file2.txt");
        //		System.out.println(ResourceUtils.getFile("classpath:file2.txt").getAbsolutePath());
        ////		File file = new File("classpath:file2.txt");
        //		InputStream file = resourceLoader.getClassLoader().getResourceAsStream("file2.txt");
        //		System.out.println(file.getAbsolutePath());
        InputStream file = new ClassPathResource("dir1/file1.txt").getInputStream();
        //		BufferedReader br = new BufferedReader(new FileReader(file));
        BufferedReader br = new BufferedReader(new InputStreamReader(file));
        String line;
        while((line = br.readLine()) != null)
            System.out.println("file lines--------> " + line);
        br.close();
    }


}
