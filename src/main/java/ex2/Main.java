package ex2;

import ex2.Model.MainGame;
import ex2.View.GameWindow;

/**
 * Created by Сергеева on 10.03.2016.
 */
public class Main {
    public static void main(String[] args) {
//        GameWindowTest gameWindowTest = new GameWindowTest();
//        gameWindowTest.init();

        GameWindow gameWindow = new GameWindow();
        gameWindow.init();

        MainGame game = new MainGame();
        game.start();

    }
}
