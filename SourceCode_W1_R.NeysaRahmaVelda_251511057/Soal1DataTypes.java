import java.math.BigInteger;
import java.util.Scanner;

public class Soal1DataTypes {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            if (!sc.hasNextInt()) return;
            int t = sc.nextInt();

            for (int i = 0; i < t; i++) {
                try {
                    BigInteger n = sc.nextBigInteger();
                    
                    if (n.compareTo(BigInteger.valueOf(Long.MIN_VALUE)) >= 0 && 
                        n.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) <= 0) {
                        
                        System.out.println(n + " can be fitted in:");
                        
                        long val = n.longValue();
                        if (val >= Byte.MIN_VALUE && val <= Byte.MAX_VALUE) {
                            System.out.println("* byte");
                        }
                        if (val >= Short.MIN_VALUE && val <= Short.MAX_VALUE) {
                            System.out.println("* short");
                        }
                        if (val >= Integer.MIN_VALUE && val <= Integer.MAX_VALUE) {
                            System.out.println("* int");
                        }
                        System.out.println("* long");
                    } else {
                        System.out.println(n + " can't be fitted anywhere.");
                    }
                } catch (Exception e) {
                    System.out.println(sc.next() + " can't be fitted anywhere.");
                }
            }
        }
    }
}

/**
 * Soal 1 - Data Types
 * Deskripsi: Menentukan tipe data primitif integer Java yang sanggup menampung input n.
 * Konsep: Range Data Types (byte, short, int, long), BigInteger, Exception Handling, Try-with-resources.
 * 
 * Alur Logika:
 * 1. Menggunakan BigInteger untuk membaca nilai n tanpa risiko InputMismatchException.
 * 2. Membandingkan nilai n terhadap batas MIN_VALUE dan MAX_VALUE tiap tipe data.
 * 3. Menampilkan daftar tipe data secara berurutan sesuai kapasitasnya (byte < short < int < long).
 */