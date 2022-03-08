package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	//Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.
        //Örnek : 1643 = 1 + 6 + 4 + 3 = 14
        int number,result=0;

        Scanner inp=new Scanner(System.in);
        System.out.println("Sayı Giriniz=");
        number= inp.nextInt();
        while (number!=0){
            int thempnumber = number % 10;
            result=result+thempnumber;
            number/=10;
        }
        System.out.println(result);

    }
}
