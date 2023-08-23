import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int mat, fizik, kimya, turkce, tarih, muzik;

        System.out.println("Derslerin notlarını giriniz\n Matematik Notunuz: ");
        mat = scanner.nextInt();

        System.out.println("Fizik Notunuz: ");
        fizik = scanner.nextInt();

        System.out.println("Kimya Notunuz: ");
        kimya = scanner.nextInt();

        System.out.println("Türkçe Notunuz: ");
        turkce = scanner.nextInt();

        System.out.println("Tarih Notunuz: ");
        tarih = scanner.nextInt();
    
        System.out.println("Müzik Notunuz: ");
        muzik = scanner.nextInt();
        scanner.close();

        double toplam = mat+fizik+kimya+turkce+tarih+muzik;
        double ortalama = toplam/6;
        
        System.out.println("Not Ortalamanız: "+ortalama);
        boolean gectiMi = (ortalama>60) ? true : false;
        String sonuc = (gectiMi == true) ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(sonuc);
    }
}
