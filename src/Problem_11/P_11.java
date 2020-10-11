package Problem_11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class P_11 {
    public static void main(String[] args) {

        List<String> allLines = new ArrayList<>();
        int greatestProduct=0;

        try {
            allLines = Files.readAllLines(Paths.get("src/Problem_11/p11_data"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        String [][] numbersTmp = new String[allLines.size()][];

        for (int i = 0; i < numbersTmp.length; i++)
            numbersTmp[i]=allLines.get(i).split(" ");

        int [][] numbers = new int[numbersTmp.length][numbersTmp[1].length];

        for (int i = 0; i < numbersTmp.length; i++)
            for (int j = 0; j < numbersTmp[i].length; j++)
                numbers[i][j]= Integer.valueOf(numbersTmp[i][j]);


        for (int i = 0; i < numbers.length-4; i++)
            for (int j = 0; j < numbers[i].length-4; j++)
                greatestProduct= checkSquare(i,j,greatestProduct,numbers);

        System.out.println(greatestProduct);

    }
    //Checking all combination in 4x4 square
    static int checkSquare(int rowInitialIndex,int columnInitialIndex, int currentGreatestProduct, int [][] numbers){

        int greatestProduct=currentGreatestProduct;
        int tmp;

        for (int i = rowInitialIndex; i < rowInitialIndex+4; i++) {
            tmp=1;
            for (int j = columnInitialIndex; j < columnInitialIndex+4; j++) 
                tmp*= numbers[i][j];
            
            if(tmp > greatestProduct)
                greatestProduct=tmp;
        }

        for (int i = columnInitialIndex; i < columnInitialIndex+4; i++) {
            tmp=1;
            for (int j = rowInitialIndex; j < rowInitialIndex+4; j++) 
                tmp*= numbers[j][i];

            if(tmp > greatestProduct)
                greatestProduct=tmp;
        }

        tmp=numbers[rowInitialIndex][columnInitialIndex]*numbers[rowInitialIndex+1][columnInitialIndex+1]*numbers[rowInitialIndex+2][columnInitialIndex+2]*numbers[rowInitialIndex+3][columnInitialIndex+3];
        if(tmp > greatestProduct)
            greatestProduct=tmp;

        tmp=numbers[rowInitialIndex][columnInitialIndex+3]*numbers[rowInitialIndex+1][columnInitialIndex+2]*numbers[rowInitialIndex+2][columnInitialIndex+1]*numbers[rowInitialIndex+3][columnInitialIndex];
        if(tmp > greatestProduct)
            greatestProduct=tmp;

        return greatestProduct;

    }
}
/*
In the 20×20 grid below, four numbers along a diagonal line have been marked in red.
The product of these numbers is 26 × 63 × 78 × 14 = 1788696.
What is the greatest product of four adjacent numbers in the same direction (up, down, left, right, or diagonally) in the 20×20 grid?
 */
