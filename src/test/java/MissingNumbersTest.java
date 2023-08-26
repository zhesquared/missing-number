import eugeny.borisov.MissingNumbers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MissingNumbersTest {

    MissingNumbers missingNumbers = new MissingNumbers();

    @Test
    public void testFirstExample() {
        int[] exampleArray = new int[]{5, 0, 1, 3, 2};
        int result = missingNumbers.findMissingNumber(exampleArray, false);
        Assertions.assertEquals(4, result);
    }

    @Test
    public void testFirstExampleWhenNumbersInLastPositionIsTrue() {
        int[] exampleArray = new int[]{5, 0, 1, 3, 2};
        int result = missingNumbers.findMissingNumber(exampleArray, true);
        Assertions.assertEquals(4, result);
    }

    @Test
    public void testSecondExample() {
        int[] exampleArray = new int[]{7, 9, 10, 11, 12};
        int result = missingNumbers.findMissingNumber(exampleArray, false);
        Assertions.assertEquals(8, result);
    }

    @Test
    public void testWhenEmptyArray() {
        int[] exampleArray = new int[]{};
        int result = missingNumbers.findMissingNumber(exampleArray, false);
        Assertions.assertEquals(-1, result);
    }

    @Test
    public void testWhenAllNumbersInOrder() {
        int[] exampleArray = new int[]{253, 254, 255, 256, 257, 258, 259, 260, 261, 262, 263, 264, 265};
        int result = missingNumbers.findMissingNumber(exampleArray, false);
        Assertions.assertEquals(266, result);
    }

    @Test
    public void testWhenAllNumbersInOrderAndAddNumbersInLastPositionIsTrue() {
        int[] exampleArray = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21};
        int result = missingNumbers.findMissingNumber(exampleArray, true);
        Assertions.assertEquals(-1, result);
    }

    @Test
    public void testTwoWhenAllNumbersInOrderAndAddNumbersInLastPositionIsTrue() {
        int[] exampleArray = new int[]{538, 539, 540, 541, 544, 526, 527, 528, 529, 534, 542, 537, 530, 531, 543, 532, 533, 535, 536};
        int result = missingNumbers.findMissingNumber(exampleArray, true);
        Assertions.assertEquals(-1, result);
    }

    @Test
    public void testWhenOnlyOneNumberInArray() {
        int[] exampleArray = new int[]{69};
        int result = missingNumbers.findMissingNumber(exampleArray, false);
        Assertions.assertEquals(70, result);
    }

    @Test
    public void testWhenOnlyOneNumberInArrayAndAddNumbersInLastPositionIsTrue() {
        int[] exampleArray = new int[]{325};
        int result = missingNumbers.findMissingNumber(exampleArray, true);
        Assertions.assertEquals(-1, result);
    }

    @Test
    public void testWhenArrayIsUnsorted() {
        int[] exampleArray = new int[]{25, 33, 32, 27, 28, 26, 31, 29};
        int result = missingNumbers.findMissingNumber(exampleArray, false);
        Assertions.assertEquals(30, result);
    }

    @Test
    public void testWhenArrayIsUnsortedAndAddNumbersInLastPositionIsTrue() {
        int[] exampleArray = new int[]{13, 14, 23, 17, 16, 21, 11, 12, 15, 18, 24, 20, 19};
        int result = missingNumbers.findMissingNumber(exampleArray, true);
        Assertions.assertEquals(22, result);
    }
}
