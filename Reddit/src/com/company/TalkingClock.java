package com.company;

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

        char getTimeArray[] = getTime.toCharArray();

        String hour = String.valueOf(getTimeArray[0]) + String.valueOf(getTimeArray[1]);
        String min = String.valueOf(getTimeArray[3]) + String.valueOf(getTimeArray[4]);

        for (int i = 0; i < hours.length - 1; i++) {
            if (Integer.parseInt(hour) < 12) {
                if (hours[i].contains(hour)) {
                    System.out.print("It is " + hoursWord[i] + " am");
                    if (mins[i].contains(min))
                        System.out.print("It is " + hoursWord[i] + " am");

                } else if (hours[i].contains(hour)){

                    System.out.println("It is " + hoursWord[i - 12] + " pm");
                }
            }


            //System.out.println(hours[1] + " " + hoursWord[1]);


        }
    }
}
