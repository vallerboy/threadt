public class ErrorInThread {
    public static void main(String[] args) {

        new ErrorInThread();
    }

    public ErrorInThread() {
        Operation operation = new Operation();

        for(int i = 0; i <= 10000; i++){
            new Thread1(operation).start();
        }
    }

    // 4
    // 4

    private static class Operation {
        private int oskar = 0;
        public  synchronized int operation() {
            oskar = oskar + 1;
            oskar = oskar - 1;

            return oskar;
        }
    }

    private static class Thread1 extends Thread  {
        Operation operation;

        public Thread1(Operation o ) {
            operation = o;
        }

        @Override
        public void run() {
            for(int i = 0; i <= 1000; i++){
                operation.operation();
            }

            System.out.println(operation.oskar);

        }
    }
}