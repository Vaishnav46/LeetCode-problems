import java.util.HashMap;

public class TwoSumV3 {

    public int[] solution(int[] nums,int target){

        for(int i=0;i<nums.length;i++){

            HashMap<Integer,Integer> nums_map = new HashMap<>();
                int complement = target - nums[i];

                if(nums_map.containsKey(complement)){
                    return new int[] {nums_map.get(complement),i};
                }
            }

        throw new IllegalArgumentException("no match");
    }

    public static void main(String[] args) {
        TwoSumV3 two = new TwoSumV3();
        int arr[] = new int[] {1,2,3,4,5,6,7,8};
        int target = 10;
        two.solution(arr,target);
    }
}
