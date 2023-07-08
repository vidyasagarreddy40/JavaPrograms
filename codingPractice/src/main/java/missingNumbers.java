import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class missingNumbers {

    public static void main(String[]args){
        Integer [] nums= {4,6,2,0,9,5};
        int smallest=nums[0];
        int largest=nums[0];

        List<Integer> ll= new ArrayList<Integer>(Arrays.asList(nums));

        for(int i=0;i<nums.length;i++){
            if(nums[i]>largest){
                largest=nums[i];
            }
            if(nums[i]<smallest){
                smallest=nums[i];
            }
        }
        for(int j=smallest;j<=largest;j++){

            if(!ll.contains(j)) {
                System.out.print(j + " ");
            }
        }
    }

}
