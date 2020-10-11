package Problem_12;

public class P_12 {
    public static void main(String[] args) {

        boolean hasDivisors=false;
        long triangleNumber=0;
        int k=0;
        long max=0;

        while (!hasDivisors){
            k++;
            triangleNumber+=k;

            if(numberOfDivisors(triangleNumber)>500)
                hasDivisors = true;
        }

        System.out.println(triangleNumber);

    }
    static int numberOfDivisors(long triangleNumber){

        int numberOfDivisors=0;

        for (int i = 1; i*i <= triangleNumber; i++)
            if(triangleNumber%i==0)
                numberOfDivisors++;

            return numberOfDivisors*2;
    }
}

/*

The sequence of triangle numbers is generated by adding the natural numbers. So the 7th triangle number would be 1 + 2 + 3 + 4 + 5 + 6 + 7 = 28.
The first ten terms would be:

1, 3, 6, 10, 15, 21, 28, 36, 45, 55, ...

Let us list the factors of the first seven triangle numbers:

     1: 1
     3: 1,3
     6: 1,2,3,6
    10: 1,2,5,10
    15: 1,3,5,15
    21: 1,3,7,21
    28: 1,2,4,7,14,28

We can see that 28 is the first triangle number to have over five divisors.

What is the value of the first triangle number to have over five hundred divisors?

 */
