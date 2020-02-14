package NumSort;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;

public class NumberSort {
    public static void main(String[] args) {
        //This program takes a stream of data(100 randomly generated numbers) and prints out
        // the largest and smallest number. E.g. "Largest number is 9654"

        int[] randomNumbers = IntStream.generate(
                () -> ThreadLocalRandom.current().nextInt(0, 10000 + 1))
                .limit(100) // limits the infinite stream to just 100 numbers
                .boxed()
                .mapToInt(i -> i)
                .toArray();

        int largestNumber = Arrays.stream(randomNumbers)
                .max()
                .getAsInt();

        int smallestNumber = Arrays.stream(randomNumbers)
                .min()
                .getAsInt();



    }
}
