import java.util.Arrays;
import java.util.Scanner;

public class No2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan ukuran matriks (n): ");
        int n = input.nextInt();

        int[][][] matrices = new int[2][n][n];

        for (int k = 0; k < 2; k++) {
            System.out.println("Masukkan elemen matriks " + (k + 1) + ":");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print("Masukkan angka untuk matriks " + (k + 1) + " kolom " + (j + 1) + " dan baris " + (i + 1) + ": ");
                    matrices[k][i][j] = input.nextInt();
                }
            }
        }

        System.out.println("Perkalian Matriks " + n + " x " + n);
        System.out.println("n: " + n);

        for (int i = 0; i < matrices.length; i++) {
            System.out.println("Isi Matriks " + (i + 1) + " : ");
            for (int[] row : matrices[i]) {
                System.out.println(String.join(" ", Arrays.stream(row)
                    .mapToObj(Integer::toString)
                    .toArray(String[]::new)));
            }
        }


        System.out.println("Hasil Perkalian Matriks " + n + "x" + n + ":");
        int[][] result = multiplyMatrices(matrices[0], matrices[1], n);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2, int n) {
        int[][] result = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int sum = 0;
                for (int k = 0; k < n; k++) {
                    sum += matrix1[i][k] * matrix2[k][j];
                }
                result[i][j] = sum;
            }
        }
        return result;
    }
}
