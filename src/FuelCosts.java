import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double milesPerGallon = 0;
        double pricePerGallon = 0;
        double gasPerTank = 0;
        double cost = 0;
        double distance = 0;
        double milesLeft = 100;

        System.out.print("What is the number of gallons in your cars tank: ");
        if (in.hasNextDouble()){
            gasPerTank = in.nextDouble();
        }else {
            System.out.println("Invalid Answer, start over");
            return;
        }
        System.out.println("");
        System.out.print("What is your car's miles per gallon: ");
        if (in.hasNextDouble()){
            milesPerGallon = in.nextDouble();
        }else {
            System.out.println("Invalid Answer, start over");
            return;
        }
        System.out.println("");
        System.out.print("What is the price of gas per gallon: ");
        if (in.hasNextDouble()){
            pricePerGallon = in.nextDouble();
        }else {
            System.out.println("Invalid Answer, start over");
            return;
        }

        // print the cost per 100 miles
        cost = pricePerGallon / milesPerGallon * 100;
        System.out.println("");
        System.out.printf("The cost for your car to go 100 miles is: $ %.2f%n", cost);


        distance = gasPerTank * milesPerGallon;
        System.out.println();
        System.out.printf("Your car can go %1.2f miles", distance);


        System.out.println("");
        System.out.println("");
        System.out.println("");






    }
}
