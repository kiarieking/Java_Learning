package com.kiarie;

import java.awt.*;
import java.lang.reflect.Array;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean[] honesty = {true,false,false,true,true};
        int[] index = {45,87,64,22,50};
        Arrays.sort(index);

//        int[][] multiDimArr = new int[3][4];
//        multiDimArr[1][3]=7;
//        multiDimArr[2][2]=5;
//        multiDimArr[1][2]=9;
//        multiDimArr[0][1]=6;
//        multiDimArr[1][0]=8;
//	    System.out.println(Arrays.deepToString(multiDimArr));

//	    int x = 1;
//	    x += 3;
//        System.out.println(x);
//
//         //order of operation
//        int y = 40;
//        x=(y-4)/12;
//        System.out.println(x);
//
//        //implicit casting or automatic conversion
//        //byte < short < int < long < float < double
//        short i=5;
//        int j = i+7;
//        System.out.println(j);
//
//        //expicit casting or manual conversion
//        float q = 9.9f;
//        int w = (int)q + 6;
//        System.out.println(w);
//
//        //wrapper classes e.g Integer for type conversion
//        String t = "121";
//        int x2 = Integer.parseInt(t)/11;
//        System.out.println(x2);
//
//        //Math Class
//        float y2 = 6.7f;
//        int result = Math.round(y2);//7
//        int ceiling = (int) Math.ceil(8.1); //9
//        double floor1 = Math.floor(8.8);//8
//        System.out.println(floor1);
//        //random integer
//        int f = (int)(Math.random()*10);
//        System.out.println(f);

        //number fomating
//        NumberFormat currency = NumberFormat.getCurrencyInstance();
//        String result2 = currency.format(345098754.89786);
//        System.out.println(result2);
//
//        NumberFormat percentage = NumberFormat.getPercentInstance();
//        String percentResult = percentage.format(0.05);
//        System.out.println(percentResult);
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Principal: ");
//        double principal = scanner.nextDouble();
//        System.out.print("Annual interest rate: ");
//        double interest_rate = scanner.nextDouble();
//        System.out.print("Period(years): ");
//        double period = scanner.nextDouble();
//
//        double r= (interest_rate/100)/12;
//        double n= period * 12;
//
//        double numerator = r*(Math.pow((1+r),n));
//        double denominator = (Math.pow((1+r),n))-1;
//
//        double m = principal * (numerator/denominator);
//        System.out.print(m);

//          Scanner scanner = new Scanner(System.in);
//          int temperature = scanner.nextInt();
//
//          String day = temperature > 25? "Hot day" : "cool day";
//          System.out.println(day);

        Scanner scanner = new Scanner(System.in);
        String job = scanner.nextLine();
          switch (job){
              case "Doctor":
                  System.out.println("you're a doctor");
                  break;
              case "Teacher":
                  System.out.println("you're a teacher");
              case "Farmer":
                  System.out.println("you're a farmer");
              default:
                  System.out.println("you're a developer");
          }







    }
}
