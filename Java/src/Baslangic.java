package src;

import java.util.Scanner;

public class Baslangic {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, tarih, muzik;
        Scanner input= new Scanner(System.in);

        System.out.println("Matematik Notunuzu girin");
        mat = input.nextInt();

        System.out.println("fizik Notunuzu girin");
        fizik = input.nextInt();

        System.out.println("kimya Notunuzu girin");
        kimya = input.nextInt();

        System.out.println("turkce Notunuzu girin");
        turkce = input.nextInt();

        System.out.println("muzik Notunuzu girin");
        muzik = input.nextInt();

        int toplam= (mat+fizik+kimya+turkce+muzik);
        double sonuc= toplam/6;
        System.out.println("Ortalama:" + sonuc);

        boolean sart = sonuc>60;
        boolean sart2 = sonuc<60;
        String string= (sart==true) ? "Gecer":"Fail";
        System.out.println(string);

    }
}
 