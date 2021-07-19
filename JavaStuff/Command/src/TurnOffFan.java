public class TurnOffFan implements FanCommand{
    private Fan fan;

    public TurnOffFan(Fan fan){
        this.fan = fan;
    }
    @Override
    public void execute(){
        fan.turnOff();
    }
}
