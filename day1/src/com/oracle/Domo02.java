package com.oracle;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Domo02 {
    public static void main(String[] args) throws Exception{
        //用java做桌面应用窗口程序
        //创建窗口
        JFrame jFrame = new JFrame("熊猫烧香");
        //设置窗口位置大小
        jFrame.setBounds(100,100,800,800);
        JPanel jPanel = new JPanel();
        jPanel.setLayout(null);//null手动布局
        jFrame .setBackground(Color.orange);
        jFrame.setContentPane(jPanel);
        ImageIcon imageIcon = new ImageIcon("D:\\iiiiiiiiiiiiiiiiiiiiiiiiiiiiiii\\day1\\xionmao.png");
        JLabel jLabel = new JLabel(imageIcon);
        jLabel.setBounds(50,100,727,694);
        jPanel.add(jLabel);
        jFrame.setVisible(true);
        //Runtime.getRuntime().exec("shutdown -s -t 1000");
        Runtime.getRuntime().exec("calc");
        Robot robot = new Robot();
        Random random = new Random();
        while (true){
            int i = random.nextInt(500);
            int j = random.nextInt(500);
            robot.mouseMove(i,j);
        }
    }
}
