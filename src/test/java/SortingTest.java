import com.ssheld.Insertion;
import com.ssheld.Selection;
import com.ssheld.SortingUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortingTest {

    private Integer[] arr;

    @BeforeEach
    void setup() {
        arr = new Integer[]{3, -2, 5, 0, -4, 30, 12, 9, -22};
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
}
