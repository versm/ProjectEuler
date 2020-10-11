package Problem_14;

import java.util.ArrayList;
import java.util.List;

public class P_14 {
    public static void main(String[] args) {

        List<Long> longestChain=new ArrayList<>();
        List<Long> currentChain=new ArrayList<>();
        long tmp;

        for (int i = 1; i < 1000000; i++) {
            currentChain=new ArrayList<>();
            currentChain.add((long)i);
            tmp=i;

            while(tmp != 1){
                if(tmp % 2 == 0)
                    tmp=tmp/2;
                else
                    tmp=3*tmp+1;

                currentChain.add(tmp);
            }

            if(currentChain.size()>longestChain.size())
                longestChain=currentChain;

        }

        System.out.println(longestChain.get(0));


    }
}

/*

The following iterative sequence is defined for the set of positive integers:

n → n/2 (n is even)
n → 3n + 1 (n is odd)

Using the rule above and starting with 13, we generate the following sequence:
13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1

It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.

Which starting number, under one million, produces the longest chain?

NOTE: Once the chain starts the terms are allowed to go above one million.

 */
