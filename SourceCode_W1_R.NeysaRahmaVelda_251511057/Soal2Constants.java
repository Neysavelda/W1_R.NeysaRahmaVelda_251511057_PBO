public class Soal2Constants 
{
    public static void main(String[] args) 
    {
        final double CM_PER_INCH = 2.54;
        double paperWidth = 8.5;
        double paperHeight = 11;
        System.out.println("Paper size in centimeters: " +
        paperWidth * CM_PER_INCH + " by " + paperHeight * CM_PER_INCH);
    }
}

/**
 * Soal 2 - Variables (Local Constants)
 * Deskripsi: Demonstrasi deklarasi variabel konstanta menggunakan keyword 'final'.
 * Konsep: Local Variable Scope, Constants, Case Sensitivity.
 * 
 * Catatan Teknis:
 * - Variabel CM_PER_INCH bersifat lokal dan hanya dapat diakses di dalam method main().
 * - Menggunakan keyword 'final' sehingga nilainya tidak dapat diubah setelah diinisialisasi.
 */
