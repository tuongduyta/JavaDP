public class NormalState implements State{

    @Override
    public void tap(ContextKeyboard keyboard, Key key) {
        switch(key){
            case CAPS_LOCK:
                keyboard.setState(new CapsLockState());
                System.out.println("Caps_lock ON");

            break;
            case SHIFT:
                System.out.println("No effect!");
            break;
            default:
                System.out.println(key.toString().toLowerCase());

        }

    }

    @Override
    public void hold(ContextKeyboard keyboard, Key key) {
        switch(key){
            case SHIFT:
                keyboard.setState(new ShiftState());
                System.out.println("Shift ON");
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
