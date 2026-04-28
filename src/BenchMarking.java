import java.util.concurrent.Callable;

import models.Results;

public class BenchMarking {

    public static Results medirTiempos(Callable<Void> funcion) {

        try {
            long inicio = System.nanoTime();
            funcion.call();
            long fin = System.nanoTime();

            double duracion = (fin - inicio)/1_000_000_000.0;

            Results results = new Results(duracion);
            return results;

        } catch (Exception e) {
            throw new RuntimeException("ERROR en la funcion");
        }
    }
}