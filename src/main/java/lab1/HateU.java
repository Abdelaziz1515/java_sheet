package lab1;

import java.util.Scanner;

public class HateU {
    String text;
    public void getLineOfText(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("input the line of text");
        String text=scanner.nextLine();
        this.text=text;
    }

    public void checkLove(){

        System.out.println(text.replaceFirst("hate","love"));
    }
}
