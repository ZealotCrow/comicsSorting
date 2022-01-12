package com.company;

import java.util.*;


public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome To Asshurbanipal");
        System.out.println("How shall we archive your treasure today?");

        Scanner comics = new Scanner(System.in);
        String comicName;
        int numOfComics;

        Map<String,Integer> comicStats = new TreeMap<>();

        boolean done = false;
        while(!done){
            System.out.println("A)dd D)isplay Q)uit");
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
                //The goal of this wrapper is to display the added parts of the list as well as the Sorted list
                System.out.println(comicStats);
                System.out.println(comicStats.);
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

