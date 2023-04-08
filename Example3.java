// 3. Write a program in Java to find largest number among n user input numbers.
import java.util.Scanner;

public class Example3{
    public static void main(String[] args) {
        int  n,max;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements to be comapred");
        n= input.nextInt();
        System.out.println("Enter elemant 1: ");

        max = input.nextInt();

        for (int i = 2; i <= n; i++) {
            System.out.println("Enter Element "+ i + " : ");
            int num = input.nextInt();
            if(num>max){
                max = num;
            }
        }
        System.out.println("The greatest number is: "+max);
    }
}
