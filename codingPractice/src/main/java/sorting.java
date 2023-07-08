import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class sorting {

    public static void main(String[] args) {

        Integer [] nums = {4, 2, 6, 9, 1};

        int largest = nums[0];
        int smallest = nums[0];
        List<Integer> listOfNums = new ArrayList<Integer>(Arrays.asList(nums));

        int l = 0, i;

        for (i = 0; i <=listOfNums.size();i++){
            for(int j=0;j<listOfNums.size();j++){
                if(listOfNums.get(j)<smallest){
                    smallest=listOfNums.get(j);
                    l=j;
                }
            }
            listOfNums.remove(l);
            l=i=0;
            //i=l;
            System.out.println(smallest);
            if(listOfNums.size()>0){
                smallest=listOfNums.get(0);
            }


        }

    }

}

