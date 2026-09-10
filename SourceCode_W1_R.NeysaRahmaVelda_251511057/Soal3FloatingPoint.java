public class Soal3FloatingPoint {
    public static void main(String[] args) {
        double x = 92.98;
        int nx = (int) Math.round(x);
        System.out.println("Nilai nx: " + nx);
    }
}

/**
 * Soal 3 - Operators (Math Round & Type Casting)
 * Deskripsi: Memahami fungsi pembulatan Math.round() dan tipe data hasil kembaliannya.
 * Konsep: Math API, Explicit Type Casting (Narrowing Conversion).
 * 
 * Catatan Teknis:
 * - Math.round(double) mengembalikan nilai bertipe 'long' (64-bit integer).
 * - Karena variabel penampung 'nx' bertipe 'int' (32-bit), maka dibutuhkan explicit cast (int)
 *   untuk mencegah error pembacaan tipe data oleh compiler.
 * - Huruf 'class' wajib ditulis kecil karena Java bersifat case-sensitive.
 */