package day03_matematikselIslemler_Increment;

import java.util.Scanner;

public class C01_Casting {

    public static void main(String[] args) {

      // Kullanicidan bir sayi alin, kullanici kac degerini girerse girsin

      // o sayiyi -128 ve 127 arasindaki bir sayiya dönüstürüp yazdirin.

        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen bir sayi giriniz");

        double girilenSayi=scan.nextDouble();

        byte donusenSayi= (byte) girilenSayi; // sayiyi -128 ile 127 arasina donusturmek icin byte a cevirdik.

        System.out.println("Girdiginiz sayinin sistemdeki karsiligi : " +donusenSayi);



        scan.close();


    }
}
