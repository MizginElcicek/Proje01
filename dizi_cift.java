package Kodluyoruz;

import java.util.Arrays;

public class dizi_cift {
    static boolean isCift(int[] lis, int deg){
        for(int i : lis){
            if(i == deg){
            return true;
            }
        }return false;
    }
    public static void main(String[] args) {
        int[] list = {2,5,4,6,8,9,11,13,2,4};
        int[] cift = new int[list.length];
        int al = 0;

        for(int i = 0; i < list.length; i++){
            if(list[i] % 2 == 0){
                if(!isCift(cift,list[i]))
                cift[al++] = list[i];
            }
        }
        for(int deger : cift){
            if(deger != 0){
                System.out.println(deger);
            }
        }

    }
}
