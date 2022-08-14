package lab9;

import java.util.LinkedList;
import java.util.List;

public class RandomIntegers {
    List<Integer>even=new LinkedList<>();
    List<Integer>odd=new LinkedList<>();


    public void getNum(){
        int sumeven=0;
        int sumodd=0;
        for(int i=1;i<=100;i++){

            if(i%2==0){
                even.add(i);
                sumeven+=i;
            }
            else {
                odd.add(i);
                sumodd+=i;
            }
        }

        System.out.print(even);

        System.out.println(sumeven);
        System.out.print(odd);
        System.out.println(sumodd);
    }



}
