package day05_ifElseStatements;

import java.util.Scanner;

public class C03_IfElseStatements {

    public static void main(String[] args) {

        // Kullanicidan bir ucgenin 3 kenar uzunlugunu alin
        // ücgen eskenar ise "eskenar ucgen" yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 3 kenar uzunlugu giriniz.\nkenar uzunlugunu girdikten sonra enter a basiniz");
        int uzunluk1= scan.nextInt();
        int uzunluk2= scan.nextInt();
        int uzunluk3= scan.nextInt();

        if(uzunluk1==uzunluk2 && uzunluk3==uzunluk2){
            System.out.println("eskenar ucgen");
        }else{
            System.out.println("eskenar ucgen degildir");
        }


        scan.close();
    }
}
