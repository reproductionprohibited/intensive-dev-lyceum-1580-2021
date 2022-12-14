public class BubbleSort {
    private static void bubbleSort(int[] srcArray) {
        for(int i = 0; i < srcArray.length; ++i) {
            for (int j = i + 1; j < srcArray.length; ++j) {
                if (srcArray[i] > srcArray[j]) {
                    int tmp = srcArray[i];
                    srcArray[i] = srcArray[j];
                    srcArray[j] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 65, 7, 1, 10, 64, 2};
        bubbleSort(array);
        for (int it: array) {
            System.out.print(it + " ");
        }
    }
}
