// 7. Write a Java program to create and traverse an Array
public class Example7 {
    public static void main(String[] args) {
        // creating an array of integers
        int[] numbers = { 1, 2, 3, 4, 5 };

        // traversing the array using a for loop
        System.out.println("Printing the array using a for loop:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // traversing the array using a for-each loop
        System.out.println("Printing the array using a for-each loop:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
