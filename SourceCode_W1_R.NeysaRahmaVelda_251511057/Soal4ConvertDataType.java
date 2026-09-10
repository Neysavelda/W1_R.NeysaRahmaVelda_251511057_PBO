public class Soal4ConvertDataType 
{
    static short methodOne(long l)
    {
        int i = (int) l;
        return (short)i;
    }
    public static void main(String[] args)
    {
        double d = 10.25;
        float f = (float) d;
        byte b = (byte) methodOne((long) f);
        System.out.println(b);
    }
}

/**
 * Soal 4 - Operators (Data Type Conversion & Truncation)
 * Deskripsi: Demonstrasi konversi bertingkat dari tipe data besar ke tipe data lebih kecil.
 * Konsep: Explicit Casting, Primitive Data Loss, Truncation.
 * 
 * Catatan Teknis:
 * - Alur konversi: double (10.25) -> float (10.25f) -> long (10) -> int (10) -> short (10) -> byte (10).
 * - Konversi dari tipe pecahan (floating point) ke integer secara otomatis akan memotong
 *   bagian desimal (.25) sehingga tersisa bagian bulatnya saja (10).
 */