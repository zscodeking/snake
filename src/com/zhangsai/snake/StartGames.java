package com.zhangsai.snake;

import javax.swing.*;
import java.awt.*;

/**
 * @program: snake
 * @description:
 * @Packagename: com.zhangsai.snake
 * @ClassName: StartGames
 * @author: Mr.Zhang
 * @create: 2022-04-15 15:32
 */
import javax.swing.*;

public class StartGames {

    public static void main(String[] args) {
        //1.新建一个窗口
        JFrame frame = new JFrame("张赛-贪吃蛇小游戏");
        frame.setBounds(10, 10, 900, 720);  // 设置窗口的位置和大小
        frame.setResizable(false); //窗口大小不可调整,即固定窗口大小
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 设置关闭事件，游戏可以关闭

        //2.添加我们自己编写的画布背景
        frame.add(new GamePanel());

        frame.setVisible(true); //将窗口展示出来
    }

}
