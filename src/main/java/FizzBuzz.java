public class FizzBuzz {
    private static final String FIZZBUZZ = "FizzBuzz";
    private static final String FIZZWHIZZ = "FizzWhizz";
    private static final String BUZZWHIZZ = "BuzzWhizz";
    private static final String FIZZBUZZWHIZZ = "FizzBuzzWhizz";
    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";
    private static final String WHIZZ = "Whizz";

    public static String fizzBuzz(int inputNum, int firstNum, int secondNum, int thirtyNum) {
        String result = String.valueOf(inputNum);

        if (inputNum <= 0) {
            throw new IllegalArgumentException("Invalid Input");
        }

        if (firstNum <= 0 || secondNum <= 0) {
            throw new IllegalArgumentException("Invalid Input");
        }
        if (isFizz(inputNum, firstNum)) {
            result = FIZZ;
        }
        if (isBuzz(inputNum, secondNum)) {
            result = BUZZ;
        }
        if (isFizz(inputNum, thirtyNum)) {
            result = WHIZZ;
        }
        if (isFizzBuzz(inputNum, firstNum, secondNum)) {
            result = FIZZBUZZ;
        }
        if (isFizzWhizz(inputNum, firstNum, thirtyNum)) {
            result = FIZZWHIZZ;
        }
        if (isBuzzWhizz(inputNum, secondNum, thirtyNum)) {
            result = BUZZWHIZZ;
        }
        if (isFizzBuzzWhizz(inputNum, firstNum, secondNum, thirtyNum)) {
            result = FIZZBUZZWHIZZ;
        }
        return result;
    }

    private static boolean isFizzBuzzWhizz(int inputNum, int firstNum, int secondNum, int thirtyNum) {
        return isFizz(inputNum, firstNum) && isBuzz(inputNum, secondNum) && isWhizz(inputNum, thirtyNum);
    }

    private static boolean isFizzBuzz(int inputNum, int firstNum, int secondNum) {
        return isFizz(inputNum, firstNum) && isBuzz(inputNum, secondNum);
    }

    private static boolean isFizzWhizz(int inputNum, int firstNum, int thirtyNum) {
        return isFizz(inputNum, firstNum) && isWhizz(inputNum, thirtyNum);
    }

    private static boolean isBuzzWhizz(int inputNum, int secondNum, int thirtyNum) {
        return isBuzz(inputNum, secondNum) && isWhizz(inputNum, thirtyNum);
    }

    private  static boolean isFizz(int inputNum, int firstNum) {
        return count(inputNum, firstNum);
    }

    private static boolean isBuzz(int inputNum, int secondNum) {
        return count(inputNum, secondNum);
    }

    private static boolean isWhizz(int inputNum, int thirtyNum) {
        return count(inputNum, thirtyNum);
    }

    private static boolean count(int inputNum, int num) {
        if (num == 0) {
            return false;
        } else {
            return (inputNum % num == 0);
        }
    }

}
