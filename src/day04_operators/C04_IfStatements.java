package day04_operators;

import java.util.Scanner;

public class C04_IfStatements {

    public static void main(String[] args) {

        // Kullancidan bir harf alin, harf ile baslayan bir ay varsa yazdirin
        // Kullanici o veya O yazdiginda output Ocak olsun.

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir harf giriniz");
        char girilenHarf = scan.next().charAt(0);

        if (girilenHarf == 'o' || girilenHarf == 'O') System.out.println("aylardan Ocak");
        if (girilenHarf == 's' || girilenHarf == 'S') System.out.println("aylardan Subat");
        if (girilenHarf == 'm' || girilenHarf == 'M') System.out.println("aylardan Mart veya Mayis");
        if (girilenHarf == 'n' || girilenHarf == 'N') System.out.println("aylardan Nisan");
        if (girilenHarf == 'h' || girilenHarf == 'H') System.out.println("aylardan Haziran");
        if (girilenHarf == 't' || girilenHarf == 'T') System.out.println("aylardan Temmuz");
        if (girilenHarf == 'a' || girilenHarf == 'A') System.out.println("aylardan Agustos veya Aralik");
        if (girilenHarf == 'e' || girilenHarf == 'E') System.out.println("aylardan Eylul veya Ekim");
        if (girilenHarf == 'k' || girilenHarf == 'K') System.out.println("aylardan Kasim");


        scan.close();
    }


}
