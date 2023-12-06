import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Small Integer Tester");
        SmallIntegerException obj = new SmallIntegerException("");

        // Contoh penggunaan
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Masukan Integer: ");
            try {
                int inpt = Integer.parseInt(scanner.nextLine());
                try {
                    obj.prnt(inpt);
                } catch (SmallIntegerException sie) {
                    System.out.println(sie.getMessage());
                    System.out.println("jumlah small int Exception : " + obj.getTotal());
                }
            } catch (NumberFormatException e) {
                System.out.println("Input harus integer");
                break;
            }
        }
    }
}
