package ex2.View;

import ex2.Controller.GameController;
import ex2.Model.*;
import ex2.Model.Point;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Сергеева on 10.03.2016.
 */
public class GameWindow extends JFrame {
    JPanel jPanel = new JPanel();
    JButton[][] buttons = new JButton[3][3];


    public void init(){

        setSize(400,400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //setLayout(new BorderLayout()); // стоит по умолчанию JFrame (разделяет область приложения на пять частей: север, юг, запад, восток, центр

        setTitle("XO GAME");

       // jPanel.setLayout(new FlowLayout()); // стоит по умолчанию в JPanel
        jPanel.setLayout(new GridLayout(3,3));

        add(jPanel);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                JButton button = new JButton();
                button.setText(j % 2 == 0 ? "X" : "O");
                buttons[i][j] = button;
                jPanel.add(button);
                final int finalJ = j;
                final int finalI = i;
//                button.addActionListener(new ActionListener() {
//                    @Override
//                    public void actionPerformed(ActionEvent e) {
//                        String textButton = e.getActionCommand();
//                        System.out.println(textButton + "x: " + finalJ + "y: " + finalI);
//                    }
//                });

                button.addActionListener((e)->{
                    //button.setActionCommand(GameController.checkWinner());
                    String textButton = e.getActionCommand();
                    System.out.println("Command: " + textButton + ", x: " + finalJ + ", y: " + finalI);
                    GameController.doShoot(new Point(finalI, finalJ), textButton.equals("X")?Field.Type.X : Field.Type.O);
                    //button.setText(Field.Type.X.toString());
                });

            }
        }


        setVisible(true);
    }
}
