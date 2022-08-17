package day02_scanner_dataCasting;

public class C07_DataCasting {

    public static void main(String[] args) {

        String isim = "Esra";

        isim = "Ayse";

        //  isim='a'; String bir variable a boolean,int veya char bir deger atayamazsiniz.

        boolean iyiMi = true;

        // iyiMi="Ayse"; Boolean bir variable a String,char veya int atayamazsiniz.

        int sayiInt = 12;
        short sayiShort = 20;
        byte sayiByte = 21;
        double sayiDouble = 14;

        // ayni veya benzer datalar iceren variable larda ise kontrollü gecis mumkundur.

        sayiDouble = sayiInt; // büyük = kücük

        sayiInt = sayiShort;  // büyük = kücük

        // sayiByte= sayiInt; // k = b
        // sayiShort = sayiDouble; k = b
        // daha buyuk data turunu daha kucuk data turune atayabiliriz.
        // Ancak daha kucuk data turunu daha buyuk data turune atayamayiz.
        // sag tarafin kucuk sol tarafin buyuk degerli olmasi gerekiyor.

        sayiByte = (byte)sayiInt;
    }


}
