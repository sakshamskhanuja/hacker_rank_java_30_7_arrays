import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Scans the user input.
        Scanner scanner = new Scanner(System.in);

        try {
            // Scans the number of elements in a list.
            int n = Integer.parseInt(scanner.nextLine());

            // Initializing an ArrayList of type Integer having size n.
            ArrayList<Integer> list = new ArrayList<>(n);

            // Scans the elements of the array.
            for (int i = 0; i < n; i++) {
                list.add(Integer.parseInt(scanner.next()));
            }

            // Prints the reverse of list.
            printReverse(list);
        } catch (NumberFormatException e) {
            System.out.println("Error - Cannot parse input.");
        } finally {
            // Closes the scanner.
            scanner.close();
        }
    }

    /**
     * Prints the contents of an ArrayList in reverse order.
     *
     * @param list is the list of Integers.
     */
    private static void printReverse(ArrayList<Integer> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
    }
}
