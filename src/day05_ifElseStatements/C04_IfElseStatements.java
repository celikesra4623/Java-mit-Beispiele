package day05_ifElseStatements;

import java.util.Scanner;

public class C04_IfElseStatements {

    public static void main(String[] args) {

      // Kullanicdan bir karakter girmesini isteyiniz.
      //girilen karakterin buyuk harf olup olmadigini yazdirin.

        Scanner scan=new Scanner(System.in)  ;
        System.out.println("Lütfen bir karakter giriniz");
        char karakter=scan.next().charAt(0); // ilk karakteri aliyoruz.
        // burdan bize bir karakter gelecek. a, A, +..

        if (karakter>=65 && karakter<=90){
            System.out.println("girilen karakter buyuk harftir.");
        }else {
            System.out.println("girilen karakter buyuk harf degildir.");
        }
        scan.close();
    }



}
