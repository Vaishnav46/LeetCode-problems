import java.util.HashMap;


/**
 * We are going o use Binary search because binary search is the most efficient to find a num from sorted array
 */
public class SearchInsertPosition {

    public int soution(int[] nums , int target) {

        int left = 0;
        int right =nums.length-1;

        while (left <= right){
            int mid = left +(right-left) / 2;

            if (nums[mid] == target) return mid;
            else if (nums[mid] > target){
                right= mid-1;
            }
            else
                left=mid+1;
        }
        return left;
    }


    public static void main(String[] args) {
        SearchInsertPosition sip = new SearchInsertPosition();
        int arr[] = new int[] {1,3,5,6,8,10};
        int res =sip.soution(arr,4);
        System.out.println(res);
    }
}
