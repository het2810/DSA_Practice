package interview_prep.Recursion;


public class ReverseArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Original array: ");
        printArray(array);
        
        reverseArray(array, 0, array.length);

        System.out.println("Reversed array: ");
        printArray(array);
    }

    public static void reverseArray(int[] array, int index, int length) {
        // Base case: If index reaches the middle of the array, stop recursion
        if (index >= length / 2) {
            return;
        }

        // Swap elements at index and (length - index - 1)
        int temp = array[index];
        array[index] = array[length - index - 1];
        array[length - index - 1] = temp;

        // Recursive call
        reverseArray(array, index + 1, length);
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
