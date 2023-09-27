import java.util.Scanner;

public class No_1 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan basis: ");
        int basis = input.nextInt();
        input.nextLine(); // Membaca newline setelah input integer
        System.out.print("Masukkan bilangan: ");
        String bilangan = input.nextLine();

        // Membuat dictionary untuk karakter heksadesimal
        java.util.HashMap<Character, Integer> dictio = new java.util.HashMap<Character, Integer>();
        dictio.put('A', 10);
        dictio.put('B', 11);
        dictio.put('C', 12);
        dictio.put('D', 13);
        dictio.put('E', 14);
        dictio.put('F', 15);

        char[] barisan_bilangan = bilangan.toCharArray();
        int pangkat = 0;
        int desimal = 0;
        int start = bilangan.length() - 1;

        if (basis == 2) {
            while (start >= 0) {
                desimal += Integer.parseInt(String.valueOf(barisan_bilangan[start])) * Math.pow(2, pangkat);
                pangkat++;
                start--;
            }
        }else if (basis == 16) {
            while (start >= 0) {
                char currentChar = barisan_bilangan[start];
                if (dictio.containsKey(currentChar)) {
                    desimal += dictio.get(currentChar) * Math.pow(16, pangkat);
                } else {
                    desimal += Integer.parseInt(String.valueOf(currentChar)) * Math.pow(16, pangkat);
                }
                pangkat++;
                start--;
            }
        }
        System.out.print("Hasil Konversi: ");
        System.out.println(desimal);

    }
}
