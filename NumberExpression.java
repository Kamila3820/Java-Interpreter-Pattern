public class NumberExpression implements Expression<Integer> {
    private int number;
    public NumberExpression(int number) {
        this.number = number; // auto-unboxing
    }
    @Override
    public Integer interpret(Context context) {
        if (context.isReverse() == ContextType.REVERSE) {
            return number * -1;
        }
        return number; // auto-boxing
    }
}