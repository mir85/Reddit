package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TalkingClock {

    private static String hours[] = {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12",
            "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23"};
    private static String mins[] = {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12",
            "13", "14", "15", "16", "17", "18", "19", "20", "30", "40", "50"};

    private static String hoursWord[] = {"twelve", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven"};
    private static String minutesWord[] = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven",
            "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty", "thirty", "forty", "fifty"};

    public static void main(String[] args) {

        System.out.println("Time in format xx:xx");
        Scanner scan = new Scanner(System.in);
        String getTime = scan.next();

        int n = getTime(getTime);

        if(n==1){
                System.out.println("Valid date format");
              }else{
                System.out.println("Invalid date format");
                System.exit(0);
              }

        char getTimeArray[] = getTime.toCharArray();

        String hour = String.valueOf(getTimeArray[0]) + String.valueOf(getTimeArray[1]);
        int hourint = Integer.parseInt(hour);
        String min = String.valueOf(getTimeArray[3]) + String.valueOf(getTimeArray[4]);
        int minint = Integer.parseInt(min);
        String min1 = String.valueOf(getTimeArray[3]);
        int minint1 = Integer.parseInt(min1);
        String min2 = String.valueOf(getTimeArray[4]);
        int minint2 = Integer.parseInt(min2);

        String ampm = " pm";

        if (Integer.parseInt(hour) > 12) {
            hourint = hourint - 12;
            ampm = " pm";
        }

        for (int i = 0; i < hours.length - 1; i++) {
            if (Integer.parseInt(hours[i]) == hourint) {
                System.out.print("It is " + hoursWord[i]);
            }
        }
                if (min.contains("00")) {
                    System.out.println(ampm);
                }
                else
                    if (Integer.parseInt(min) <= 20) {
                        for (int j = 0; j < mins.length; j++) {
                            if (mins[j].contains(min))
                                if (Integer.parseInt(min) <= 10)
                                System.out.print(" oh" + " " + minutesWord[j - 1] + ampm);
                                else System.out.print(" " + minutesWord[j - 1] + ampm);
                        }
                    }
                else if (minint > 20 && minint < 60) {
                    for (int k = 20; k < mins.length; ++k) {
                        if (mins[k].contains(min1))

                            System.out.print(" " + minutesWord[k - 1]);
                    }
                    for (int l = 0; l < 10; l++) {
                        if (mins[l].contains(min2))
                            System.out.print(" " + minutesWord[l - 1] + ampm);
                    }
                }



        }
    public static int getTime(String s1) {
        if(s1.matches("[0-9]{2}[:]{1}[0-9]{2}"))
            {
            SimpleDateFormat sdf=new SimpleDateFormat("HH:mm");
            sdf.setLenient(false);
            try {
                Date d1=sdf.parse(s1);
                return 1;
                } catch (ParseException e) {
                return -1;
                }
            }
        else
          return -1;
        }

}