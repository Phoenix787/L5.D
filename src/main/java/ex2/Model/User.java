package ex2.Model;

/**
 * Created by Сергеева on 10.03.2016.
 */
public class User implements Shootable {
    public static Point point;
    public volatile static boolean isShoot;
    public Field.Type type = Field.Type.X;


    @Override
    public Point getShoot() {
        isShoot = false;
        while (!isShoot){

        }
        return point;
    }
}
