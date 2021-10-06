package Day1;

import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class FoodOrderingSystem
    {

        public static void main(String args[])
            {
                int choice;
                do {
                        System.out.println("Welcome to food ordering System!!!");
                        System.out.println("********************************");
                        System.out.println("1 . Pizza -$11 (Large)");
                        System.out.println("2 . Chicken Burger -$6");
                        System.out.println("3 . Beef Burger -$7.5");
                        System.out.println("4 . Chicken Nuggets -$5 (5 pieces)");
                        System.out.println("0 . Exit");
                        System.out.println("********************************");
                        System.out.println("Please enter your choice in appropriate format (for example enter 1) ");
                        Scanner scan=new Scanner(System.in);
                        choice=scan.nextInt();
                        System.out.println("");
                        switch (choice)
                        {
                            default:
                                     System.out.println("Wrong Input!!! Please enter the appropriate choice");
                                     break;
                            case 1:
                                     System.out.println("Thanks for ordering Pizza. Your payment is $11");
                                     break;
                            case 2:
                                     System.out.println("Thanks for ordering chicken burger. Your payment is $6");
                                     break;
                            case 3:
                                     System.out.println("Thanks for ordering beef burger. Your payment is $7.5");
                                     break;
                            case 4:
                                     System.out.println("Thanks for ordering chicken nuggets. Your payment is $5");
                                     break;
                            case 0:
                                     break;
                        }

                    }while(choice!=0);


            }
    }
