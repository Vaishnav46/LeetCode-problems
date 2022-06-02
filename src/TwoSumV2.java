public class TwoSumV2 {

    public int[] solution(int[] nums,int target){

        for(int i=0;i<nums.length;i++){
            for(int j =0;j<nums.length;j++){
                int complement = target - nums[i];

                if(complement == nums[j]){
                    return new int[] {i,j};
                }
            }
        }
        throw new IllegalArgumentException("no match");
    }

    public static void main(String[] args) {
        TwoSumV2 twoSum = new TwoSumV2();

        int arr[] = {1,2,3,4,5,6,7,8};
        int target = 10;
        int res[] = twoSum.solution(arr,target);

        for (int i:res)
        System.out.println(i);

    }
}
