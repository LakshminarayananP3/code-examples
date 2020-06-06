package com.lnt.forkjoin.howtodoinjava;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class SearchFile {

    public static void main(String[] args) {
        String path = "/Users/admin";
       File file = new File(path);
       SearchFile searchFile = new SearchFile();
       searchFile.searchFile(file);
        System.out.println("Total file count " + searchFile.files);
        System.out.println("Total other file count " + searchFile.Otherfiles);

    }

    String extension = ".log";
    int files;
    int Otherfiles;

    public void searchFile(File dir) {
        if(dir.getAbsolutePath().equalsIgnoreCase("/Users/admin/GitHub"))
            return;
        File[] fileList = dir.listFiles();
        if(fileList == null)
            return;
        for(File file : fileList) {
            if(file.isDirectory())
                searchFile(file);
            else {
                if(file.getName().endsWith(extension))
                    files++;
                else
                    Otherfiles++;
            }
        }
    }
}
