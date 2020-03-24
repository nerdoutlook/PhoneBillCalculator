package Chapter5;

import java.util.Scanner;

/*
 *Calculate the final total a customer's cell phone bill
 * Allow the operator to input the plan fee and the number of overage minutes
 *Charge the user 0.25 for every minute of overage and 15% tax on the subtotal
 */
public class PhoneBillCalculator {

    //Initialize what we know
    static double planFee;
    static double numberOfOverageMinutes;
    static double chargeOnOverage = 0.25;

    public static void main(String[] args) {
        //Get what we don't know
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter base cost of the plan:");
        planFee = scanner.nextDouble();

        System.out.println("After a month of Cell Phone Usage.");
        System.out.println(" ");
        System.out.println("Enter the number of overage minutes:");
        numberOfOverageMinutes = scanner.nextInt();
        scanner.close();
        System.out.println(" ");

        double overage = overageBill();
        double taxOnOverageMinutes = taxValue(overage);

        System.out.println("Phone Bill Statement");
        System.out.println("Base Plan: " + planFee);
        System.out.println("Bill on overage minutes = $" + overage);
        System.out.println("Tax: $" + taxOnOverageMinutes);
        System.out.println("Total Phone Bill For The Month = $" + (planFee + overage + taxOnOverageMinutes));
    }

    public static double overageBill (){
        double overageBill = chargeOnOverage * numberOfOverageMinutes;
        return  overageBill;
    }

    public static double taxValue (double overageBill){
        double percentageOfTax = 0.15;
        double calculateTax = percentageOfTax * (overageBill+planFee);
        return calculateTax;
    }



}
