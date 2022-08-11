package lab1;

import java.nio.Buffer;
import java.util.Scanner;

public class LinesOfText {
    String text;
    public void getLineOfText(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("input the line of text");
        String text=scanner.nextLine();
        this.text=text;
    }
    public void printUppercase(){
        System.out.println(text.toUpperCase());
    }
    public void printLowercase(){
        System.out.println(text.toLowerCase());
    }




}
