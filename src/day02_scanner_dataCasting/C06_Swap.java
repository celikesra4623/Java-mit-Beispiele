package day02_scanner_dataCasting;

import java.util.Scanner;

public class C06_Swap {

    public static void main(String[] args) {

      /*
      Soru 7 (Interview)- Kullanicidan iki sayi alip ikisinin degerlerini degistirin(swap).
       */

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen iki sayi giriniz \nbirinci sayiyi girdikten sonra enter a basiniz");
        int sayi1=scan.nextInt();
        int sayi2=scan.nextInt();

        System.out.println("Girdiginiz ilk sayi : " + sayi1 + "\nGirdiginiz ikinci sayi : "+ sayi2);

        int sayi3;

        sayi3=sayi2;

        sayi2=sayi1;

        sayi1=sayi3;

        System.out.println("Degisimden sonra sayi1: " + sayi1 + ",sayi2: " + sayi2 );

        scan.close();


    }
}
