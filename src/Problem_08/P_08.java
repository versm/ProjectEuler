package Problem_08;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class P_08 {
    public static void main(String[] args) {

        List<String> allLines= new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();
        String [] singleDigits;
        long greatestProduct=0;

        try {
            allLines = Files.readAllLines(Paths.get("src/Problem_08/p08_data"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        for(String line: allLines)
            stringBuilder.append(line);

        singleDigits= stringBuilder.toString().split("");

        long checkedValue;


        for (int i = 0; i < singleDigits.length-13; i++) {
            checkedValue=1;
            for (int j = i; j < i+13 ; j++)
                checkedValue *= Integer.valueOf(singleDigits[j]);

            if(checkedValue > greatestProduct)
                greatestProduct=checkedValue;
        }

        System.out.println("Greatest product "+greatestProduct);

    }
}

/*
The four adjacent digits in the 1000-digit number that have the greatest product are 9 × 9 × 8 × 9 = 5832.
Find the thirteen adjacent digits in the 1000-digit number that have the greatest product.
What is the value of this product?
 */
