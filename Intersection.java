import java.util.ArrayList;
import java.util.Arrays;

class IntPair {
    int mFirst;
    int mLast;

    public IntPair(int first, int last) {
        this.mFirst = first;
        this.mLast = last;
    }

    @Override
    public String toString() {
        return "[" + mFirst + ", " + mLast + "]";
    }
}

public class Intersection {
    public static IntPair rangeIntersection(IntPair range1, IntPair range2) {
        if (range1.mFirst >= range2.mLast || range1.mLast <= range2.mFirst) {
            return null;
        }
        int intersectionFirst = Math.max(range1.mFirst, range2.mFirst);
        int intersectionLast = Math.min(range1.mLast, range2.mLast);
        return new IntPair(intersectionFirst, intersectionLast);
    }

    public static ArrayList<IntPair> intersection(ArrayList<IntPair> firstUserData, ArrayList<IntPair> secondUserData) {
        ArrayList<IntPair> resultArrayList = new ArrayList<>();
        for(IntPair firstRange: firstUserData) {
            for(IntPair secondRange: secondUserData) {
                IntPair resRange = rangeIntersection(firstRange, secondRange);
                if (resRange != null)
                    resultArrayList.add(resRange);
            }
        }
        return resultArrayList;
    }

    public static void main(String[] args) {
        ArrayList<IntPair> user1 = new ArrayList<>(Arrays.asList(
            new IntPair(17, 22),
            new IntPair(8, 12)
        ));

        ArrayList<IntPair> user2 = new ArrayList<>(Arrays.asList(
            new IntPair(5, 11),
            new IntPair(14, 18),
            new IntPair(20, 23),
            new IntPair(42, 55)
        ));
            
        for(IntPair resultPair: intersection(user1, user2)) {
            System.out.println(resultPair);
        }
        /*
        OUTPUT:
        
        [17, 18]
        [20, 22]
        [8, 11]
        */
    }
}
