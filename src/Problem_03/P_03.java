package Problem_03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P_03 {
    public static void main(String[] args) {

        long number =600851475143l;
        int p=2;
        System.out.println("Number: "+ number);

        List<Integer> primeFactors = new ArrayList<>();

        while(number >= p*p){
            if(number % p == 0) {
                number=number/p;
                primeFactors.add(p);
            }
            else
                p=p+1;
        }
        primeFactors.add((int)number);

        System.out.println("The largest prime factor: "+ primeFactors.get(primeFactors.size()-1));

    }
}
/*

The prime factors of 13195 are 5, 7, 13 and 29.
What is the largest prime factor of the number 600851475143 ?

 */
