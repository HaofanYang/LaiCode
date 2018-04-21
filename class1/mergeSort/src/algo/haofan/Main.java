package algo.haofan;

public class Main {
    public static void main(String[] args) {
        Integer[] test1 = new Integer[]{1,2,51,7,8,9,0,4,3,40,11,33,44,25,61,37};
        print(test1);
        System.out.println();
        MergeSort.mergeSort(test1);
        print(test1);
    }

    private static void print(Comparable[] arr) {
        for (Comparable t : arr) {
            System.out.print(t + " ");
        }
    }
}
