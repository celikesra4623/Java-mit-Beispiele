package day01_variables;

public class C01_Variables {

    public static void main(String[] args) {

        System.out.println("Hello World");

        // en iyi kod calisan koddur.

        int sayi=12;

        int myInt;

        // declaration icin data türü yeterlidir, deger atamak zorunda degiliz.

        System.out.println(sayi); // 12

        // bir atama yapmadigimiz icin myInt i yazdirmamiz mümkün degildir.

        myInt=20;

        System.out.println(myInt);

        /* declaration ve assignment ayni satirda yapilabilecegi gibi,
        once declaration sonra assignment da yapilabilir.*/

        int not=80;
        not=not+10;

        System.out.println(not); // 90

        // Java önce sag tarafi isleme alir. Son degeri isleme koyar.

        int not1,not2,not3;

        not1=10;
        not2=20;
        not3=30;

        // ortak declaration mümkün assignment sonra yapilabilir.

        /* String myInt=40;
          declaration sadece bir kere olur  */





    }



}
