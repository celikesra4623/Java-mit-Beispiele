package day03_matematikselIslemler_Increment;

public class C06_Pre_Post_Increment2 {

    public static void main(String[] args) {

        int a =10;

        System.out.println("++a = " + ++a); // 11

        int b=a++; // once atayacak sonra degerini artir. a=12 oldu

        System.out.println("b = " + b); // b=11

        int c= b++ + a; // once atama sonra artirma olacak c=23 b=12 a=12

        System.out.println("Son toplam = " + (a+b+c)); // 47



    }




}
