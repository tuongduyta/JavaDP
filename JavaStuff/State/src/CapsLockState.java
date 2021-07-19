public class CapsLockState implements State{
    @Override
    public void tap(ContextKeyboard keyboard, Key key) {
        switch(key){
            case CAPS_LOCK:
                keyboard.setState(new NormalState());
                System.out.println("Caps_lock OFF");
                break;
            case SHIFT:
                System.out.println("No effect!");
                break;
            default:
                System.out.println(key.toString().toUpperCase());
        }
    }

    @Override
    public void hold(ContextKeyboard keyboard, Key key) {
        switch(key){
            case SHIFT:
                System.out.println("No effect when hold Shift on this state.");
                break;
            default:
                tap(keyboard,key);
        }

    }

    @Override
    public void unhold(ContextKeyboard keyboard, Key key) {
        switch(key){
            case SHIFT:
                System.out.println("Can not unhold at this state");
                break;
            default:
                break;
        }

    }
}
