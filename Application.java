// The main classClient
// Polymorphism? 
public class Application {
    public static void main(String[] args) {
        // Create the expression: (2 + 3) + 4
        Expression<Integer> addexpression = new AddExpression(
                new AddExpression(new NumberExpression(2), new NumberExpression(3)),
                new NumberExpression(4));

        Expression<Integer> incrementExpression = new IncrementExpression(new NumberExpression(10));
        Expression<Integer> randExpression1 = new RandomExpression(new NumberExpression(6));
        Expression<Integer> randExpression2 = new RandomExpression(new NumberExpression(3), new NumberExpression(6));
        Expression<Boolean> xorExpression = new XORExpression(new XORExpression(new BooleanExpression(true),
                new BooleanExpression(false)),
                new XORExpression(new BooleanExpression(false),
                new BooleanExpression(true)));

        // Create the context, if needed
        Context context = new Context();
        // Interpret the expression
        System.out.println("Add Result: " + addexpression.interpret(context)); // Output: Result: 9
        System.out.println("Increment Result: " + incrementExpression.interpret(context)); // Output: Result: 11
        System.out.println("Random Result1: " + randExpression1.interpret(context)); // Output: [0,5]
        System.out.println("Random Result2: " + randExpression2.interpret(context)); // Output: [3,5]
        System.out.println("XOR Result3: " + xorExpression.interpret(context)); // Output: [3,5]

        System.out.println();
        
        Context contextR = new Context(ContextType.REVERSE);
        // Interpret the expression
        System.out.println("Add Result: " + addexpression.interpret(contextR)); // Output: Result: 9
        System.out.println("Increment Result: " + incrementExpression.interpret(contextR)); // Output: Result: 11
        System.out.println("Random Result1: " + randExpression1.interpret(contextR)); // Output: [0,5]
        System.out.println("Random Result2: " + randExpression2.interpret(contextR)); // Output: [3,5]
        System.out.println("XOR Result3: " + xorExpression.interpret(contextR)); // Output: [3,5]
    }
}