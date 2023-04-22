package ARRAYLIST;

import java.util.ArrayList;

public class ContainningWater {
    public static int water(ArrayList<Integer> height){
        int maxwater =0;
        int leftp= 0;
        int rightp =height.size()-1;
        while(leftp<rightp){
            int ht = Math.min(leftp, rightp);
            int width = rightp-leftp;
            int curruntwater = ht*width;

            maxwater = Math.max(maxwater, curruntwater);
            if(height.get(leftp)<height.get(rightp)){
                leftp++;
            }else{
                rightp--;
            }
        }
        return maxwater;

    }
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(4);

        System.out.println(water(height));
        
    }
}
