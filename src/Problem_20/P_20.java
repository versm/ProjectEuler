package Problem_20;

import java.math.BigInteger;
import java.util.Arrays;

public class P_20 {
    public static void main(String[] args) {

        int sum = Arrays.stream(factorial(100).toString().split("")).mapToInt(Integer::parseInt).sum();

        System.out.println(sum);

    }
    static BigInteger factorial(int number){

        if(number <= 2)
            return new BigInteger(String.valueOf(number));

        return new BigInteger(String.valueOf(number)).multiply(factorial(number-1));

    }
}

/*

n! means n × (n − 1) × ... × 3 × 2 × 1

For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.

Find the sum of the digits in the number 100!

*/
