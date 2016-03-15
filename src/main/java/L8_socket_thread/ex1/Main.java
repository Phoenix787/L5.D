package L8_socket_thread.ex1;

/**
 * Created by Сергеева on 15.03.2016.
 */
public class Main {

    static class Recipe implements Runnable{
        void cook(){
            System.out.println(Thread.currentThread().getName() );
        }

        @Override
        public void run() {
            for (int i = 0; i < 20 ; i++) {
                System.out.println(Thread.currentThread().getName() + " : " + i);
            }
        }
    }
    public static void main(String[] args) {


        Thread threadR = new Thread(new Recipe());
        threadR.start();

        for (int i = 0; i < 10; i++) {
            MyThread thread = new MyThread(i);
            thread.start();
        }
        System.out.println(Thread.currentThread().getName());


    }
}
