package com.oracle;

import javax.swing.*;
import java.awt.*;

public class Domo4 {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("作业");
        jFrame.setBounds(100,100,1000,1000);

        JPanel jPanel = new JPanel();
        jPanel.setLayout(null);
        jPanel.setBackground(Color.white);

        jFrame.setContentPane(jPanel);

        ImageIcon imageIcon = new ImageIcon("C:\\Users\\16546\\Desktop\\5be670ac0d49b.png");
        JLabel jLabelimg1 = new JLabel(imageIcon);
        JLabel jLabel = new JLabel("1:你的电脑将会在");
        JLabel jLabelimg2 = new JLabel(imageIcon);
        JLabel jLabe2 = new JLabel("2:你的电脑将会在");
        JLabel jLabelimg3 = new JLabel(imageIcon);
        JLabel jLabelimg4 = new JLabel(imageIcon);
        JLabel jLabelimg5 = new JLabel(imageIcon);
        JLabel jLabelimg6 = new JLabel(imageIcon);
        JLabel jLabelimg7 = new JLabel(imageIcon);

        jLabel.setBounds(650,650,400,400);
        jLabelimg1.setBounds(100,100,400,400);
        jLabe2.setBounds(550,550,400,400);
        jLabelimg2.setBounds(200,200,400,400);
        jLabelimg3.setBounds(300,300,400,400);
        Font font = new Font("宋体",0,22);

        jPanel.add(jLabel);
        jPanel.add(jLabe2);
        jPanel.add(jLabelimg1);
        jPanel.add(jLabelimg2);
        jFrame.setVisible(true);

    }
}

