package algo.haofan;

public class MergeSort {
    // Initiator which does nothing
    private MergeSort(){}

    // Recursively sorting [l .... r], where l is the index of most left item,
    // and r is the index of the most right item.
    private static void mergeSort(Comparable[] array, int l, int r) {
        // Base case: when l is equal to or greater than r, there is no item to be sorted
        if (l >= r) {
            return;
        }
        // the index of the middle item
        // in case of large integer when we add up l and r, we calculate the mid index in this way
        int mid = l + (r - l)/2;
        mergeSort(array, l, mid);
        mergeSort(array, mid + 1, r);
        merge(array, l, mid, r);
    }

    // Merge two ordered (ascending order) arrays
    // Array 1: starting from array[l] and ending at array[mid]
    // Array 2: starting from array[mid + 1] and ending at array[r]
    private static void merge(Comparable[] arr, int l, int mid, int r) {
        // auxiliary memory box, saving original array.
        Comparable[] auxiliary = new Comparable[r - l + 1];
        for (int i = l; i <= r; i++) {
            // Compared against the original array, the indexes of auxiliary are shifted
            // to the left by l;
            // Invariance:
            //            Suppose the index of an item in the original array is i,
            //            the index of this item in the auxiliary is i - l;
            auxiliary[i - l] = arr[i];
        }
        int k = l; // keep track of left array
        int j = mid + 1; // keep track of right array
        for (int i = l; i <= r; i++) {
            if (k > mid) {
                arr[i] = auxiliary[j - l];
                j++;
            } else if (j > r) {
                arr[i] = auxiliary[k - l];
                k++;
            } else if (auxiliary[k - l].compareTo(auxiliary[j - l]) < 0) {
                arr[i] = auxiliary[k - l];
                k++;
            } else {
                arr[i] = auxiliary[j - l];
                j++;
            }
        }
    }

    public static void mergeSort(Comparable[] arr) {
        int size = arr.length;
        mergeSort(arr, 0, size - 1);
    }
}
