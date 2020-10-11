package Problem_02;

public class P_02 {
    public static void main(String[] args) {

        int sum=0;
        int newTerm=0;
        int previousTerm1 = 1;
        int previousTerm2 = 0;

        while(newTerm <= 4000000){
            newTerm = previousTerm1+previousTerm2;
            previousTerm2 = previousTerm1;
            previousTerm1 = newTerm;

            if(newTerm % 2 ==0)
                sum+=newTerm;
        }

        System.out.println(sum);
    }
}
/*


Each new term in the Fibonacci sequence is generated by adding the previous two terms.
By starting with 1 and 2, the first 10 terms will be:
1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.

 */