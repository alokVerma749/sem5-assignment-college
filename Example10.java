public class Example10 {
    public static void main(String[] args) {
        // generate a random number between 0 and 1
        double randomDouble = Math.random();

        // scale the number to be between 0 and 100
        int randomInt = (int) (randomDouble * 100);

        // print the random integer
        System.out.println("Random number: " + randomInt);
    }
}
