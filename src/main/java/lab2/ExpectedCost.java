package lab2;

import java.util.Scanner;

public class ExpectedCost {
    double itemCost;
    double number_Years;
    double inflationRate;
    double estimatedCost;
    public void getInput(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Please enter the cost of the item: ");
        double itemCost=scanner.nextDouble();
        this.itemCost=itemCost;
        System.out.print("Please the number of years from now that the item will be purchased: ");
        double number_Years=scanner.nextDouble();
        this.number_Years=number_Years;
        System.out.print("Please enter the rate of inflation: ");
        double inflationRate=scanner.nextDouble();
        this.inflationRate=inflationRate;
    }


    public void estimatedCost(){
        inflationRate/=100;
        estimatedCost=itemCost;
        for (int i=0;i<number_Years;i++){
            estimatedCost=estimatedCost*(1+inflationRate);

        }
        System.out.println(estimatedCost);
    }
}
