/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amagocalcu;
import java.util.Scanner;
/**
 *
 * @author Wie
 */
public class Amagocalcu {

    public static void main(String[] args) {
     Scanner input= new Scanner(System.in);

System.out.println("Please enter the initial amount loaned> ");
double InitialAmountLoan = input.nextDouble();

System.out.println("Please enter the annual interest rate> ");
double AnnualInterestRate = input.nextDouble();

System.out.println("Please enter the monthly repayment amount> ");
double MonthlyRepayment = input.nextDouble();	

double InitialBalance = +InitialAmountLoan;
System.out.println("Initial balance = " +InitialBalance );
System.out.println();

double AmountOfInterest =0;

double MonthlyRate = (+AnnualInterestRate­/100) /12;
double Balance =InitialAmountLoan + (+InitialAmountLoan * +MonthlyRate) - +MonthlyRepayment;

int count = 1;

System.out.println("Balance at Month " +count+ " is " +Balance+ " after making a payment of " +MonthlyRepayment );
System.out.println();

while (Balance > 0){
if (Balance > 100)
Balance = Balance + (+Balance * +MonthlyRate) - +MonthlyRepayment;

else if (Balance <100)
Balance = 0;

count = count +1;	 

System.out.println("Balance at Month " +count+ " is " +Balance+ " after making a payment of " +MonthlyRepayment );
System.out.println();


}
System.out.println("Loan will take " +count+ " months to pay off a lone of " +InitialAmountLoan); 
        
    }
    
}
