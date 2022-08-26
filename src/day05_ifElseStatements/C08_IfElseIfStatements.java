package day05_ifElseStatements;

import java.util.Scanner;

public class C08_IfElseIfStatements {

    public static void main(String[] args) {

        // Kullanicinin kilo ve boyunu isteyip VKI hesaplayin.
        // VKI 30 dan buyukse obez,
        // 25-30 arasi kilolu,
        // 20-25 arasi normal,
        // 20 den kucukse zayif yazdirin.

        // VKI (kilo*10000/(boy*boy)

        Scanner scan = new Scanner(System.in);
        System.out.println("Kilonuzu kg cinsinden giriniz");
        double kilo = scan.nextDouble();
        System.out.println("Boyunuzu cm cinsinden giriniz");
        double boy = scan.nextDouble();
        double vki = (kilo * 10000 / (boy * boy));

        System.out.println("Vucut kitle endeksinizi : " + vki);

        if (vki > 30) {
            System.out.println("Obez");

        } else if (vki > 25) {
            System.out.println("Kilolu");

        } else if (vki > 20) {
            System.out.println("Normal");

        } else System.out.println("Zayif");

        scan.close();

    }


}
