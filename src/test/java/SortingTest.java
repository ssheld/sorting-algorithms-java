import com.ssheld.Selection;
import com.ssheld.SortingUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class SortingTest {

    private Integer[] arr;

    @BeforeEach
    void setup() {
        arr = new Integer[]{3, -2, 5, 0, -4, 30, 12, 9, -22};
    }

    @Test
    void selectionSort() {
        Selection.sort(arr);
        SortingUtils.isSorted(arr);
    }
}
