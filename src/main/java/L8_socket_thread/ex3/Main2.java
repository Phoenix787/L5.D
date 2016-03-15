package L8_socket_thread.ex3;

/**
 * Created by Сергеева on 15.03.2016.
 * нам нужно запретить использовать метод getMoney одновременно нескольким потокам
 *
 * synchronized
 *
 */
public class Main2 {
    public static void main(String[] args) {

        ATM atm = new ATM();
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.print("Mikki: " );
                atm.getMoney(50);
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.print("Loe: ");
                atm.getMoney(50);

            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.print("Bobby: ");
                atm.getMoney(50);

            }
        }).start();

        new Thread(()-> {
                 System.out.print("Alisa: ");
                atm.getMoney(50);
        }).start();

    }
}
