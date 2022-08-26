package day05_ifElseStatements;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C07_IfElseIfStatements {

    public static void main(String[] args) {

       // Kullanicidan mesafeyi km olarak alin cevirmek istedigi birimi sorun
       // istedigi birim mt veya cm ise cevirin degilse kayitli degil yazdirin.

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen km olarak bir mesafe giriniz");
        int mesafeKm=scan.nextInt();
        System.out.println("Lütfen cevirmek istediginiz birimi giriniz " +
                "\nM : Metre \nS: Santimetre ");
        char tercih=scan.next().charAt(0);

        if (tercih=='M'|| tercih=='m'){ // 1 km = 1000 m
            System.out.println(mesafeKm*1000+ " m");
        } else if (tercih=='S' || tercih=='s') { // 1 km = 1000 m, 1 m= 100 cm
            System.out.println(mesafeKm*10000+ " cm");
        } else System.out.println("Istediginiz birim sisteme kayitli degildir.");


        scan.close();
    }
}
