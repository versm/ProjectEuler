package Problem_16;

import java.math.BigInteger;

public class P_16 {
    public static void main(String[] args) {

        BigInteger bigInteger = BigInteger.valueOf(2);
        bigInteger=bigInteger.pow(1000);

        System.out.println(bigInteger);

        String [] singleDigits = bigInteger.toString().split("");
        int sum = 0;

        for (int i = 0; i < singleDigits.length; i++) {
            sum+=Integer.valueOf(singleDigits[i]);
        }
        System.out.println(sum);
    }
}
/*

2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
What is the sum of the digits of the number 2^1000?

 */
