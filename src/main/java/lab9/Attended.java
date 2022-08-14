package lab9;

import java.util.*;

public class Attended {
    public record Student(String name){}


    public void getAttend(){
        List<String> students=new ArrayList<>();
        List<String> math=new ArrayList<>();
        List<String>both=new ArrayList<>();
        students.add("mohamed");
        students.add("ahmed");
        students.add("ali");
        students.add("manar ");


        math.add("hassan");
        math.add("ahmed");
        math.add("mona");
        math.add("ali");
        math.add("hanan ");



       for (String s:math){
           if (students.contains(s)){
               both.add(s);
               students.remove(s);
           }
       }
       math.addAll(students);
        System.out.println(both);
        System.out.println(students);
        System.out.println(math);



    }

}
