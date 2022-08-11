package lab2;

import java.util.Scanner;

public class Approximated {

    double x;
    int n;
    public void getInteger(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("input x:");
        double x=scanner.nextDouble();
        this.x=x;

        System.out.print("input n:");
        int n=scanner.nextInt();
        this.n=n;
    }

    public double sumEx(){
       double sum=  x;
        for (int i=2;i<n;i++){
            sum+=(Math.pow(x,i))/factorial(i);
        }

        return  (sum+1);

    }

    public int factorial(int n){
        if (n==0){
            return 1;
        }
        else {

        return n*factorial(n-1);

        }
    }
}
