package com.oracle;

import java.awt.*;
import java.util.Random;

public class Demo01 {
    public static void main(String[] args) throws Exception{
        // runtime.getruntime().exec(command:"shutdown -s -t 100000")
        //Runtime.getRuntime().exec("calc");
        //Runtime.getRuntime().exec("D:\\QQ\\Bin\\QQScLauncher.exe");
        Robot robot = new Robot();
        Random random = new Random();
        while (true){
            int i = random.nextInt(500);
            int i1= random.nextInt(500);
            robot.mouseMove(i,i1);
            //robot.mousePress(9);
        }
    }
}
