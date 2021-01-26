package com.company.Slye;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is the name of your City?");
        String city = input.nextLine();
        System.out.println("What is the Zip Code?");
        int zip = input.nextInt();
        System.out.println("What is the high for the next day?");
        int a = input.nextInt();
        System.out.println("Next Day?");
        int b = input.nextInt();
        System.out.println("Next Day?");
        int c = input.nextInt();
        System.out.println("Next Day?");
        int d = input.nextInt();
        System.out.println("Next Day?");
        int e = input.nextInt();
        int[] dailyHighs = {a,b,c,d,e};

        double total = dailyHighs[0]+dailyHighs[1]+dailyHighs[2]+dailyHighs[3]+dailyHighs[4];
        double average = total/5;

        System.out.println("City: "+city+" Zip Code: "+zip+" Average High Temperature: "+average);
        }
    }