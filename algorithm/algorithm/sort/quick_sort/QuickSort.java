package algorithm.sort.quick_sort;

public class QuickSort {

    public static void main(String[] args) {
        int[] array = {8, 4, 3, 7, 6, 5, 2, 1};
        quickSort(array, 0, array.length - 1);
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    public static void quickSort(int[] array, int left, int right) {
        if (left >= right) return;

        //분할
        int pivot = partition(array, left, right);

        quickSort(array, left, pivot - 1);  // 왼쪽 부분 배열 정렬
        quickSort(array, pivot + 1, right);  // 오른쪽 부분 배열 정렬
    }

    public static int partition(int[] array, int left, int right) {
        int pivot = array[left]; // 가장 왼쪽값을 피벗으로 설정
        int i = left;
        int j = right;

        while (i <= j) {
            while (i <= j && array[i] <= pivot) {
                i++;
            }
            while (i <= j && array[j] > pivot) {
                j--;
            }
            if (i < j) {
                swap(array, i, j);
            }
        }
        swap(array, left, j); // 피벗을 중앙으로 옮김
        return j;
    }

    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
