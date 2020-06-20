package lambda;

import java.util.ArrayList;
import java.util.List;

public class FunctionCalculator {
    public static List<Double> diapason(int start, int end, Function<Double, Double> func) {
        List<Double> arrayList = new ArrayList<>();
        for (double i = start; i < end; i++) {
            arrayList.add(func.apply((double) i));
        }
        return arrayList;
    }

    public interface Function<T, R> {
        R apply(T t);
    }
}
