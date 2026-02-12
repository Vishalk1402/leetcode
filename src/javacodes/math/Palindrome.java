package src.javacodes.math;

public class Palindrome {
    public static boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0))
            return false;
        int temp = x, result = 0;
        boolean ans = false;
        while (temp != 0) {//
            result += temp % 10;// 0
            temp /= 10;
            if (result < x)
                result *= 10;
        }
        if (x == result || x == 0)
            ans = true;
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
}