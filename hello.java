import java.util.Scanner;
public class hello {
     public static void main(String[] args) {
        int fizik, kimya, mat, turkce, tarih, muzik;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz : ");
        mat = input.nextInt();

        System.out.print("Fizik notunuzu giriniz : ");
        fizik = input.nextInt();

        System.out.print("Kimya notunuzu giriniz : ");
        kimya = input.nextInt();

        System.out.print("Türkçce notunuzu giriniz :");
        turkce = input.nextInt();

        System.out.print("Tarih notunuzu giriniz : ");
        tarih = input.nextInt();

        System.out.print("Müzik notunuzu giriniz : ");
        muzik = input.nextInt();

        int toplam = (turkce + mat + fizik + kimya + muzik + tarih);
        double sonuc = toplam / 6;

        System.out.println("Ortalamanız : " + sonuc );

        String a = sonuc >= 50 ? "Geçtiniz" : "Kaldınız"; 
        System.out.print(a);
    }
}