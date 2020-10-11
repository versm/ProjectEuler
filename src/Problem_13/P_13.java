package Problem_13;

import java.io.IOException;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class P_13 {
    public static void main(String[] args) {

        List<String> numbers;
        BigInteger result = new BigInteger("0");

        try {
            numbers= Files.readAllLines(Paths.get("src/Problem_13/p13_data"));

            for (String number : numbers)
                result=result.add(new BigInteger(number));

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(result.toString().substring(0,10));

    }
}

/*
Work out the first ten digits of the sum of the following one-hundred 50-digit numbers.
 */
