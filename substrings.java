package com.company;
import java.util.*;
public class substringss2 {
    public static void main(String[] args) {
        String str ="abcd";
        for (int i=0;i<=3;i++){  // how can you use the 3 
            for (int j=i+1;j<=4;j++){
                System.out.print(" "+str.substring(i,j));

            }

        }

    }
}
