package com.company;

//Imported libraries
import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;

public class Main {

    // Array lists to store parking spot addresses

    static ArrayList<String> CaliWeekDay = new ArrayList<>();

    static ArrayList<String> CaliWeekEnds = new ArrayList<>();

    static ArrayList<String> BogotaWeekDay = new ArrayList<>();

    static ArrayList<String> BogotaWeekEnds = new ArrayList<>();

    public static void main(String[] args) throws Exception {

        Scanner keyboard = new Scanner(System.in);


        int whichday;

        int exit = 0;

// De-Serealization for the Arraylist: BogotaWeekDay
        try
        {
            FileInputStream fis = new FileInputStream("Bogota Week Days");
            ObjectInputStream ois = new ObjectInputStream(fis);

            BogotaWeekDay = (ArrayList) ois.readObject();


            ois.close();
            fis.close();
        }
        catch (IOException ioe)
        {
            ioe.printStackTrace();
            return;
        }
        catch (ClassNotFoundException c)
        {
            System.out.println("Class not found");
            c.printStackTrace();
            return;
        }




        // Deserealize for the Arraylist BogotaWeekEnds
        try
        {
            FileInputStream fis = new FileInputStream("Bogota Week Ends");
            ObjectInputStream ois = new ObjectInputStream(fis);

            BogotaWeekEnds = (ArrayList) ois.readObject();


            ois.close();
            fis.close();
        }
        catch (IOException ioe)
        {
            ioe.printStackTrace();
            return;
        }
        catch (ClassNotFoundException c)
        {
            System.out.println("Class not found");
            c.printStackTrace();
            return;
        }



        // Deserealize for the Arraylist CaliWeekDay
        try
        {
            FileInputStream fis = new FileInputStream("Cali Week Days");
            ObjectInputStream ois = new ObjectInputStream(fis);

            CaliWeekDay = (ArrayList) ois.readObject();


            ois.close();
            fis.close();
        }
        catch (IOException ioe)
        {
            ioe.printStackTrace();
            return;
        }
        catch (ClassNotFoundException c)
        {
            System.out.println("Class not found");
            c.printStackTrace();
            return;
        }




        // Deserealize for the Arraylist CaliWeekEnds
        try
        {
            FileInputStream fis = new FileInputStream("Cali Week Ends");
            ObjectInputStream ois = new ObjectInputStream(fis);

            CaliWeekEnds = (ArrayList) ois.readObject();


            ois.close();
            fis.close();
        }
        catch (IOException ioe)
        {
            ioe.printStackTrace();
            return;
        }
        catch (ClassNotFoundException c)
        {
            System.out.println("Class not found");
            c.printStackTrace();
            return;
        }



        // Start of the program - Request name and Welcoming message

        System.out.println("\n Hello! What is your name?");
        String name = keyboard.next();
        System.out.println("\n Hello! " + name + ", welcome to RentP! We will help" +
                " you to managed your parking spot company!");


        // while loop

        while (true) {

            // Main menu

            System.out.println("\n =_=_=_=_=_=_=_=_=_=_=_=_=_=_=_=_=_=");
            System.out.println("\n \t MAIN MENU:");
            System.out.println("\n 1) Renting out Parking Spot \n 2) Adding Parking Spot to Data base " +
                    "\n 3) View Parking Spots \n 4) EXIT");

            // Using the Scanner to receive an input from the user
            System.out.println("\n Please choose the number of your option!");
            int option = keyboard.nextInt();


            // Option 1 - "Renting out parking spot" - if statement

            if (option == 1) {

                System.out.println("\n Hello! In which city will your client like to park? Bogota or Cali?");
                String cityChoice = keyboard.next();

               // User-Defined Object
                Looking_Spot lookingForSpot = new Looking_Spot();


                if (cityChoice.equals("Bogota") || cityChoice.equals("bogota")) {

                    System.out.println();
                    System.out.println("\n Which day will your client want to rent the spot?");
                    System.out.println("\n 1) Weekdays \n 2) Weekends");
                    whichday = keyboard.nextInt();

                    if (whichday == 1) {
                        lookingForSpot.availableSpotsBogotaWeekDay(BogotaWeekDay);
                    }
                    else if (whichday == 2) {

                        lookingForSpot.availableSpotsBogotaWeekEnds(BogotaWeekEnds);
                    }

                    else {
                        System.out.println("ERROR! Please input a correct day. ");
                    }

                    exit++;
                } else if (cityChoice.equals("Cali") || cityChoice.equals("cali")) {

                    System.out.println();
                    System.out.println("\n Which day will your client want to rent the spot?");
                    System.out.println("\n 1) Weekdays \n 2) Weekends");
                    whichday = keyboard.nextInt();

                    if (whichday == 1) {
                        lookingForSpot.availableSpotsCaliWeekDay(CaliWeekDay);

                    }
                    else if (whichday == 2) {
                        lookingForSpot.availableSpotsCaliWeekEnds(CaliWeekEnds);
                    }

                    else {
                        System.out.println("ERROR! Please input a correct day. ");
                    }


                    exit++;
                }
                else {
                    System.out.println("\n ERROR! Please imput a correct city. Mind your spelling");
                }


            }


            // Option 2 - "Adding Spot" - else if statement

            else if (option == 2) {

                System.out.println("\n Adding Parking Spot to your data base...");

                System.out.println("\n \n \t YOUR CLIENT'S CONTACT INFORMATION:");
                System.out.println("\n First Name: ");
                String nameclient = keyboard.next();

                System.out.println("\n Last Name: ");
                String lastName = keyboard.next();

                System.out.println("\n Email address: ");
                String email = keyboard.next();

                System.out.println("\n Phone Number: ");
                String phoneNumber = keyboard.next();


                System.out.println("\n \t PARKING SPOT INFORMATION: ");

                System.out.println("\n City of your clients spot. Bogota or Cali?: ");
                String City = keyboard.next();


                //USer-Defined Object
                Renting_Spot RentMySpot = new Renting_Spot();


                if (City.equals("Bogota") || City.equals("bogota")) {

                    System.out.println();
                    System.out.println("\n Which days will your client be renting the spot?");
                    System.out.println("\n 1) Weekdays \n 2) Weekends ");
                    whichday = keyboard.nextInt();

                    if (whichday == 1) {
                        RentMySpot.addSpotBogotaWeekDay(BogotaWeekDay);
                    } else if (whichday == 2) {
                        RentMySpot.addSpotBogotaWeekEnds(BogotaWeekEnds);
                    }

                    else {
                        System.out.println("ERROR! Please input a correct day. ");
                    }


                    System.out.println();
                    System.out.println("\n The parking spot of your client " + nameclient + " " + lastName + " has been " +
                            "added to your data base and it will be available to rent it out");


                } else if (City.equals("Cali") || City.equals("cali")) {

                    System.out.println();
                    System.out.println("\n  Which days will your client be renting the spot?");
                    System.out.println("\n 1) Weekdays \n 2) Weekends ");
                    whichday = keyboard.nextInt();

                    if (whichday == 1) {
                        RentMySpot.addSpotCaliWeekDay(CaliWeekDay);
                    } else if (whichday == 2) {
                        RentMySpot.addSpotCaliWeekEnds(CaliWeekEnds);
                    }

                    else {
                        System.out.println("ERROR! Please input a correct day. ");
                    }


                    System.out.println();
                    System.out.println("\n The parking spot of your client " + nameclient + " " + lastName + " has been " +
                            "added to your data base and it will be available to rent it out");


                } else {

                    System.out.println("\n ERROR! Please input a correct city. Mind your spelling");
                }


            }

            // Option 3 - View available parking spots - else if statement

            else if (option == 3) {

                ViewParkingSpots();
            }


            // Option 4 - "EXIT" - else if statement

            else if (option == 4) {


                // Serealization of Arralist: BogotaWeekDay
                try {
                    FileOutputStream fos = new FileOutputStream("Bogota Week Days");
                    ObjectOutputStream oos = new ObjectOutputStream(fos);
                    oos.writeObject(BogotaWeekDay);
                    oos.close();
                    fos.close();
                } catch (IOException ioe) {
                    ioe.printStackTrace();
                }



                // Serealize Arralist BogotaWeekEnds
                try {
                    FileOutputStream fos = new FileOutputStream("Bogota Week Ends");
                    ObjectOutputStream oos = new ObjectOutputStream(fos);
                    oos.writeObject(BogotaWeekEnds);
                    oos.close();
                    fos.close();
                } catch (IOException ioe) {
                    ioe.printStackTrace();
                }


                // Serealize Arralist CaliWeekDay
                try {
                    FileOutputStream fos = new FileOutputStream("Cali Week Days");
                    ObjectOutputStream oos = new ObjectOutputStream(fos);
                    oos.writeObject(CaliWeekDay);
                    oos.close();
                    fos.close();
                } catch (IOException ioe) {
                    ioe.printStackTrace();
                }


                // Serealize Arralist CaliWeekEnds
                try {
                    FileOutputStream fos = new FileOutputStream("Cali Week Ends");
                    ObjectOutputStream oos = new ObjectOutputStream(fos);
                    oos.writeObject(CaliWeekEnds);
                    oos.close();
                    fos.close();
                } catch (IOException ioe) {
                    ioe.printStackTrace();
                }


                // Break Statement
                System.out.println("\n See you soon " + name + "!");

                break;


                // else Statement - Error handling
            } else {
                System.out.println("\n ERROR! Please input a correct option. Between 1 and 4");
            }


        }


        // Viewing available parking spots method
    }

    private static void ViewParkingSpots() {

        System.out.println("\n These are the available parking spots on your data base:");

        System.out.println("\n Bogota During Week Days: ");

        System.out.println("\n \t " + BogotaWeekDay);

        System.out.println("\n Bogota During Week Ends: ");

        System.out.println("\n \t " + BogotaWeekEnds);

        System.out.println("\n Cali During Week Days: ");

        System.out.println("\n \t " + CaliWeekDay);

        System.out.println("\n Cali During Week Ends: ");

        System.out.println("\n \t " + CaliWeekEnds);


    }

}
