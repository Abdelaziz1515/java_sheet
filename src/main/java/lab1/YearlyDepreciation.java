package lab1;

import java.util.Scanner;

public class YearlyDepreciation {

    double s;
    double p;
    double y;
    double d;

    public void getPurchasePrice (){
        Scanner scanner=new Scanner(System.in);
        System.out.print("input the purchase price:");
        double p=scanner.nextDouble();
        this.p=p;

        System.out.print("input number of years :");
        double y=scanner.nextDouble();
        this.y=y;


        System.out.print("input salvage value:");
        double s=scanner.nextDouble();
        this.s=s;

    }
    public void calculateYearlyDepreciation(){
        d=(p-s)/y;
        System.out.println("yearly depreciation :"+d);
    }
}
