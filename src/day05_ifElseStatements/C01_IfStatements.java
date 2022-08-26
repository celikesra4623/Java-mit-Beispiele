package day05_ifElseStatements;

import java.util.Scanner;

public class C01_IfStatements {

    public static void main(String[] args) {

        // Kullanicidan notunu alin 50 veya daha buyukse "Sinifi gectin"
        // 50 den kucukse maalesef kaldin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen notunuzu giriniz");
        double not = scan.nextDouble();


        if (not>=50) System.out.println("Sinifi gectin");

        if (not<50 ) System.out.println("Maalesef kaldin");



        scan.close();
    }


}
