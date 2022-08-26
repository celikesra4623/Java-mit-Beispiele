package day03_matematikselIslemler_Increment;

import java.util.Scanner;

public class C02_Casting {

    public static void main(String[] args) {

        // Kullanicidan iki double sayi alin.
        // ilk sayiyi ikinci sayiya bolun ve bolum isleminin sonucunun tamsayi kismini yazdirin.

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen iki double sayi giriniz \narada enter a basiniz ");

        double sayi1= scan.nextDouble();
        double sayi2=scan.nextDouble();

        int sonuc=(int)(sayi1/sayi2);

        System.out.println(sonuc);



        scan.close();

    }
}
