// Abstract Expression

interface Expression<T> {
    T interpret(Context context);
}