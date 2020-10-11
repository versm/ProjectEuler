package Problem_17;

public class P_17 {
    public static void main(String[] args) {

        int lettersUsed=0;

        for (int i = 1; i <= 1000; i++) {
            lettersUsed+=countLettersInWords(i);
        }

        System.out.println(lettersUsed);


    }
    static int countLettersInWords(int number){

        String [] from1to19= {"","one","two","three","four","five","six","seven","eight","nine","ten",
                "eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nighteen"};

        String [] tens = {"","","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};

        if(number >= 1 && number <= 19)
            return from1to19[number].length();
        else if(number >= 20 && number <= 90 && number % 10 == 0)
            return tens[number/10].length();
        else if(number >= 20 && number <= 99 )
            return tens[number/10].length() + from1to19[number % 10].length();
        else if(number >= 100 && number <= 900 && number % 100 == 0)
            return from1to19[number/100].length()+"hundred".length();
        else if(number >= 100 && number <= 919 && number%100 >=1 && number%100 <= 19)
            return from1to19[number/100].length()+"hundred".length()+"and".length()+from1to19[number%100].length();
        else if(number >= 100 && number <= 999)
            return from1to19[number/100].length()+"hundred".length()+"and".length()+tens[(number%100)/10].length()+from1to19[(number%100)%10].length();
        else if(number==1000)
            return "onethousand".length();

        return 0;
    }
}

/*

If the numbers 1 to 5 are written out in words: one, two, three, four, five, then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.

If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, how many letters would be used?

NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and forty-two) contains 23 letters and 115 (one hundred and fifteen) contains 20 letters.
The use of "and" when writing out numbers is in compliance with British usage.

 */
