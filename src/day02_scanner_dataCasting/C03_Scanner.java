package day02_scanner_dataCasting;

import java.util.Scanner;

public class C03_Scanner {

    public static void main(String[] args) {
        //Soru 2- Kullanicidan bir double, bir de int sayi alip bunlarin toplamini ve carpimini yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir tamsayi giriniz");
        int sayi1= scan.nextInt();
        System.out.println("Lütfen ondalikli bir sayi giriniz");
        double sayi2=scan.nextDouble();

        System.out.println("Girilen sayilarin carpimi : "+ sayi1*sayi2);
        System.out.println("Girilen sayilarin toplami : "+ (sayi1+sayi2));
        scan.close();
    }


}
