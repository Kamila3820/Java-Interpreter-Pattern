// RandomExpression.java
import java.util.Random;


public class RandomExpression implements Expression<Integer> {
    private Expression<Integer> lowerBound;
    private Expression<Integer> upperBound;

    public RandomExpression(Expression<Integer> lowerBound, Expression<Integer> upperBound) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }

    public RandomExpression(Expression<Integer> upperBound) {
        this(new NumberExpression(0), upperBound);
    }

    public RandomExpression() {
        this(new NumberExpression(0), new NumberExpression(Integer.MAX_VALUE));
    }

    @Override
    public Integer interpret(Context context) {
        Random random = new Random();
        int lower = lowerBound.interpret(context);
        int upper = upperBound.interpret(context);
        int minValue = Math.min(lower, upper);
        int maxValue = Math.max(lower, upper);

        // if (lower >= upper) {
        //     throw new IllegalArgumentException("Upper bound must be greater than lower bound");
        // }

        return minValue + random.nextInt(maxValue - minValue);
    }
}
