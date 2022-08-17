package day02_scanner_dataCasting;

import java.util.Scanner;

public class C10_CharASCII {

    public static void main(String[] args) {

    //    Soru 2- Kullanicidan bir harf alin ve o harften sonraki 3 harfi yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir harf giriniz");

        char harf=scan.next().charAt(0);

        System.out.println("Girilen harf : " + harf);

    // Su anda elimizde harf var

        char ilkHarf=(char)(harf+1);
        System.out.println(ilkHarf);

        char ikinciHarf=(char)(harf+2);
        System.out.println(ikinciHarf);

        char ucuncuHarf=(char)(harf+3);
        System.out.println(ucuncuHarf);


        scan.close();
    }





}
