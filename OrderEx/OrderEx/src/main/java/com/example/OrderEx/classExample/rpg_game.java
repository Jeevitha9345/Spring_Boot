package com.example.OrderEx.classExample;

import java.util.Arrays;
import java.util.Scanner;

public class rpg_game {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int power=sc.nextInt();
        int count=0;
        int monster[][]=new int[n][2];
        for(int i=0;i<n;i++){
            monster[i][0]=sc.nextInt();
            monster[i][1]=sc.nextInt();
        }

//        Arrays.sort(monster, (a, b) -> Integer.compare(a[0], b[0]));

        for(int i=1;i<n;i++){
            int[] key=monster[i];
            int j=i-1;
            while(j>=0 && monster[j][0]>key[0]){
                monster[j+1]=monster[j];
                j--;
            }
            monster[j+1]=key;
        }

        for(int i=0;i<n;i++){
            if(monster[i][0]<=power){
                count++;
                power+=monster[i][1];
            }else{
                break;
            }
        }
        System.out.println(count);
    }
}
