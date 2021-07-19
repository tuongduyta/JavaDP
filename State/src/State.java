public interface State {
    void tap(ContextKeyboard keyboard,Key key);
    void hold(ContextKeyboard keyboard,Key key);
    void unhold(ContextKeyboard keyboard,Key key);
}
