public class Soal2Constants2 
{
    public static final double CM_PER_INCH = 2.54;

    public static void main(String[] args) 
    {
        double paperWidth = 8.5;
        double paperHeight = 11;
        System.out.println("Paper size in centimeters: " + 
        paperWidth * CM_PER_INCH + " by " + paperHeight * CM_PER_INCH);
    }
}

/**
 * Soal 2 - Variables (Class Constants)
 * Deskripsi: Demonstrasi konstanta tingkat kelas (Class Constant) yang bersifat global.
 * Konsep: Access Modifier (public), Class Member (static), Immutability (final).
 * 
 * Catatan Teknis:
 * - 'public static final' memungkinkan konstanta diakses oleh kelas/method lain tanpa perlu instansiasi objek.
 * - 'static' memastikan nilai variabel disimpan satu kali dalam memori dan digunakan bersama oleh kelas.
 */