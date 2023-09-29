package Test;

import Questions.JosephusPerutation.JosephusPermutation;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import java.util.Arrays;
import java.util.List;


public class JosephusPermutationTest {

    @Test
    public void testJosephusPermutation() {
        // Test case 1
        List<Integer> inputList1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> expectedOutput1 = Arrays.asList(3, 1, 5, 2, 4);
        assertEquals(expectedOutput1, JosephusPermutation.josephusPermutation(inputList1, 3));

        // Test case 3: Edge case with a single element
        List<Integer> inputList3 = Arrays.asList(42);
        List<Integer> expectedOutput3 = Arrays.asList(42);
        assertEquals(expectedOutput3, JosephusPermutation.josephusPermutation(inputList3, 1));
    }
}
