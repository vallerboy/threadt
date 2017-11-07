public class Main {
    public static void main(String[] args) {

        Runnable runnable = () -> {
            for (int i = 0; i < 1000 ; i++) {
                System.out.println("Watek 1 - " + i);
            }
        };

        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000 ; i++) {
                    System.out.println("Watek 2 -" + i);
                }
            }
        };


        Runnable runnable2 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000 ; i++) {
                    System.out.println("Watek 3 -" + i);
                }
            }
        };

        Runnable runnable3 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000 ; i++) {
                    System.out.println("Watek 4 -" + i);
                }
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();

        Thread thread1 = new Thread(runnable1);
        thread1.start();

        Thread thread2 = new Thread(runnable2);
        thread2.start();

        Thread thread3 = new Thread(runnable3);
        thread3.start();

    }
}
