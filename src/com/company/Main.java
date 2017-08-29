package com.company;

import java.util.ArrayList;
import common.Month;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        System.out.println("Please choose a month.  Ex: January");
        ArrayList<Month> futureMonths= new ArrayList<>();
//
        Scanner sc = new Scanner(System.in);
        String month = sc.nextLine();

       switch (month){
           case "January": futureMonths.add(Month.JANUARY);
           case "February": futureMonths.add(Month.FEBRUARY);
           case "March": futureMonths.add(Month.MARCH);
           case "April": futureMonths.add(Month.APRIL);
           case "May": futureMonths.add(Month.MAY);
           case "June": futureMonths.add(Month.JUNE);
           case "July": futureMonths.add(Month.JULY);
           case "August": futureMonths.add(Month.AUGUST);
           case "September": futureMonths.add(Month.SEPTEMBER);
           case "October": futureMonths.add(Month.OCTOBER);
           case "November": futureMonths.add(Month.NOVEMBER);
           case "December": futureMonths.add(Month.DECEMBER);
           break;
           default: break;
       }

       if (futureMonths.isEmpty()) {
           System.out.println("Invalid month name.");
       } else {
           for (Month monthsName : futureMonths){
               System.out.println(monthsName);
           }
       }
    }
}
