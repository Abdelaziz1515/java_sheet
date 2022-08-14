package lab9;


import java.util.*;



public class Separation {
    String s;
    List<Integer>integers=new ArrayList<>();
    public void getInteger() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("input numbers:");
        String s =  scanner.next();
        this.s = s;
    }
    public void separated(){



         StringTokenizer sn=new StringTokenizer(s, ",");



         while (sn.hasMoreTokens()){

             integers.add(Integer.valueOf(sn.nextToken()));
         }
        System.out.println(integers);






    }
    public void computeAverage(){
        int sum=0;
        for (int i:integers){
            sum=sum+i;


        }
        System.out.println(sum);
        double average=sum/(integers.size());
        System.out.println(average);
    }


}
