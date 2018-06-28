import org.junit.Test;

import java.util.ArrayList;
import java.util.Random;

public class StopWatchTest {
    @Test
    public void testStartTime() {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        int[] result = bubbleSort(randomList(100000));
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
        stopWatch.stop();
        stopWatch.getElapsedTime();

    }

    private int[] randomList(int max) {
        int[] numberList = new int[max];
        for (int i = 0; i < numberList.length; i++) {
            numberList[i] = randomNumber(max);
        }
        return numberList;
    }

    private int randomNumber(int max) {
        Random random = new Random();
        return random.nextInt(max);
    }

    private int[] bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - i; j++) {
                if (array[j - 1] > array[j]) {
                    int subNumber = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = subNumber;
                }
            }
        }
        return array;
    }
}