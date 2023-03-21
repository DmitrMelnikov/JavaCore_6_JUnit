package org.JavaCore6Test;

public class Main {
    public static void main(String[] args) {



        JobWithString jobWithString = new JobWithString();
        System.out.println(jobWithString.lengthString("Привет Мир!"));
        System.out.println(jobWithString.stringIsNull(""));
        System.out.println(jobWithString.occurrenceStrings("Миру","Мир"));
        System.out.println(jobWithString.addTwoStrings("Привет ","Мир!"));

    }
}