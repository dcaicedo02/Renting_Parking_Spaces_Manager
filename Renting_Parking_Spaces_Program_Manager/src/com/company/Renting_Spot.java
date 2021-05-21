package com.company;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.Serializable;

// Adding Spot to Data base
public class Renting_Spot  {


    public Renting_Spot(){


    }

    Scanner keyboard = new Scanner(System.in);

    static String adress;

    int exit = 0;

    ArrayList<String> CaliWeekDay = new ArrayList<>();

    ArrayList<String> CaliWeekEnds = new ArrayList<>();

    ArrayList<String> BogotaWeekDay = new ArrayList<>();

    ArrayList<String> BogotaWeekEnds = new ArrayList<>();



    // Method to add spot in Cali during Week Days

    public ArrayList addSpotCaliWeekDay(ArrayList CaliWeekDay){

        int yes = 0;



        while(yes == 0) {

            System.out.println("\n Parking Spot Address: ");
            adress = keyboard.nextLine();

            System.out.println();
            System.out.println("\n The parking spot address is: " + adress);
            System.out.println("\n Is this address correct? 'yes' or 'no' ");
            String correct = keyboard.next();

            if (correct.equals("yes")) {

                yes = yes + 1;

                // Adding element to ArrayList
                CaliWeekDay.add(adress);


                System.out.println("\n These are all the available spots in Cali during Weekdays: ");
                System.out.println();

                for (int i = 0; i < CaliWeekDay.size(); i++) {

                    System.out.println((i + 1) + ") " + CaliWeekDay.get(i));

                }

            } else if (correct.equals("no")) {

                adress = keyboard.nextLine();
            }

        }

        return CaliWeekDay;

    }


    // Method to add spot in Cali during Week Ends

    public ArrayList addSpotCaliWeekEnds(ArrayList CaliWeekEnds){

        // While loop with numerical condition
        int x = 0;
        while(x == 0) {
            System.out.println("\n Parking Spot Address: ");
            adress = keyboard.nextLine();

            System.out.println();
            System.out.println("\n The parking spot address is: " + adress);
            System.out.println("\n Is this address correct? 'yes' or 'no' ");
            String correct = keyboard.next();

           // Condition MET
            if(correct.equals("yes")) {

                x = x + 1;

                // Adding element to arraylist
                CaliWeekEnds.add(adress);


                System.out.println("\n These are all the available spots in Cali during WeekEnds: ");
                System.out.println();

                for (int i = 0; i < CaliWeekEnds.size(); i++) {

                    System.out.println((i + 1) + ") " + CaliWeekEnds.get(i));

                }

            }

            else if (correct.equals("no")){
                adress = keyboard.nextLine();
            }
        }
        return CaliWeekEnds;

    }




    // Method to add spot in Bogota during Week Days

    public ArrayList addSpotBogotaWeekDay(ArrayList BogotaWeekDay){

        int y = 0;

        while (y == 0) {
            System.out.println("\n Parking Spot Address: ");
            adress = keyboard.nextLine();

            System.out.println();
            System.out.println("\n The parking spot address is: " + adress);
            System.out.println("\n Is this address correct? 'yes' or 'no' ");
            String correct = keyboard.next();

            if(correct.equals("yes")) {

                y = y + 1;

                BogotaWeekDay.add(adress);


                System.out.println("\n These are all the available spots in Bogota during WeekDays: ");
                System.out.println();

                for (int i = 0; i < BogotaWeekDay.size(); i++) {

                    System.out.println((i + 1) + ") " + BogotaWeekDay.get(i));

                }

            }

            else if (correct.equals("no")){
                adress = keyboard.nextLine();
            }

        }
        return BogotaWeekDay;

    }

    // Method to add spot in Bogota during Week Ends

    public ArrayList addSpotBogotaWeekEnds(ArrayList BogotaWeekEnds){

        int z = 0;

       while (z == 0) {
           System.out.println("\n Parking Spot Address: ");
           adress = keyboard.nextLine();

           System.out.println();
           System.out.println("\n The parking spot address is: " + adress);
           System.out.println("\n Is this address correct? 'yes' or 'no' ");
           String correct = keyboard.next();

           if (correct.equals("yes")) {

               z = z + 1;

               BogotaWeekEnds.add(adress);


               System.out.println("\n These are all the available spots in Bogota during WeekEnds: ");
               System.out.println();

               for (int i = 0; i < BogotaWeekEnds.size(); i++) {

                   System.out.println((i + 1) + ") " + BogotaWeekEnds.get(i));

               }

           }

           else if (correct.equals("no")){
               adress = keyboard.nextLine();
           }

       }

        return BogotaWeekEnds;

    }


}

