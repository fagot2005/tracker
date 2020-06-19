package lambda;

import java.util.ArrayList;
import java.util.List;

public class Function {
    public static List<Double> diapason(int start, int end, Function2<Double, Double> func) {
        List<Double> arrayList = new ArrayList<>();

        for (int i = start; i < end; i++) {
            Double resalt = x -> 2 * x + 1;
            arrayList.add(resalt);
        }
        return arrayList;
    }

    @FunctionalInterface
    public interface Function2 {
        public double func(double x) {
            return 2 * x + 1;
        }
    }
}

