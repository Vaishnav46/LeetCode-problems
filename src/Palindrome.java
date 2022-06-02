public class Palindrome {

    public boolean isPalindrome(int x) {
        int original = x, remainder, reversed = 0;

        if (original < 0) {
            return false;
        }

        while (x != 0) {
            remainder = x % 10;
            reversed = reversed * 10 + remainder;
            x = x / 10;
        }
        return original == reversed;
    }


    public static void main(String[] args) {
        boolean p = new Palindrome().isPalindrome(12221);
        System.out.println(p);
    }
}