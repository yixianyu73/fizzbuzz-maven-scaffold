public class FizzBuzz {
    private static final String FIZZBUZZ = "FizzBuzz";
    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";

    public static String fizzBuzz(int inputNum, int firstNum, int secondNum) {

        if (isFizzBuzz(inputNum, firstNum, secondNum)) {
            return FIZZBUZZ;
        }
        if (isFizz(inputNum, firstNum)) {
            return FIZZ;
        }
        if (isBuzz(inputNum, secondNum)) {
            return BUZZ;
        }
        return String.valueOf(inputNum);
    }

    private static boolean isFizzBuzz(int inputNum, int firstNum, int secondNum) {
        return isFizz(inputNum, firstNum) && isBuzz(inputNum, secondNum);
    }

    private  static boolean isFizz(int inputNum, int firstNum){
        return count(inputNum, firstNum);
    }

    private static boolean isBuzz(int inputNum, int secondNum){
        return count(inputNum, secondNum);
    }

    private static boolean count(int inputNum, int num){
        return (inputNum % num == 0 || String.valueOf(inputNum).contains(String.valueOf(num)));
    }

}