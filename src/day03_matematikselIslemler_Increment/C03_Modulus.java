package day03_matematikselIslemler_Increment;

import java.util.Scanner;

public class C03_Modulus {

    public static void main(String[] args) {

        // Kullanicidan pozitif bir tamsayi alip rakamlar toplamini bulalim.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen dört basamakli bir tamsayi giriniz");
        int girilenSayi = scan.nextInt();
        int rakamlarToplami = 0;
        int birlerBasamagi = 0;

        // sayimiz 1234 olsun

        birlerBasamagi = girilenSayi % 10; // birler basamagini bulduk.4
        rakamlarToplami = rakamlarToplami + birlerBasamagi; // birler basamagini rakamlar toplamina ekledik.4
        girilenSayi = girilenSayi / 10;// artik girilen sayinin son basamagindan kurtulduk.123


        birlerBasamagi = girilenSayi % 10; // birler basamagini bulduk.3
        rakamlarToplami = rakamlarToplami + birlerBasamagi; // birler basamagini rakamlar toplamina ekledik.7
        girilenSayi = girilenSayi / 10;// artik girilen sayinin son basamagindan kurtulduk.12


        birlerBasamagi = girilenSayi % 10; // birler basamagini bulduk.2
        rakamlarToplami = rakamlarToplami + birlerBasamagi; // birler basamagini rakamlar toplamina ekledik.9
        girilenSayi = girilenSayi / 10;// artik girilen sayinin son basamagindan kurtulduk.1

        birlerBasamagi = girilenSayi % 10; // birler basamagini bulduk.1
        rakamlarToplami = rakamlarToplami + birlerBasamagi; // birler basamagini rakamlar toplamina ekledik.10
        girilenSayi = girilenSayi / 10;// artik girilen sayinin son basamagindan kurtulduk.0

        System.out.println("Girilen sayinin rakamlar toplami : " + rakamlarToplami);

       // Bu soruyu dinamik olarak looplarla cözecegiz.



        scan.close();
    }


}
