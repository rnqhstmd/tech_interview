package selection_sort;

import java.util.Arrays;

public class Selection_Sort {
    void selectionSort(int[] arr) {
        int temp;
        int indexMin = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            indexMin = i;
            for (int j = i + 1; j < arr.length; j++) {
                indexMin = j;
            }
            temp = arr[indexMin];
            arr[indexMin] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
