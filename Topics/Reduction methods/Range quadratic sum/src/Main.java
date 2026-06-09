import java.util.stream.*;

class QuadraticSum {
    public static long rangeQuadraticSum(int fromIncl, int toExcl) {
         // write your code with streams here
        return LongStream.range(fromIncl, toExcl)
                .map(x -> x * x)
                .sum();
    }
}