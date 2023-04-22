
package ARRAYLIST;
import java.util.*;
public class Arraylist1 {
    public static void main(String[] args) {
         ArrayList<Integer>List =  new ArrayList<Integer>();
        List.add(2);
        List.add(6);
        List.add(3);
        List.add(7);
        List.add(8);
        List.add(4);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<List.size(); i++){
            if(max < List.get(i)){
                max= List.get(i);
            }
            else if(min> List.get(i)){
                min = List.get(i);
            }
            else{
                System.out.println(" not found");
            }
        }
        System.out.println("max number is="+  max);
        System.out.println("minimum number is = " + min);
        int span = max-min;
        System.out.println("span is: " + span);
    }
    
}
