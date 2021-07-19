public class IncreaseSpeedFan implements FanCommand{
    private Fan fan;
    public IncreaseSpeedFan(Fan fan){
        this.fan = fan;
    }
    @Override
    public void execute(){
        fan.increaseSpeed();
    }
}
