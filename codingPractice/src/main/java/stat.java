import java.util.HashSet;
import java.util.Set;

public class stat {

    public static void main(String []args){

       int[] a = new int[]{2, 1, 3, 5, 3, 2};
        Set<Integer> hs= new HashSet<Integer>();
        int b=0;
        for(int i=0;i<a.length;i++){
            if(!hs.contains(a[i])){
                hs.add(a[i]);
            }
            else{
                b=a[i];
                break;
            }
        }

    }
}
