package lap3;

import javax.swing.plaf.IconUIResource;
import java.util.Scanner;

public class GCD {
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

    public void printNumber(){

        System.out.println((double) number1+"/"+(double) number2);
    }
    public void showValueFraction(){

        int gcd=calculateGDC(number1,number2);
        System.out.println(number1/gcd+"/"+number2/gcd);


    }
    public int calculateGDC(int number1,int number2){
        if (number2==0){
            return number1;
        }
        else {return calculateGDC(number2,number1%number2);}
    }
}
