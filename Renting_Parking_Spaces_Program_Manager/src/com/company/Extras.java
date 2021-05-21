package com.company;

public class Extras {

    public Extras(){


    }

    static int priceParkWeekDays = 15000;

    static int priceParkWeekends = 10000;

    static int priceMonth = 250000;




    // Method to calculate parking space price during week days
    public static int priceWeekDays() {

        int pwd = priceParkWeekDays * Looking_Spot.days;

        return pwd;

    }


    // Method to calculate parking space price in week ends.
    public static int priceWeekends() {

        int pwe = priceParkWeekends * Looking_Spot.days;

        return pwe;
    }

    // Method to calculate monthly promotion
    public static int priceMonth(){


        return priceMonth;

    }


}
