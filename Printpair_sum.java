package ARRAYLIST;

import java.util.ArrayList;

public class Printpair_sum {
    public static boolean ispair(ArrayList<Integer> list,int target){
        int lp = 0;
        int Rp = list.size()-1;

        while(lp<Rp){
            if(list.get(lp)+list.get(Rp)==target){
                return true;
            }
            if(list.get(lp)+list.get(Rp)<target){
                lp++;
            }else{
                Rp--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target = 10;

        System.out.println(ispair(list, target));
    }
}
