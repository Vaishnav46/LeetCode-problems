public class RemoveZeros {

    public void Solution(int[] nums){

        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != 0){
                nums[j] = nums[i];
                j++;

                System.out.println(nums[i]);

            }





        }

    }

    public static void main(String[] args) {
        RemoveZeros rz = new RemoveZeros();
        int[] arr = {0,1,0,3,12};
        rz.Solution(arr);
    }

}
