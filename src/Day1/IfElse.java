package Day1;

import java.util.Scanner;

    // if else based program
    public class IfElse
        {
        public static void main(String args[])
            {

                Scanner scan=new Scanner(System.in);
                System.out.println("Enter first number to compare");
                int firstNumber = scan.nextInt();
                System.out.println("Enter second number to compare");
                int secondNumber = scan.nextInt();
                System.out.println("Enter third number to compare");
                int thirdNumber = scan.nextInt();

                if (firstNumber > secondNumber && firstNumber > thirdNumber)  // true
                {
                      System.out.println("First Number is Greater ");
                } else if (secondNumber > firstNumber && secondNumber > thirdNumber)
                        {
                            System.out.println("Second Number is Greater ");
                        } else if (thirdNumber > firstNumber && thirdNumber > secondNumber)
                                {
                                    System.out.println("Third Number is Greater ");
                                } else if (firstNumber == secondNumber && firstNumber == thirdNumber)
                                        {
                                            System.out.println("All are Same ");
                                        }
             }
        }