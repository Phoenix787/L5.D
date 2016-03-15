package ex2.Model;

/**
 * Created by Сергеева on 10.03.2016.
 */
public class Computer implements Shootable{
    public Point point;
    public Field.Type type = Field.Type.O;


    @Override
    public Point getShoot() {
        point = Point.getRandomPoint();
        return point;
    }
}
