package algo.haofan;

public class QuickSort {

    //Sort a given arr
    public static void sort(Comparable[] arr) {
        sort(arr, 0, arr.length - 1);
    }


    //Recursively sorting an array, starting from l and ending at r
    private static void sort(Comparable[] arr, int l, int r) {
        // Base case
        if (l >= r) {
            return;
        }

        int p = partition(arr, l, r);
        sort(arr, l, p);
        sort(arr, p + 1, r);
    }

    //Return an index p such that any element with index smaller than p will be smaller than arr[p]
    // and vice versa.
    private static int partition(Comparable[] arr, int l, int r) {
        int p = l;
        for (int i = l + 1; i <= r; i ++) {
            if (arr[i].compareTo(arr[l]) <= 0) {
                swap(arr, i, p + 1);
                p ++;
            }
        }
        swap(arr, l, p);
        return p;
    }

    private static void swap(Comparable[] arr, int i, int j) {
        Comparable temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
