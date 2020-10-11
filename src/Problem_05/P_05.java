package Problem_05;

public class P_05 {
    public static void main(String[] args) {

        int n = 1;
        boolean isDivisible = false;

        while (!isDivisible){
            isDivisible=true;

            for (int i = 1; i <= 20 ; i++) {
                if(n % i != 0){
                    isDivisible=false;
                    n++;
                    break;
                }
            }
        }

        System.out.println(n);
    }
}
/*

2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

 */
