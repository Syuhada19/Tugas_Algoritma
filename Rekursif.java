import java.util.Scanner;
public class Rekursif {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("masukan jumlah baris : ");
        int tinggi = input.nextInt(); // Ubah tinggi sesuai kebutuhan Anda
        input.close();
        gambarPiramida(tinggi);
    }

    public static void gambarPiramida(int tinggi) {
        gambarPiramidaRekursif(tinggi, 0, 0);
    }

    public static void gambarPiramidaRekursif(int tinggi, int baris, int bintang) {
        if (baris == tinggi) {
            return; // Basis dari rekursi, keluar ketika mencapai tinggi maksimum
        }

        cetakSpasi(tinggi - baris - 1); // Cetak spasi sebelum bintang
        cetakBintang(bintang); // Cetak bintang pada setiap baris

        System.out.println(); // Pindah ke baris berikutnya setelah mencetak bintang
        gambarPiramidaRekursif(tinggi, baris + 1, bintang + 2); // Rekursi untuk baris berikutnya
    }

    public static void cetakSpasi(int jumlahSpasi) {
        for (int i = 0; i < jumlahSpasi; i++) {
            System.out.print(" ");
        }
    }

    public static void cetakBintang(int jumlahBintang) {
        for (int i = 1; i < jumlahBintang; i++) {
            System.out.print("*");
        }
    }
}
