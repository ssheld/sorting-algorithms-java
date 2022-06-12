import com.ssheld.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortingTest {

    private Integer[] arr;
    private Integer[] arrLarge;
    @BeforeEach
    void setup() {
        arr = new Integer[]{3, -2, 5, 0, -4, 30, 12, 9, -4, -22};
        arrLarge = new Integer[]{53, 63, 72, 39, 27, 67, 12, 57, 48, 9, 70, 5, 99, 44, 67, 4, 68, 75, 11, 13, 31, 10, 60, 58, 91, 85, 8, 21, 86, 65, 77, 22, 84, 34, 14, 7, 69, 80, 51, 45, 78, 96, 61, 94, 88, 1, 43, 59, 23, 95, 83};
    }

    // Selection sort test
    @Test
    void selectionSort() {
        Selection.sort(arr);
        System.out.println(arr);
        assertEquals(true, SortingUtils.isSorted(arr));
    }

    // Insertion sort test
    @Test
    void insertionSort() {
        Insertion.sort(arr);
        assertEquals(true, SortingUtils.isSorted(arr));
    }

    // Mergesort test
    @Test
    void mergesort() {
        Merge.sort(arr);
        assertEquals(true, SortingUtils.isSorted(arr));
    }

    // Quicksort test for small array
    @Test
    void smallQuicksort() {
        Quick.sort(arr);
        assertEquals(true, SortingUtils.isSorted(arr));
    }

    // Quicksort test for large array
    @Test
    void largeQuicksort() {
        Quick.sort(arrLarge);
        assertEquals(true, SortingUtils.isSorted(arrLarge));
    }
}
