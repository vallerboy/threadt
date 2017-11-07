import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class NewThread {
    public static void main(String[] args) {
        ScheduledExecutorService executorService  =
                Executors.newScheduledThreadPool(1);

        executorService.scheduleAtFixedRate(() ->
                System.out.println("HEJO!"), 5, 2, TimeUnit.SECONDS);





    }
}
