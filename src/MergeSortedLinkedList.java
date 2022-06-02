public class MergeSortedLinkedList {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

  public ListNode mergeList(ListNode list1,ListNode list2){

        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        while(list1!=null && list2!=null){

            if(list1.val<=list2.val){
                curr.next = list1;
                list1 = list1.next;
            }
            else {
                curr.next =list2;
                list2 = list2.next;
            }
            curr = curr.next;
        }

        return dummy.next;
  }

    public static void main(String[] args) {
        MergeSortedLinkedList ls = new MergeSortedLinkedList();


    }
}
