import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SortElements {
    public static void main(String[] args) {
        int n, sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array : ");
        n = s.nextInt();
        Integer[] a = new Integer[n];
        System.out.println("Enter all the elements : ");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }

        Arrays.sort(a, Collections.reverseOrder());
        System.out.println("Sorted array ");
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }
}
