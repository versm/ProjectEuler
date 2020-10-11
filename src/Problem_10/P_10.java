package Problem_10;

public class P_10 {
    public static void main(String[] args) {

        long sum=0;

        for (int i = 0; i < 2000000; i++) {
            if (methods.MyMethods.isPrimeNumber(i))
                sum+=i;
        }

        System.out.println(sum);

    }
}
/*

The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
Find the sum of all the primes below two million.

 */
