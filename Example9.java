public class Example9 {
    public static void main(String[] args) {
        String str = "Hello World";
        char[] chars = str.toCharArray();
        int[] counts = new int[256]; // assume ASCII character set
        
        // loop through each character in the string and update its count
        for (char c : chars) {
            counts[c]++;
        }

        // find the maximum and minimum occurring characters
        char maxChar = chars[0];
        char minChar = chars[0];
        for (char c : chars) {
            if (counts[c] > counts[maxChar]) {
                maxChar = c;
            }
            if (counts[c] < counts[minChar]) {
                minChar = c;
            }
        }

        // print the maximum and minimum occurring characters
        System.out.println("Maximum occurring character: " + maxChar);
        System.out.println("Minimum occurring character: " + minChar);
    }
}
