public class Context {
    // Additional context information, if needed
    private ContextType _isReverse;

    public Context(ContextType isReverse) {
        _isReverse = isReverse; // Default mode is normal
    }

    public Context(){
        this(ContextType.NORMAL);
    }

    public ContextType isReverse() {
        return _isReverse;
    }
}
