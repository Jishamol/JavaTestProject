package Day1;

import java.util.Scanner;

    public class AdditionSubtraction {
        public static void main(String args[])
        {
             int FirstNumber,SecondNumber,addNum,subNum;
             Scanner scan=new Scanner(System.in);
             System.out.println("Enter the first number");
             FirstNumber=scan.nextInt();
             System.out.println("Enter the second number");
             SecondNumber= scan.nextInt();
             addNum=FirstNumber+SecondNumber;

                if (FirstNumber>=SecondNumber)
                 {
                      subNum=FirstNumber-SecondNumber;
                 }
                 else
                 {
                        subNum=SecondNumber-FirstNumber;
                 }

             System.out.println("Sum of two numbers is: "+addNum);
             System.out.println("Difference between two numbers is: "+subNum);
        }
    }
