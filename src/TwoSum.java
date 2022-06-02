/**
 * X+Y=target -->y = target -x
 * brute force method..lets go
 *
 * examples:
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 *
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
*/

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {

        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j< nums.length;j++){
                if(nums[j]==target-nums[i]){
                    return new int[] {i,j};
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int arr[]={2,7,11,15};
        int[] twoSum = new TwoSum().twoSum(arr,12);
        for(int i:twoSum) {
            System.out.println(i);

        }
    }
}
