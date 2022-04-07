package practice_basic_day04;

import java.util.Scanner;

public class Q05_Arrays {
    public static void main(String[] args) {
       /*
         Kullanicidan aldigimiz 8 elemanli arrayin icinde
         kac tane 3 e bolunebilen sayi vardir ?(negatif sayilar da dahil olsun)
        */

        int arr[]={2,4,6,-9,12,32,33,42};

        int sayac=0;



        for (int i = 0; i <arr.length ; i++) {

            if (arr[i]%3==0){

                sayac++;


            }

        }
        System.out.println("bolunebilen sayi: "+ sayac);


    }
}
