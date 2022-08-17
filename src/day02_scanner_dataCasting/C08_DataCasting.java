package day02_scanner_dataCasting;

public class C08_DataCasting {

    public static void main(String[] args) {

       double doubleSayi=23.4;

       int intSayi=(int)doubleSayi;
       System.out.println(intSayi); // 23

        // Verilen 3 tamsayinin ortalamasini yazdiralim.

        int sayi1=12;
        int sayi2=13;
        int sayi3=16;

        System.out.println((sayi1+sayi2+sayi3)/3);

        /* Eger islem yapilan tum sayilar int ise java sonucu int olarak verir.
           Ancak eger sayilardan birisi double olursa sonucu genis olan double olarak verir.
           Yani otomatik olarak casting olur. */

        double sayi4=15;
        System.out.println((sayi1+sayi4)/2);

        // verilen 3 tamsayinin ortalamasini double olarak yazdirin.

        System.out.println((double)((sayi1+sayi2+sayi3)/3)); // 13

        System.out.println((double)(sayi1+sayi2+sayi3)/3); // 13.666666666666666


    }



}



