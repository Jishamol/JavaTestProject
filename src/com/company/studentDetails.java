package com.company;

import java.util.Scanner;

public class studentDetails {

    public static void main(String args[])
    {
        int sAge;
        String stname;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Student Name");
        stname=scan.next();
        System.out.println("Enter Student Age");
        sAge= scan.nextInt();
        System.out.println("Student details are:");
        System.out.println("Name is :"+stname);
        System.out.println("Age is :"+sAge);
    }
}
