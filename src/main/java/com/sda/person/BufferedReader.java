package com.sda.person;


import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;

public class BufferedReader {
    public static void main(String[] args) {
        File file = new File("file.txt");
        if(file.exists()) {
            try (java.io.BufferedReader br = new java.io.BufferedReader(new FileReader(file))) {
                int dlugosc = br.lines()
                        .max(Comparator.comparing(String::length))
                        .get().length();
                System.out.println(dlugosc);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
