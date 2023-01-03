import java.util.Arrays;

public class Compress {

    public static String getAppendValue(int startValue, int endValue) {
        if (startValue == endValue) {
            return startValue + ",";
        }
        return startValue + "-" + endValue + ",";
    }

    public static String compress(int[] list) {
        Arrays.sort(list);
        StringBuilder resultRangeStringBuilder = new StringBuilder();
        int startValue = list[0];
        for(int i = 1; i < list.length; ++i) {
            int currentValue = list[i];
            if (currentValue - list[i - 1] > 1) {
                resultRangeStringBuilder.append(getAppendValue(startValue, list[i - 1]));
                startValue = currentValue;
            }
        }
        resultRangeStringBuilder.append(getAppendValue(startValue, list[list.length - 1]));
        return resultRangeStringBuilder.deleteCharAt(resultRangeStringBuilder.length() - 1).toString();
    }

    public static void main(String[] args) {
        int[] listTest1 = {1, 4, 5, 2, 3, 9, 8, 11, 0};
        int[] listTest2 = {1, 4, 3, 2};
        int[] listTest3 = {1, 4};

        System.out.println(compress(listTest1));
        System.out.println(compress(listTest2));
        System.out.println(compress(listTest3));

        /*
        OUTPUT:

        0-5,8-9,11
        1-4
        1,4
        */
    }
}
