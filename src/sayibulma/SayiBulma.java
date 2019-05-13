/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sayibulma;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Eren
 */
public class SayiBulma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String  isim1,isim2,devam;
        Scanner oku = new Scanner(System.in);
        System.out.print("1. Kullanıcı Adını Girin :");
        isim1 = oku.next();
        System.out.print("2. Kullanıcı Adını Girin :");
        isim2 = oku.next();
        int k1 = 0,k2=0,deger1,deger2;
        int deneme;
        Random r = new Random();
        do {
            try{
            System.out.println("----------------Oyun Başladı-------------------");
            System.out.println(isim1+" kullanıcısı tahmin için enter tuşuna basın");
            deneme = System.in.read();
            deger1= r.nextInt(5)+1;
            System.out.println("Gelen Zar : "+deger1);
            System.out.println(isim2+" kullanıcısı tahmin için enter tuşuna basın");
            deneme = System.in.read();
            deger2= r.nextInt(5)+1;
            System.out.println("Gelen Zar : "+deger2);
            if(deger1 < deger2){
                System.out.println(isim2+" kazandı.");
                k1++;
            }
            else if(deger1 > deger2){
                System.out.println(isim1+" kazandı.");
                k2++;
            } 
            else
                  System.out.println("zarlar eşit");
            System.out.println(isim2 +"'in skoru : "+k1);
            System.out.println(isim1+"'in skoru : "+k2);
            }
            catch(IOException ex){
            }
            
        } while (k1 != 5 || k2 !=5);
        if(k1 < k2)
            System.out.println(isim1+" kazanarak bitirdi.");
        else
            System.out.println(isim2+" kazanarak bitirdi.");
    }
    
}
