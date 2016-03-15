package ex2.Model;

import ex2.Controller.GameController;

/**
 * Created by Сергеева on 10.03.2016.
 */
public class MainGame {
    public Field field = new Field();
    public Computer computer = new Computer();
    public User user = new User();
    GameController gameController = new GameController(field, user, computer);

    public void start(){
        field.show();
        for (int i = 0; i < 10; i++) {
            boolean res;
            do {
               res  = field.doShoot(computer.getShoot(),Field.Type.X);
            } while(!res);
                field.show();
            System.out.println(field.checkIsWin(Field.Type.X)?"Computer is WIN!" : "");
            //checkWin
            do {
                res = field.doShoot(user.getShoot(), Field.Type.O);
            } while(!res);

            field.show();
            //checkWin
            System.out.println(field.checkIsWin(Field.Type.O)?"User is WIN!" : "");
        }

    }
}
