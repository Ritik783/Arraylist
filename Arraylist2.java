package ARRAYLIST;
import java.util.ArrayList;
import java.util.List;
public class Arraylist2 {
    public static void main(String[] args){
        List<List<Integer>> result= new ArrayList<>();
        result.add(new ArrayList<>());
        result.get(0).add(1);
    }
}
