package com.company;
import java.util.Scanner;
import java.util.ArrayList;

// Renting Out Spot
public class Looking_Spot {



    public Looking_Spot(){


    }

    Scanner keyboard = new Scanner(System.in);

    static int adressimput;

    public static int days;

    int exit = 0;

    Extras extras = new Extras();



    // Method to show available spots in Cali, during week days

    public ArrayList availableSpotsCaliWeekDay(ArrayList CaliWeekDay) {


        System.out.println();

        // if Statement
        if(CaliWeekDay.size() >= 1 ) {
            System.out.println();
            System.out.println("\n These are the available parking spots in Cali During Week Days:");
            System.out.println();
            for (int i = 0; i < CaliWeekDay.size(); i++) {

                System.out.println((i + 1) + ") " + CaliWeekDay.get(i));
            }

            System.out.println();
            System.out.println("\n Please choose an option. Type the number that corresponds" +
                    " to the address which is being rented out");
            adressimput = keyboard.nextInt();

           // for loop
            for (int i = 0; i <= CaliWeekDay.size(); i++) {

                // Nested if
                if ((adressimput - 1) <= CaliWeekDay.size()) {
                    System.out.println("\n You choose address: " + CaliWeekDay.get(adressimput-1)
                            + " as the parking spot being rented out");

                    // Removing element from ArrayList
                    CaliWeekDay.remove((adressimput - 1));
                }
                System.out.println();
                System.out.println("\n Weekdays parking is $10");
                System.out.println("\n For how many days will your client rent the parking spot?");
                days = keyboard.nextInt();

                // Nested if
                if (days < 30) {
                    System.out.println("\n Your client's total cost will be: $" + extras.priceWeekDays());
                } else if (days >= 30) {
                    System.out.println("\n Your client's monthly promotion will have a total cost of: $" + extras.priceMonth());
                }

                System.out.println("\n Please choose your client's payment method. \n 1)Credit card \n 2) Cash");
                int paymentmethod = keyboard.nextInt();

                exit = exit + 1;

                if (paymentmethod == 1) {
                    System.out.println("\n The parking spot has being rented out. Congratulations!");

                } else if (paymentmethod == 2) {
                    System.out.println("\n The parking spot has being rented out. Congratulations!");

                    exit++;
                } else {
                    System.out.println("\n ERROR! Your imput is not valid. Please enter the number that corresponds to your adress choice ");
                    adressimput = keyboard.nextInt();

                }

                if (exit > 0) {
                    break;
                }
            }

        }

        else if(CaliWeekDay.size() < 1){

            System.out.println("\n Their are no available parking spots. Please add spots in order to rent them out");

            }


        return CaliWeekDay;

    }


    // Method to show available spots in Cali, during week ends

    public ArrayList availableSpotsCaliWeekEnds(ArrayList CaliWeekEnds) {


        System.out.println();

        if (CaliWeekEnds.size() >= 1) {
            System.out.println("\n These are the available parking spots in Cali During Week Ends:");
            System.out.println();

            System.out.println();
            for (int i = 0; i < CaliWeekEnds.size(); i++) {

                System.out.println((i + 1) + ") " + CaliWeekEnds.get(i));

            }

            System.out.println();
            System.out.println("\n Please choose an option. Type the number that corresponds to the address which is being rented out");
            adressimput = keyboard.nextInt();

            for (int i = 0; i <= CaliWeekEnds.size(); i++) {

                // Searching
                if ((adressimput - 1) <= CaliWeekEnds.size()) {
                    System.out.println("\n You choose address: " + CaliWeekEnds.get(adressimput - 1) +
                            " as the parking spot being rented out");
                    CaliWeekEnds.remove((adressimput - 1));
                }


                System.out.println();
                System.out.println("\n WeekEnds parking is $20");
                System.out.println("\n For how many days will your client want to rent the parking spot?");
                days = keyboard.nextInt();
                if (days < 30) {
                    System.out.println("\n Your client's total cost will be: $" + extras.priceWeekends());
                } else if (days >= 30) {
                    System.out.println("\n Your client's monthly promotion will have a total cost of: $" + extras.priceMonth());
                }

                System.out.println("\n Please choose your client's payment method. \n 1)Credit card \n 2) Cash");
                int paymentmethod = keyboard.nextInt();

                exit = exit + 1;

                if (paymentmethod == 1) {
                    System.out.println("\n The parking spot has being rented out. Congratulations!");

                } else if (paymentmethod == 2) {
                    System.out.println("\n The parking spot has being rented out. Congratulations!");

                    exit++;

                    // else - search not found
                } else {
                    System.out.println("\n ERROR! Your imput is not valid. Please enter the number that corresponds to your adress choice ");
                    adressimput = keyboard.nextInt();

                }

                if (exit > 0) {
                    break;
                }

            }

        }

        else if(CaliWeekEnds.size() < 1){

            System.out.println("\n Their are no available parking spots. Please add spots in order to rent them out");
        }


        return CaliWeekEnds;

    }




