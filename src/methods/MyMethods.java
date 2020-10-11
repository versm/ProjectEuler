package methods;

public class MyMethods {

    public static boolean isPrimeNumber(int number){

        if(number < 2)
            return false;

        for (int i = 2; i <= Math.sqrt(number); i++)
            if(number % i == 0)
                return false;

        return true;
    }

    public static boolean isPalidrome(String sequence){

        for (int i = 0; i < sequence.length()/2; i++) {
            if(!(sequence.charAt(sequence.length()-1-i) == sequence.charAt(i)))
                return false;
        }
        return true;
    }

}
