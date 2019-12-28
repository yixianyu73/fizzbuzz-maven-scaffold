public class FizzBuzz {
    private static final String FIZZBUZZ = "FizzBuzz";
    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";
    private static final String ERROR = "Error";

    public static String fizzBuzz(int inputNum, int firstNum, int secondNum) {
        String result = String.valueOf(inputNum);

        if (inputNum <= 0) {
            result = String.valueOf(inputNum);
            return result;
        }

        if (firstNum <= 0 || secondNum <= 0) {
            result = ERROR;
            return result;
        }
        if (isFizz(inputNum, firstNum)) {
            result = FIZZ;
        }
        if (isBuzz(inputNum, secondNum)) {
            result = BUZZ;
        }
        if (isFizzBuzz(inputNum, firstNum, secondNum)) {
            result = FIZZBUZZ;
        }
        return result;
    }

    private static boolean isFizzBuzz(int inputNum, int firstNum, int secondNum) {
        return isFizz(inputNum, firstNum) && isBuzz(inputNum, secondNum);
    }

    private  static boolean isFizz(int inputNum, int firstNum) {
        return count(inputNum, firstNum);
    }

    private static boolean isBuzz(int inputNum, int secondNum) {
        return count(inputNum, secondNum);
    }

    private static boolean count(int inputNum, int num) {
        if (num == 0) {
            return false;
        } else {
            return (inputNum % num == 0 || String.valueOf(inputNum).contains(String.valueOf(num)));
        }
    }

}
