package com.oracle;
 import java.util.Random;
 import java.util.Scanner;

public class adadada {
    public static void main(String[] args) {
        Random r = new Random();
        int randomnum = r.nextInt(100) + 1;
        Scanner s = new Scanner(System.in);


        while (true) {
            System.out.println("请输入你猜测的数字:");
            int num = s.nextInt();
            if (randomnum > num) {
                System.out.println("太小了,请重试");
            } else if (randomnum < num) {
                System.out.println("太大了,请重试");
            } else {
                System.out.println("恭喜你,猜对了");
                break;
            }

        }
        System.out.println("游戏结束");

    }
}


