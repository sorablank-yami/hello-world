package com.oracle;


import javax.swing.*;
import java.awt.*;

public class Domo03 {
    public static void main(String[] args) throws Exception{
        JFrame jFrame = new JFrame("倒计时窗口");
        jFrame.setBounds(100,100,500,500);
        JPanel jPanel =new JPanel();
        jPanel.setLayout(null);
        jPanel.setBackground(Color.orange);
        jFrame.setContentPane(jPanel);
        JLabel jlabel = new JLabel("你的电脑将会在10后关机");
        jlabel.setBounds(100,100,300,50);
        Font font  = new Font("宋体",0,22);
        jlabel.setFont(font);
        jPanel.add(jlabel);
        jFrame.setVisible(true);
    }
}

