package Problem_07;

public class P_07 {
    public static void main(String[] args) {

        int numberOfPrimeNumbers=0;
        int k=1;

        while(numberOfPrimeNumbers != 10001){
            k++;
            if(methods.MyMethods.isPrimeNumber(k))
                numberOfPrimeNumbers++;
        }

        System.out.println("The 10001st prime number is "+ k);
    }
}
/*

By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
What is the 10 001st prime number?

 */
