public class DemoState {
    public static void main(String[]args){
        ContextKeyboard keyboard = new ContextKeyboard();
        keyboard.tap(Key.Q);
        keyboard.tap(Key.CAPS_LOCK);
        keyboard.tap(Key.Q);
        keyboard.tap(Key.CAPS_LOCK);
        keyboard.tap(Key.Q);
        keyboard.hold(Key.SHIFT);
        keyboard.tap(Key.Q);
        keyboard.unhold(Key.SHIFT);
        keyboard.tap(Key.Q);
    }
}
