package day01_variables;

public class C02_DataTurleri {

    public static void main(String[] args) {

        boolean emekliOlurmu=false;

        emekliOlurmu=true;
        /*
        boolean sadece true veya false degerini alir
        true veya false direkt yazilir tirnak icine alinmaz.
        hafizada 1 bitlik bir alan kaplar.

         */

        char harf='e';
        char sayi='3';
        char karakter='#';
       /*
        char harfler='asd';
        char sayilar="2";

        char veri turundeki variableler tek tirnak icinde yazilmalidir.
        sadece tek bir karakter olmalidir.
        hafizada 16 bit yer kapliyor.

        */

       /*
        tamsayi barindiran 4 tane data türü vardir
        byte 8 bit -128 ve 127 arasinda deger alir
        short 16 bit -32.768 32.767 arasinda deger alir.
        int 32 bit -2.147.483.648 ve 2.147.483.647 arasinda deger alir.
        long 64 bit ....
        hangi data turunu kullanacagimiz uygulamamizin hafiza kullanimi acisindan onemlidir.
        */

        /*
        ondalikli sayi barindiran 2 tane primitiv data turu vardir.
        float 32 bit, kullanimi durumunda yanina f veya F kullanmamiz gerekir
        double 64 bit, genellikle bunu kullaniriz.
         */

        float floatSayi=2.3F;
        double doubleSayi=4.555;

        doubleSayi=20;

        /* 20 degeri bir tamsayidir ve variable turunu int short byte yapabiliriz.
        bir variable in data türüne karar verirken o an atanan degerden ziyade
        hangi degerleri alabilecegine bakmak gerekir */

        int sayi1=11;
        int sayi2=23;
        int sayi3=7;
        System.out.println((sayi1+sayi2+sayi3)/3); // beklenen=13,666666 cikti=13
         /*
         Ancak sayilar 3 e tam bolunemeyebilir bu durumda virgullu bir deger ortaya cikar.
         Java sayilar int olarak atandigi icin virgullu kismi gormezden gelir.
         bu da hatali sonuc ortaya cikmasina sebep olur.

         Bu yuzden ortalama hesaplayan bir programi float veya double ile yapmak daha
         mantikli olacaktir.
          */

        float sayi4=11f;
        float sayi5=23f;
        float sayi6=7f;

        System.out.println((sayi4+sayi5+sayi6)/3); // 13.666667

        double sayi7=11;
        double sayi8=23;
        double sayi9=7;

        System.out.println((sayi7+sayi8+sayi9)/3); // 13.666666666666666

        // double ve float calisirken ondalikli kisimda onemsiz hatalar olabilir.


        /* primitiv data turlerinin hafizada kullandigi alan sabittir.
           ancak non primitiv de hafizada kullanilan alan sabit degildir.

           primitiv data turleri Java tarafindan olusturulmustur yeni primitiv data turu olusturamayiz
           Java bazi non primitiv data turleri olusturmustur ama biz non primitiv data turleri olusturabiliriz
         */



    }
}
