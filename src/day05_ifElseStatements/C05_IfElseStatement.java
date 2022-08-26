package day05_ifElseStatements;

import java.util.Scanner;

public class C05_IfElseStatement {

    public static void main(String[] args) {

        // Kullanicidan bir harf isteyin
        // girilen karakter kucuk harf ise buyuk harf yazdirin
        // degilse girilen harfi yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("bir harf giriniz");
        char karakter = scan.next().charAt(0);

        if (karakter >= 'a' && karakter <= 'z') {

            karakter = (char) (karakter - 32);

            System.out.println(karakter);

        } else {
            System.out.println(karakter);
        }

        scan.close();

    }


}
