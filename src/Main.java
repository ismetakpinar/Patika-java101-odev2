import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       double tutar ,kdvorani1 = 0.18, kdvorani2 = 0.08,  kdvtutar;

       Scanner inp = new Scanner(System.in);
       System.out.print("Parayı Giriniz :");
       tutar  = inp.nextDouble();

       kdvtutar = tutar < 1000 ?  (tutar  * kdvorani1  ) :(tutar * kdvorani2  ) ;


       System.out.println(("Tutar :" + tutar));
       System.out.println("1000 liraya kadar olan KDV oranı :" + kdvorani1);
       System.out.println("1000 lira ve sonrası için KDV oranı :" + kdvorani2);
       System.out.println("Kdv'li Tutar :" +kdvtutar);




    }
}
