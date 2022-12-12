import java.util.ArrayList;
import java.util.Collections;

class Range {
    private static ArrayList<Integer> rangeRight(Integer start, Integer end, Integer step, Boolean isRight) {
        ArrayList<Integer> range = range(start, end, step);
        if (isRight) { Collections.reverse(range); }
        return range;
    }

    private static ArrayList<Integer> rangeRight(Integer end, Integer step, Boolean isRight) {
        return rangeRight(0, end, step, isRight);
    }

    private static ArrayList<Integer> rangeRight(Integer end, Boolean isRight) {
        return rangeRight(0, end, 1, isRight);
    }

    private static ArrayList<Integer> rangeRight(Integer start, Integer end, Integer step) {
        return rangeRight(start, end, step, false);
    }

    private static ArrayList<Integer> rangeRight(Integer end, Integer step) {
        return rangeRight(0, end, step, false);
    }

    private static ArrayList<Integer> rangeRight(Integer end) {
        return rangeRight(0, end, 1, false);
    }

    private static ArrayList<Integer> range(Integer start, Integer end, Integer step) throws IllegalArgumentException {
        if ((end < start && step > 0) || (step == 0)) {
            throw new IllegalArgumentException("Impossible/Infinite range");
        }

        ArrayList<Integer> resultRange = new ArrayList<>();
        int currentValue = start;
        if (end < start) {
            step *= -1;
            while (currentValue > end) {
                resultRange.add(currentValue);
                currentValue += step;
            }
            return resultRange;
        }
        while (currentValue < end) {
            resultRange.add(currentValue);
            currentValue += step;
        }
        return resultRange;
    }

    private static ArrayList<Integer> range(Integer end, Integer step) {
        return range(0, end, step);
    }

    private static ArrayList<Integer> range(Integer end) {
        return range(0, end, 1);
    }

    public static void main(String[] args) {
        ArrayList<Integer> range1Params = range(10);
        ArrayList<Integer> range2Params = range(5, 2);
        ArrayList<Integer> range3Params = range(1, 5, 1);
        for (int i: range3Params) { System.out.print(i + " "); }

        System.out.println();

        for (int i: range2Params) { System.out.print(i + " "); }

        System.out.println();

        for (int i: range1Params) { System.out.print(i + " "); }
    }
}
