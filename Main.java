package com.bestmat;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;
// Author: Yuvanth B, ©2021 - Slashlang
public class Main {
    static void print(String a){
      System.out.println(a);
    }
    static void readFile(String f){
        try {
            File myObj = new File(f);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    static void createFile(String f){
        try {
            File a = new File(f);
            if (a.createNewFile()) {
                System.out.println("File created: " + a.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    static void writeFile(String f, String t){
        try {
            FileWriter myWriter = new FileWriter(f);
            myWriter.write(t);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    static void deleteFile(String f){
        File a = new File(f);
        if (a.delete()) {
            System.out.println("Deleted the file: " + a.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
    public static String input(String i){
        Scanner myObj = new Scanner(System.in);
        String a;
        System.out.println(i);
        a = myObj.nextLine();
        return a;
    }
    public static String forEach(String[] a) {
        String j = "";
        for (String i : a) {
            j = i;
        }
        return j;
    }
    public static void main(String[] args) {
       
    }
}
