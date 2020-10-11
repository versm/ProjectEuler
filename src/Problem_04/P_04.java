package Problem_04;

import methods.MyMethods;

public class P_04 {
    public static void main(String[] args) {

        int largestPalindrome=0;

        for (int i = 100; i < 999; i++)
            for (int j = 100; j < 999; j++)
                if(MyMethods.isPalidrome(i*j+"") && largestPalindrome < i*j)
                    largestPalindrome=i*j;

        System.out.println(largestPalindrome);
    }
}

/*

A palindromic number reads the same both ways.
The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
Find the largest palindrome made from the product of two 3-digit numbers.

 */