    // Method to show available spots in Bogota, during week days

    public ArrayList availableSpotsBogotaWeekDay(ArrayList BogotaWeekDay) {


        System.out.println();

        if(BogotaWeekDay.size() >= 1) {
            System.out.println("\n These are the available parking spots in Bogota During Week Days.");
            System.out.println();

            for (int i = 0; i < BogotaWeekDay.size(); i++) {

                System.out.println((i + 1) + ") " + BogotaWeekDay.get(i));

            }

            System.out.println();
            System.out.println("\n Please choose an option. Type the number that corresponds to the address which is being rented out");
            adressimput = keyboard.nextInt();

            for (int i = 0; i <= BogotaWeekDay.size(); i++) {

                if ((adressimput - 1) <= BogotaWeekDay.size()) {
                    System.out.println("\n You choose address: " + BogotaWeekDay.get(adressimput - 1) + " as your parking place");
                    BogotaWeekDay.remove((adressimput - 1));
                }


                System.out.println();
                System.out.println("\n Weekdays parking is $10");
                System.out.println("\n For how many days will you want to rent the parking spot?");
                days = keyboard.nextInt();
                if (days < 30) {
                    System.out.println("\n Your total cost will be: $" + extras.priceWeekDays());
                } else if (days >= 30) {
                    System.out.println("\n Your monthly promotion will have a total cost of: $" + extras.priceMonth());
                }

                System.out.println("\n Please choose your payment method. \n 1)Credit card \n 2) Cash");
                int paymentmethod = keyboard.nextInt();

                exit = exit + 1;

                if (paymentmethod == 1) {
                    System.out.println("\n Thank you! Your parking spot confirmation will be sent shortly");

                } else if (paymentmethod == 2) {
                    System.out.println("\n Thank you! Your parking spot confirmation will be sent shortly");

                    exit++;
                } else {
                    System.out.println("\n ERROR! Your imput is not valid. Please enter the number that corresponds to your adress choice ");
                    adressimput = keyboard.nextInt();

                }

                if (exit > 0) {
                    break;
                }

            }

        }

        else if (BogotaWeekDay.size() < 1){

            System.out.println("\n Their are no available parking spots. Please add spots in order to rent them out");

        }


        return BogotaWeekDay;

    }


    // Method to show available spots in Bogota, during week ends

    public ArrayList availableSpotsBogotaWeekEnds(ArrayList BogotaWeekEnds) {


        System.out.println();

        if (BogotaWeekEnds.size() >=1) {
            System.out.println("\n These are the available parking spots in Bogota During Week Ends.");
            System.out.println();

            for (int i = 0; i < BogotaWeekEnds.size(); i++) {

                System.out.println((i + 1) + ") " + BogotaWeekEnds.get(i));

            }

            System.out.println();
            System.out.println("\n Please choose an option. Type the number that corresponds to the address which is being rented out");
            adressimput = keyboard.nextInt();

            for (int i = 0; i <= BogotaWeekEnds.size(); i++) {

                if ((adressimput - 1) <= BogotaWeekEnds.size()) {
                    System.out.println("\n You choose address: " + BogotaWeekEnds.get(adressimput - 1) + " as your parking place");

                   //Removing element from arraylist
                    BogotaWeekEnds.remove((adressimput - 1));
                }


                System.out.println();
                System.out.println("\n WeekEnds parking is $20");
                System.out.println("\n For how many days will you want to rent the parking spot?");
                days = keyboard.nextInt();
                if (days < 30) {
                    System.out.println("\n Your total cost will be: $" + extras.priceWeekends());
                } else if (days >= 30) {
                    System.out.println("\n Your monthly promotion will have a total cost of: $" + extras.priceMonth());
                }

                System.out.println("\n Please choose your payment method. \n 1)Credit card \n 2) Cash");
                int paymentmethod = keyboard.nextInt();

                exit = exit + 1;

                if (paymentmethod == 1) {
                    System.out.println("\n Thank you! Your parking spot confirmation will be sent shortly");

                } else if (paymentmethod == 2) {
                    System.out.println("\n Thank you! Your parking spot confirmation will be sent shortly");

                    exit++;
                } else {
                    System.out.println("\n ERROR! Your imput is not valid. Please enter the number that corresponds to your adress choice ");
                    adressimput = keyboard.nextInt();

                }

                if (exit > 0) {
                    break;
                }

            }

        }

        else if (BogotaWeekEnds.size() < 1){

            System.out.println("\n Their are no available parking spots. Please add spots in order to rent them out");

        }


        return BogotaWeekEnds;

    }



}
