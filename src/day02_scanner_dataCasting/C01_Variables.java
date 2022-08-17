package day02_scanner_dataCasting;

public class C01_Variables {

    public static void main(String[] args) {

        int sayi;

        // bu variable deklare edildi ancak deger atanmadi doolayisiyla yazdiramayiz.
        // System.out.println(sayi);

        sayi=2;
        System.out.println(sayi); // 2
        // atama yapildiktan sonra yazdirabiliriz.

        sayi=10;
        System.out.println(sayi); //10
        // en son hangi deger atandiysa degeri artik o olmus olur önceden atanan degerlerin anlami yoktur.

        String isim= "Recep";
        System.out.println(isim);

        isim="Nevzat";
        System.out.println("Isminiz : " + isim);
        System.out.println("Sayi degeri : " + sayi);



    }





}
