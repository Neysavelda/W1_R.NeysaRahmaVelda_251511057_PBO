import java.util.Scanner;

public class Soal5Strings {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            if (!sc.hasNext()) return;
            String A = sc.next();
            String B = sc.next();

            System.out.println(A.length() + B.length());

            if (A.compareTo(B) > 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }

            String capA = A.substring(0, 1).toUpperCase() + A.substring(1);
            String capB = B.substring(0, 1).toUpperCase() + B.substring(1);
            System.out.println(capA + " " + capB);
        }
    }
}
/**
 * Soal 5 - Strings
 * Deskripsi: Mengolah dua buah string A dan B untuk menghitung total panjang, 
 *            membandingkan urutan leksikografis, dan mengkapitalisasi huruf pertama.
 * Konsep: String Manipulation (length, compareTo, substring, toUpperCase).
 * 
 * Catatan Teknis:
 * - compareTo() mengembalikan nilai positif jika string A secara kamus berada setelah B.
 * - substring(0, 1) digunakan untuk mengambil karakter pertama secara aman.
 */