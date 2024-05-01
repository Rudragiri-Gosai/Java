public class p5 {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3, 4, 5};
            int index = 6; // Accessing index out of bounds

            // Accessing an element at an index that doesn't exist
            int element = numbers[index];
            System.out.println("Element at index " + index + " is: " + element);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
