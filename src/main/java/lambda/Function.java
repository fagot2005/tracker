package lambda;

import java.util.ArrayList;
import java.util.List;

public class Function {
    public static List<Double> diapason(int start, int end) {
        List<Double> arrayList = new ArrayList<>();
        for (double i = start; i < end; i++) {
            //Double resalt = x -> 2 * x + 1;
            //Func apply = i -> 2.0 * i + 1.0;
            arrayList.add(Func.apply(i) = (i) -> 2 * (i) + 1);
        }
        return arrayList;
    }

    @FunctionalInterface
    public interface Func {
        static double apply(double x) {
        }
    }
}

