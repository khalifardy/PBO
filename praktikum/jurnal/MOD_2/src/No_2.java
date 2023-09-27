import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class No_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<String> listBaris = new ArrayList<>();
        listBaris.add("A");
        listBaris.add("B");
        listBaris.add("C");
        listBaris.add("D");

        List<List<Integer>> listMatrix = new ArrayList<>();

        for (String i : listBaris) {
            System.out.print("Nilai " + i + " : ");
            int deret = input.nextInt();
            List<Integer> rows = new ArrayList<>();
            
            if (i.equals("A")) {
                int deret1 = 5;
                for (int j = 0; j < deret; j++) {
                    rows.add(deret1);
                    deret1 += 5;
                }
            } else if (i.equals("B")) {
                int deret1 = 3;
                for (int j = 0; j < deret; j++) {
                    rows.add(deret1);
                    deret1 += 2;
                }
            } else if (i.equals("C")) {
                int deret1 = 2;
                for (int j = 0; j < deret; j++) {
                    rows.add(deret1 * deret1);
                    deret1 += 1;
                }
            } else if (i.equals("D")) {
                int deret1 = 4;
                for (int j = 0; j < deret; j++) {
                    rows.add(deret1);
                    deret1 += 1;
                }
            }
            
            listMatrix.add(rows);
        }

        while (true) {
            System.out.print("Bilangan yang dicari: ");
            int masukan = input.nextInt();
            
            if (masukan == 0) {
                break;
            }

            List<List<Integer>> listBarisKolom = new ArrayList<>();

            for (int i = 0; i < listMatrix.size(); i++) {
                List<Integer> kolomBaris = new ArrayList<>();
                if (listMatrix.get(i).contains(masukan)) {
                    kolomBaris.add(i + 1);
                    for (int col = 0; col < listMatrix.get(i).size(); col++) {
                        if (masukan == listMatrix.get(i).get(col)) {
                            kolomBaris.add(col + 1);
                        }
                    }
                }
                
                if (!kolomBaris.isEmpty()) {
                    listBarisKolom.add(kolomBaris);
                }
            }

            if (listBarisKolom.isEmpty()) {
                System.out.println(masukan + " tidak ada dalam array");
            } else {
                System.out.println(masukan + " berada di :");
                for (List<Integer> i : listBarisKolom) {
                    System.out.println("baris " + i.get(0) + " kolom " + i.get(1));
                }
            }
        }
    }
}

