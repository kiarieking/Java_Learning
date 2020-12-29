package com.kiarie;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Date;

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

	    int x = 1;
	    x += 3;
        System.out.println(x);

         //order of operation
        int y = 40;
        x=(y-4)/12;
        System.out.println(x);

        //implicit casting or automatic conversion
        //byte < short < int < long < float < double
        short i=5;
        int j = i+7;
        System.out.println(j);

        //expicit casting or manual conversion
        float q = 9.9f;
        int w = (int)q + 6;
        System.out.println(w);

        //wrapper classes e.g Integer for type conversion
        String t = "121";
        int x2 = Integer.parseInt(t)/11;
        System.out.println(x2);



    }
}
