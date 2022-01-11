package com.company;

import java.util.*;


public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome To Asshurbanipal");
        System.out.println("How shall we archive your treasure today?");

        Scanner comics = new Scanner(System.in);
        String comicName;
        String numOfComics;

        Map<String,String> comicStats = new HashMap<>();

        boolean done = false;
        while(!done){
            System.out.println("A)dd D)isplay Q)uit");
            String input = comics.next().toUpperCase();

            if (input.equals("A")){
                System.out.println("Please enter the Name and the number of the comics you wish to archive.");
                comicName = comics.next();
                numOfComics = comics.next();
                comicStats.put(comicName,numOfComics);
            }
            else if (input.equals("D")){
                System.out.println(comicStats);
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

