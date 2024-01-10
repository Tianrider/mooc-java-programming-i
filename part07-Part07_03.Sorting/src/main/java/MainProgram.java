
import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {3, 1, 5, 99, 3, 12};
MainProgram.sort(numbers);
    }

    public static int smallest(int[] num) {
        int smallest = num[0];
        for (int i = 0; i < num.length; i++) {
            if (num[i] < smallest) {
                smallest = num[i];
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] num) {
        int index = 0;
        int smallest = num[0];
        for (int i = 0; i < num.length; i++) {
            if (num[i] < smallest) {
                smallest = num[i];
                index = i;
            }
        }
        return index;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int index = startIndex;
        int smallest = table[startIndex];
        for (int i = startIndex; i < table.length; i++) {
            if (table[i] < smallest) {
                smallest = table[i];
                index = i;
            }
        }
        return index;
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = 0;
        temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void sort(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            int curSmallestIndex = indexOfSmallestFrom(numbers, i);
            swap(numbers, i, curSmallestIndex);
            System.out.println(Arrays.toString(numbers));
        }
    }
}
