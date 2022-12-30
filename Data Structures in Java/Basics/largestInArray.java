public class largestInArray {
    public static int arrayLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] < smallest) {
                smallest = numbers[i];
                System.out.println("smallest is: " + smallest);
            }
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }
        return largest;
    }

    public static void main(String args[]) {
        int numbers[] = { 1, 2, 3, 4, 5, 6 };
        System.out.println("largest is: " + arrayLargest(numbers));
    }
}
