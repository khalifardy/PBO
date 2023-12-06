import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Validator Mahasiswa");
        Mahasiswa obj = new Mahasiswa();

        while (true) {
            try {
                System.out.print("NIM: ");
                String nim = scanner.nextLine();
                obj.setNim(nim);
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        while (true) {
            try {
                System.out.print("Nama: ");
                String nama = scanner.nextLine();
                obj.setNama(nama);
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        while (true) {
            try {
                System.out.print("Tanggal Lahir (yyyy-MM-dd): ");
                String tanggal = scanner.nextLine();
                obj.setTglLahir(tanggal);
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        while (true) {
            try {
                System.out.print("IPK: ");
                float ipk = Float.parseFloat(scanner.nextLine());
                obj.setIPK(ipk);
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
