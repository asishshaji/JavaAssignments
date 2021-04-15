import java.util.Scanner;

public class MatrixSum {
    public static void main(String[] args) {
        int row, col, i, j, sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter row and col :> ");
        row = scanner.nextInt();
        col = scanner.nextInt();
        int[][] arr = new int[row][col];

        System.out.println("Enter numbers :> ");
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println("Sum is " + sum);
    }
}
