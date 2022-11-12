package Arrays;
import java.util.Arrays;
import java.util.Random;


public class frequencyArrayElements {
        static boolean ignore(int[] array, int value, int c) {
            for (int i = 0; i < c; i++) {
                if (value == array[i]) {
                    return false;
                }
            }
            return true;
        }

        static int equalCount(int[] array, int value) {
            int count = 0;
            for (int i : array) {
                if (i == value)
                    count++;
            }
            return count;
        }
        public static void main(String[]args){
           Random random = new Random();
            int [] array= new int[10];
            for (int i=0;i<10;i++) {
            array[i] = random.nextInt(0, 10);
            }
            System.out.println("Array : "+ Arrays.toString(array));
            System.out.println("Frequency");
            for (int i = 0; i < array.length; i++) {
                if (ignore(array, array[i], i)) {
                    System.out.println("Number of " + array[i] + " has " + equalCount(array, array[i]) + " repetition" );
                }
            }
        }
    }
}
