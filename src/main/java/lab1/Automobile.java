package lab1;

import java.util.Scanner;

public class Automobile {
    int distance;
    int fuelConsumption;
    int price;


    public void getInput(){
        Scanner scanner=new Scanner(System.in);
        System.out.print(" input the distance of the commute in miles:");
        int distance=scanner.nextInt();
        this.distance=distance;
        System.out.print("the automobile's fuel consumption rate in miles per gallon:");
        int fuelConsumption=scanner.nextInt();
        this.fuelConsumption=fuelConsumption;
        System.out.print("the price of a gallon of gas:");
        int price=scanner.nextInt();
        this.price=price;
    }

    public void calculateCost(){
       int cost=  (distance/fuelConsumption)*price;
        System.out.println(cost+"$");
    }
}
