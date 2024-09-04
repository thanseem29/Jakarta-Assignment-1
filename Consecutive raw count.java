import java.util.Scanner;
public class ConsecutiveCharacterCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine();
        sc.close();
        int count = 0;
        int i = 0;
        while (i < s.length()) {
            char currentChar = s.charAt(i);
            int runLength = 1;
            while (i + 1 < s.length() && s.charAt(i + 1) == currentChar) {
                runLength++;
                i++;
            } 
            if (runLength > 2) {
                count++;
            } 
            i++;
        }
        System.out.println("Count of characters occurring more than twice continuously: " + count);
    }
}
