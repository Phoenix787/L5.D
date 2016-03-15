package ex2.Controller;

import ex2.Model.Computer;
import ex2.Model.Field;
import ex2.Model.Point;
import ex2.Model.User;

/**
 * Created by Сергеева on 10.03.2016.
 */
public class GameController {
    private Field field;
    private User user;
    private Computer computer;

    public GameController(Field field, User user, Computer computer) {
        this.field = field;
        this.user = user;
        this.computer = computer;
    }

    public static void doShoot(Point point, Field.Type type) {
        User.point = point;
        User.isShoot = true;
    }

    public Field.Type checkWinner(Field.Type type){

        boolean res = field.checkIsWin(type);
        return res ? type : (!"X".equals(type.toString()) ? Field.Type.O : type);

    }

    public Field getField() {
        return field;
    }

    public void setField(Field field) {
        this.field = field;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }
}
