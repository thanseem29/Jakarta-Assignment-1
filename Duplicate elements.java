import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class DifferenceBetweenFirstAndLastDuplicate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int N = scanner.nextInt();
        int[] A = new int[N];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        Map<Integer, Integer> firstOccurrence = new HashMap<>();
        Map<Integer, Integer> lastOccurrence = new HashMap<>();
        for (int i = 0; i < N; i++) {
            if (!firstOccurrence.containsKey(A[i])) {
                firstOccurrence.put(A[i], i);
            }
            lastOccurrence.put(A[i], i);
        }
        int firstDuplicate = Integer.MIN_VALUE;
        int lastDuplicate = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            if (firstOccurrence.get(A[i]) != lastOccurrence.get(A[i])) {
                if (firstDuplicate == Integer.MIN_VALUE) {
                    firstDuplicate = A[i];
                }
                lastDuplicate = A[i];
            }
        }
        if (firstDuplicate != Integer.MIN_VALUE && lastDuplicate != Integer.MIN_VALUE) {
            int difference = firstDuplicate - lastDuplicate;
            System.out.println("Difference between the first and last duplicate elements: " + difference);
        } else {
            System.out.println("No duplicate elements found.");
        }
        scanner.close();
    }
}
