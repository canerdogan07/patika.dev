package src;

import java.util.Scanner;

public class kdv {
    public static void main(String[] args) {
        double tutar, kdvOran=0.18;
        Scanner input = new Scanner(System.in);
        System.out.println("Ücret tutarını girin: ");
        tutar=input.nextDouble();
        double kdvTutar=tutar*kdvOran;
        double kdvliTutar=tutar+kdvTutar;
        System.out.println("KDVsiz tutar:"+ tutar);
        System.out.println("KDV Oranı:"+ kdvOran);
        System.out.println("KDV tutarı:"+ kdvTutar);
        System.out.println("KDVli tutar:"+ kdvliTutar);



    }
    
}
