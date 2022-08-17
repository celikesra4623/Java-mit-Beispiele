package day02_scanner_dataCasting;

import java.util.Scanner;

public class C04_Scanner {

    public static void main(String[] args) {

        /*
        Soru 3- Kullanicidan ismini, soyismini ve yasini alip, asagidaki formmatta yazdirin.
        Isminiz : John
        Soyisminiz : Doe
        Yasiniz : 44
        Kaydiniz basariyla tamamlanmistir.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz");
        String isim=scan.nextLine();

        System.out.println("Lütfen soyisminizi giriniz");
        String soyisim=scan.nextLine();

        System.out.println("Lütfen yasinizi giriniz");
        int yas=scan.nextInt();

        System.out.println("Isminiz : "
                + isim +
                "\nSoyisminiz : "
                + soyisim +
                "\nYasiniz : "
                + yas + "\nKaydiniz basariyla alinmistir."
                );

        /*
        String ile scan.next() ve scan.nextLine() kullanilabilir.
        next() sadece ilk space e kadar olan kismi alirken
        nextLine() tum satiri alir.
        Arka arkaya birden fazla String degeri kullanicidan alinacaksa nextLine()
        tercih etmek daha mantikli olacaktir.
         */

        scan.close();

    }
}
