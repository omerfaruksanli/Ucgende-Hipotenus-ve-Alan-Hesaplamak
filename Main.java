import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double kisaKenar, uzunKenar, yukseklik, hipotenus, alan;

    System.out.println("Kısa Kenarı Giriniz = ");
    kisaKenar = input.nextDouble();
    System.out.println("Uzun Kenarı Giriniz = ");
    uzunKenar = input.nextDouble();

    hipotenus = Math.sqrt((kisaKenar*kisaKenar) + (uzunKenar*uzunKenar));
    yukseklik = (kisaKenar + uzunKenar + hipotenus) / 2;
    alan = (uzunKenar*yukseklik) / 2 ;

    System.out.println("Hipotenüs = " + hipotenus);
    System.out.println("Yükseklik = " + yukseklik);
    System.out.println("Alan = " + alan );




    }
}