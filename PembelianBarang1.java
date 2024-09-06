import java.util.Scanner;

public class PembelianBarang1 {
    public static void main(String[] args) {
        double total, diskon, potonganHarga;

        Scanner s = new Scanner(System.in);
        System.out.println("Masukkan total: ");
        total = s.nextDouble();

        if (total > 150000) {
            potonganHarga = 0;
            diskon = 0.1 * total;
            total -= diskon;
        } else {
            diskon = 0;
            potonganHarga = 5000;
            total -= potonganHarga;
        }
        
        System.out.println("Diskon: "+diskon);
        System.out.println("Total yang harus dibayarkan adalah "+total);
    }
}
        