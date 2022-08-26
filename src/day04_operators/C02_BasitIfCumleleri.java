package day04_operators;

public class C02_BasitIfCumleleri {

    public static void main(String[] args) {

        int a=10;
        int b=20;

        if (a*b>100){
            System.out.println("Carpimlari 100 den buyuk");
        }

        if (a<b) System.out.println("a b den kucuktur");

        //if sartindan sonra sadece 1 satir kod yazacaksak {} kullanmasak da olur.

        if (b>0 ){
            System.out.println("b 0 dan buyuk");
        }

        /* basit if cumleleri kodun geri kalaniyla ilgilenmez.
           dolayisiyla tum basit if cumlelerinin hepsi calisabilir ya da calismayabilir.
         */

        boolean c=true;

        if (c){
            System.out.println("c li if calisti");

        }

        // if in parantez icindeki ifadenin boolean olmasi sarttir.

        c=a*5>b*3; // bu ifade boolean dir.
        if (c){
            System.out.println("c li if calisti");
        }

        // if in parantez ici true olursa body calisir, false olursa body calismaz.




    }







}
