package day03_matematikselIslemler_Increment;

public class C05_Pre_Post_Increment {

    public static void main(String[] args) {

      int a=10;
        System.out.println(a++); // 10 once yazdiracak sonra artiracak
        System.out.println(a); // 11

        a=10;
        System.out.println(++a); // 11 once artiracak sonra yazdiracak
        System.out.println(a); // 11

        a=10;
        int b=a++; // b=10 a=11

        System.out.println("a : " +a+ "b : " +b);


        a=10;
        b=++a; // b=11, a=11

        System.out.println("a : " +a+ "b : " +b);



    }
}
