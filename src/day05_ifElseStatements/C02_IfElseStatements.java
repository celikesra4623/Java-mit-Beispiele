package day05_ifElseStatements;

import java.util.Scanner;

public class C02_IfElseStatements {

    public static void main(String[] args) {

        // Kullanicidan notunu alin 50 veya daha buyukse "Sinifi gectin"
        // 50 den kucukse maalesef kaldin.

        /* eger if ile yazdigimiz bir kodda sadece 2 ihtimal varsa
        bu durumda if-else cumleleri kullaniriz
        sadece 2 ihtimal olmasi gerekir sadece ikisinden birisi calisir.
        en az bir tanesinin calismasi zorunludur.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen notunuzu giriniz");
        double not = scan.nextDouble();


        if (not>=50) {
            System.out.println("Sinifi gectin");
        } else{
            System.out.println("maalesef kaldin");
        }

        // true ise if body, false ise else body calisir.



        scan.close();
    }



}
