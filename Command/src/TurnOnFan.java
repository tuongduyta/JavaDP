public class TurnOnFan implements FanCommand{
    private Fan fan;

    public TurnOnFan(Fan fan){
        this.fan = fan;
    }
    @Override
    public void execute(){
        fan.turnOn();
    }
}
