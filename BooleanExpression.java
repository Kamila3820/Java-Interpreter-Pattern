class BooleanExpression implements Expression<Boolean>{
    private Boolean boolValue;

    public BooleanExpression(Boolean boolValue) {
        this.boolValue = boolValue;
    }

    @Override
    public Boolean interpret(Context context) {
        if (context.isReverse() == ContextType.REVERSE) {
            return !boolValue;
        }
        return boolValue;
    }
}


