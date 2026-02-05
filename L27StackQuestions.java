import java.util.Stack;

public class L27StackQuestions {

    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }


    public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode temp=head;
        boolean isPalin=true;
        Stack<Integer> s=new Stack<>();

        while (slow!=null) {
            s.push(slow.val);
            slow=slow.next;
        }

        while (temp!=null) {
            int i=s.pop();
            if (i==temp.val) {
                isPalin=true;
            }else{
                isPalin=false;
                break;
            }

            temp=temp.next;
        }
        return isPalin;
    }

    public String simplifyPath(String path) {
        Stack<Character> str= new Stack<>();
        for(int i=0; i<path.length() ; i++){
            str.push(path.charAt(i));
        }

        for(int i=0; i<path.length() ; i++){
            if (str.peek()=='/'|| str.peek()=='.') {
                str.pop();
            }
        }
    }

    public int trap(int[] height) {
        int left=height[0];
        int right=height[height.length-1];
        int low=1;
        int high=height.length-2;
        int ans=0;
        while (low<=high) {
            if (left<right) {
                left=Math.max(left,height[low]);
                ans+=left-height[low];
                low++;
            }else{
                right=Math.max(right,height[high]);
                ans+=right-height[high];
                high--;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        
        
    }
}
