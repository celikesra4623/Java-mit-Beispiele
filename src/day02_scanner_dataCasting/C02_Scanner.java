package day02_scanner_dataCasting;

import java.util.Scanner;

public class C02_Scanner {

    public static void main(String[] args) {
        // Kullanicidan bir sayi alip sayinin küpünü yazdiralim.
        //1.adim : Scanner objesi olusturmak
        Scanner scan = new Scanner(System.in);
        //2.adim : Kullanicidan ne istedigimizi kullaniciya soyleyelim.
        System.out.println("Lütfen bir tamsayi giriniz");
        //3.adim: Istedigimiz datayi kulllanabilecegimiz bir variable olusturup
        //        kullanicinin girdigi degeri uygun methodla alalim
        //        ve olusturdugumuz variable'a atayalim.
        int girilenSayi=scan.nextInt();

        System.out.println("Girdiginiz sayinin kupu : " + (girilenSayi*girilenSayi*girilenSayi));



        scan.close();



    }






}
