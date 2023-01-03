import java.util.Arrays;

public class MissingNumber {
    
    /*
    Sum of numbers from 0 to n equals: S = (n + 1) * n / 2; ( n = size of the array )
    So, the missing number is: S - sum(array);
    */
    public static int findMissingNumber(int[] array) {
        int size = array.length;
        int arraySum = Arrays.stream(array).sum();
        return (size * (size + 1) / 2) - arraySum;
    }

    public static void main(String[] args) {
        int[] arrayTest1 = {0, 1, 2, 3, 4, 5};
        int resultTest1 = findMissingNumber(arrayTest1); // 6
        System.out.println(resultTest1);

        int[] arrayTest2 = {0, 1, 2, 4, 5};
        int resultTest2 = findMissingNumber(arrayTest2); // 3
        System.out.println(resultTest2);
    }
    
}
