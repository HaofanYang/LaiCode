package algo.haofan;
import org.junit.Test;
import static org.junit.Assert.*;

public class Main {
    @Test
    public void testQuickSort() {
        Integer[] input = new Integer[]{19,7,8,6,4,3,2,1};
        Integer[] exp = new Integer[]{1,2,3,4,6,7,8,19};
        assertNotEquals(input, exp);
        QuickSort.sort(input);
        assertEquals(exp, input);
    }

    public static void main(String[] args) {
        Integer[] input = new Integer[]{19,100,7,8,6,4,3,2,1};
        print(input);
        System.out.println();
        QuickSort.sort((input));
        print(input);
    }

    private static void print(Comparable[] arr) {
        for (Comparable a : arr) {
            System.out.print(a + " ");
        }
    }
}
