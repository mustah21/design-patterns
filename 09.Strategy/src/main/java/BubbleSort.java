import java.util.Random;

public class BubbleSort implements SortingInterface {

    @Override
    public void sort(int[] array) {
        int n = array.length;
        int temp = 0;
        boolean swapped = false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }

    }



}



