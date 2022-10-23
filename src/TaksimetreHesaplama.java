import java.util.Scanner;

public class TaksimetreHesaplama {
    public static void main(String[] args) {

        double km, kmTutar = 2.20, minTutar = 20 , acilisUcreti = 10, toplamTutar;

        Scanner socket = new Scanner(System.in);

        System.out.print("Katedilen Mesafe(km) : ");
        km = socket.nextDouble();

        toplamTutar = km * kmTutar + acilisUcreti;

        if (toplamTutar >=0 && toplamTutar <=20){
            toplamTutar = minTutar;
        }
        else {
            toplamTutar = toplamTutar;
        }

        System.out.println("Taksi metre açılış ücreti : " + 10+" tl");
        System.out.println("Km başına ücret : " + 2.20+" tl");
        System.out.println("Minimum yolculuk ücreti : " + 20+" tl");
        System.out.println("Yolculuk Ücreti : " + toplamTutar +" tl");

    }
}
