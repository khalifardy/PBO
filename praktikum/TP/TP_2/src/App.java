import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        

        System.out.print("Masukan Sebuah Angka: ");
        int angka = scan.nextInt();

        long[] deret = new long[angka];

        deret[0] = 1;
        

        for (int i =1; i < angka; i++){
            if (i ==1){
                deret[i] = 1;
            }else{
                deret[i] = deret[i-1] + deret [i-2];
            };

            
        };

        for(int i = 0; i< angka; i++){
            System.out.print(deret[i] + " ");
        };
        System.out.println("");

        
    }
}
