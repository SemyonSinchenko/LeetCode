package PalindromeNumber;

/*
Determine whether an integer is a palindrome.
An integer is a palindrome when it reads the same backward as forward.
 */

class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        else if(x < 10) return true;
        else {
            int digit;
            int origin = x;
            int res = 0;
            while(x > 0) {
                digit = x % 10;
                x /= 10;
                res = res * 10 + digit;
            }

            return (origin == res);
        }
    }
}
