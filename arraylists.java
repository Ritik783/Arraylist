package ARRAYLIST;
import java.util.ArrayList;
public class arraylists {
    public static void main(String[] args) {
        ArrayList<Integer> ob = new ArrayList<>();
        System.out.println("initial size of the :"+ ob.size());//print the blank arraylist.
        ob.add(1);//insert the element in the arraylist.
        ob.add(5);
        ob.add(7);
        ob.add(9);
        ob.add(4);
        ob.add(2);
        ob.add(8);
        ob.add(10);
        ob.add(12);
        ob.add(15);
        ob.add(14);
        ob.set(3,0);//change the value particular index.
        System.out.println(ob);
        ob.set(6,99);
        ob.remove(3);//remove the value of the particular index.
        System.out.println(ob);
        System.out.println("after the size of the values:"+ ob.size());
       // int min=Integer.MAX_VALUE;
        int min = ob.get(0);//initilize 0
        int max= ob.get(0);//initilize 0
        for(int i=0;i<ob.size();i++){
            //minimum number finding.
            if(min>ob.get(i)){
            min = ob.get(i);
        }
        //maximum number finding.
        if(max<ob.get(i)){
            max=ob.get(i);
        }
    }
        System.out.println("minimum number is:"+min);
        System.out.println("maximum element is:"+max);
        
    }
}