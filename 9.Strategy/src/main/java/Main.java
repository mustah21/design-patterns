import java.util.Random;
import java.util.Locale;


public class Main {

    public static void main(String[] args) {

        Sorter sorter = new Sorter(new InsertionSort()  );


        Random random = new Random(30);
        int[] dataset1 = new int[31];
        int[] dataset2 = new int[100000];

        for (int i = 0; i < 30; i++) {
            dataset1[i] = random.nextInt(1000);
        }
        for (int i = 0; i < 100000; i++) {
            dataset2[i] = random.nextInt(10000000);
        }



        long start = System.nanoTime();

        sorter.sort(dataset1);
        //sorter.sort(dataset2);

        long end = System.nanoTime();

        long time = end - start;
        long timeInSeconds = time / 1000000000;

        for (int j : dataset1) System.out.print(j + " ");

        System.out.println("\nTotal time taken in milli seconds: " + time);
        System.out.println("\nTotal time taken in seconds: " + timeInSeconds);

    }



}
