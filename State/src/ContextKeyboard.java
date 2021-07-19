public class ContextKeyboard {
    State state = new NormalState();

    public void setState(State state){
        this.state = state;
    }

    public void tap(Key key){
        state.tap(this,key);
    }
    public void hold(Key key){
        state.hold(this,key);
    }
    public void unhold(Key key){
        state.unhold(this,key);
    }
}
