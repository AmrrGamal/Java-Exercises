
package ch_02;


import java.util.Scanner;


public class MiniProject {
public static void main(String[] args) {

    double investmentAmount;
    double annualInterest;
    double  mounthlyInterest;
    double futureInvestment;
    int numOfYear;
    
    
   Scanner input = new Scanner(System.in);

    
   System.out.println("enter investment amount :");
   investmentAmount=input.nextDouble();
   
  
   System.out.println("enter annual interest rate :");
   annualInterest=input.nextDouble();
    
  System.out.println("enter num of year :");
  numOfYear=input.nextInt();

  mounthlyInterest=annualInterest/12;
  
  futureInvestment=investmentAmount* Math.pow(1+ mounthlyInterest/100,numOfYear*12);
  
    System.out.println("the future value is : "+futureInvestment);

  
  
  
  
  
  
}
}
