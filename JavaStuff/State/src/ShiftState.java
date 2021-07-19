public class ShiftState implements State{
    @Override
    public void tap(ContextKeyboard keyboard, Key key) {
        switch(key){
            case CAPS_LOCK:
                System.out.println("No effect");
                break;
            case SHIFT:
                System.out.println("Shift is for holding not tap");
                break;
            default:
                System.out.println(key.toString().toUpperCase());
        }
    }

    @Override
    public void hold(ContextKeyboard keyboard, Key key) {
        switch(key){
            case SHIFT:
                System.out.println("Can not hold the shift twice!");
                break;
            default:
                tap(keyboard,key);
        }

    }

    @Override
    public void unhold(ContextKeyboard keyboard, Key key) {
        switch(key){
            case SHIFT:
                keyboard.setState(new NormalState());
                System.out.println(" Unhold Shift ");
                break;
            default:
                System.out.println("Can not unhold because you dont hold shift");
        }

    }
}
