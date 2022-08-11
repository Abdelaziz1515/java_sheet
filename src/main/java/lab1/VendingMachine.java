package lab1;


import java.util.Scanner;

public class VendingMachine {
    int cents;
    int quarter;
    int dime;
    int nickel;



    public void enterPrice(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter price of item\n" +
                "(from 25 cents to a dollar, in 5-cent increments):");
        int cents=scanner.nextInt();
        this.cents=cents;
    }
    public void calculateCost(){
        System.out.println("You bought an item for 45 cents and gave me a dollar,\n" +
                "so your change is\n");

        int temporary=100-cents;
        quarter=temporary/25;
        temporary=temporary-quarter*25;
        dime=temporary/10;
        temporary=temporary-dime*10;
        nickel=temporary/5;

        System.out.println(quarter+"quarters\n"+dime+"dimes\n"+nickel+"nickels\n");
    }
}
