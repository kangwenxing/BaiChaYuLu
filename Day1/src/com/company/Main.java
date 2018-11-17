package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scn = new Scanner(System.in);
        System.out.print("请输入年份：");
        long year;
        try {
            year= scn.nextLong();
            if (year%4==0&&year%100!=0||year%400==0){
                System.out.println(year+"是闰年！");
            }else{
                System.out.println("不是闰年！");
            }
        }catch (Exception e){
            System.out.print("你输入的不是有效年份" );
        }
    }
}
