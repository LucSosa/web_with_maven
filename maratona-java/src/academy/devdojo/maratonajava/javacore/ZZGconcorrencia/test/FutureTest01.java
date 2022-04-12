package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.test;

import java.util.concurrent.*;

public class FutureTest01 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Double> dollar = executorService.submit(() -> {
            TimeUnit.SECONDS.sleep(2);
            return 4.35D;
        });
    }
    private static void doingSomething(){

    }
}
