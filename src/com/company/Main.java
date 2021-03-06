package com.company;

import java.sql.SQLOutput;
import java.util.*;
import java.util.TreeMap;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome To Asshurbanipal");
        System.out.println("How shall we archive your treasure today?");

        //The use of the delimiter allows the user to use spaces when inputting answers
        Scanner comics = new Scanner(System.in).useDelimiter("\n");
        String comicName = "";
        int numOfComics = 0;
        //May be able to output in columns if TreeMap is changed
        Map<String,Integer> comicStats = new TreeMap<>();

        boolean done = false;
        while(!done){
            System.out.println("A)dd D)isplay R)emove Q)uit");
            String input = comics.next().toUpperCase();

            if (input.equals("A")){
                //The objective of this wrapper is to add the entries to the list
                System.out.println("Please enter the Name of the comics you wish to archive.");
                 comicName = comics.next();
                System.out.println("Please enter the number of the comics you would like to archive");
                numOfComics = comics.nextInt();
                comicStats.put(comicName,numOfComics);

            }
            else if (input.equals("D")){
                //The goal of this wrapper is to display the added parts of the list as well as the Sorted lists
                System.out.println(comicStats);
                System.out.println(comicStats.values().stream().mapToInt(Integer::intValue).sum());
            }
            else if(input.equals("R")){
                System.out.println("Please enter the comics that you wish to remove from the archive");
                comicName = comics.next();
                comicStats.remove(comicName);
            }
            else if (input.equals("Q")){
                done = true;
            }
            else{
                done = true;
            }
        }
    }
}

