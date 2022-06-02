import java.util.Stack;

public class RemoveElement {

    public int Solution(int[] nums,int val) {

        int j = 0;
        for (int i =0;i<nums.length;i++){
            if(nums[i] != val){
                nums[j]=nums[i];
                j++;
            }
        }
        return j;
}

    public static void main(String[] args) {
        RemoveElement rm = new RemoveElement();
        int[] arr = {1,1,1,2,2,3,3,4,5};
        int x =rm.Solution(arr,2);
        System.out.println(x);
    }
}
