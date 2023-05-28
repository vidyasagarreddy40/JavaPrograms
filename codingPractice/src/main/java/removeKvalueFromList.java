import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class removeKvalueFromList {

    public static void main(String [] args){
        Integer k=10;
        List<Integer> li= new LinkedList<Integer>();
        li.add(1);
        li.add(4);
        li.add(5);
        li.add(10);
        li.add(11);
        li.add(16);
        li.add(3);
        li.add(10);
        removeKvalueFromList vv=new removeKvalueFromList();
        vv.solution(li, k);
    }

    List<Integer> solution(List<Integer> ll,int k){
        ll.removeAll(Arrays.asList(k));
     return ll;
    }

}
