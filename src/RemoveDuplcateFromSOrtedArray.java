import java.sql.Array;

public class RemoveDuplcateFromSOrtedArray {

    public int solution(int[] nums){
        int j=1;

        for(int i=0;i<nums.length-1;i++){

            if(nums[i] != nums[i+1]){
                nums[j] = nums[i+1];
                j++;
            }
        }
        return j;
    }

    public static void main(String[] args) {
        RemoveDuplcateFromSOrtedArray rm = new RemoveDuplcateFromSOrtedArray();
        int[] arr = {1,1,2,2,3,3,4,5};
        int x = rm.solution(arr);
        System.out.println(x);
    }
}
