package practice_basic_day06;

public class Q11_Varargs02 {
    // Create a multiply method with double varargs (return double)

    public static void main(String[] args) {

        double sayi = 2.5;
        double sayi1 = 1.0;
        double sayi2 = 6.5;

        ortalama(sayi, sayi1, sayi2);

        //System.out.println(ortalama()); NaN ekrandda yazdirir.
        System.out.println(ortalama(sayi, sayi1, sayi2));



    }

    private static double ortalama(double... veysel) {

        double sayac = 0;
        double toplam = 0;

        double sonuc;

        for (double each : veysel
        ) {
            sayac++;
            toplam += each;
        }


        sonuc = toplam / sayac;
        return sonuc;
    }

}
