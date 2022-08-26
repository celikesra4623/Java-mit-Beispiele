package day04_operators;

import java.util.Scanner;

public class C03_IfStatements {

    public static void main(String[] args) {

      // Kullanicidan bir sayi isteyin
      // sayi 5 ile bolunebiliyorsa "sayi 5 in tam kati yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz");
        int girilenSayi=scan.nextInt();

        if (girilenSayi%5==0){
            System.out.println("Girdiginiz sayi 5 in tam katidir.");
        }
        scan.close();
    }

}
