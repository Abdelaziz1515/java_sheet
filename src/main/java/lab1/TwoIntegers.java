package lab1;

import java.util.Scanner;

public class TwoIntegers {


     int number1;
    int number2;

    public void getInteger(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("input number1:");
        int number_1=scanner.nextInt();
        this.number1=number_1;

        System.out.print("input number2:");
        int number_2=scanner.nextInt();
        this.number2=number_2;

    }

    public  int sumNumbers(){
        return number1+number2;
    }
    public  int differenceNumbers(){
        return number1-number2;
    }
    public  int productNumbers(){
        return number1*number2;
    }
}
