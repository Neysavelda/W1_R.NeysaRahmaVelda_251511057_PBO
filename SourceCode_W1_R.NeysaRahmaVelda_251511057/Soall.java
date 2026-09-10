public class Soall 
{
    public static void main(String[] args) 
    {
        byte angkal = 125;
        byte angka2 = 6;
        byte hasil = (byte) (angkal+angka2);
        System.out.println("Hasil 1 "+hasil);
    }
}

// Notes :
// Output: Hasil 1 -125  
// Penjumlahan (angka1 + angka2) secara otomatis dipromosikan ke int (131).
// Oleh karena itu, diperlukan explicit casting (byte) untuk mengembalikannya ke tipe byte.