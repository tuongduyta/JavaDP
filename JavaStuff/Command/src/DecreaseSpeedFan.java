public class DecreaseSpeedFan implements FanCommand{
    private Fan fan;

    public DecreaseSpeedFan(Fan fan){
        this.fan = fan;
    }
    @Override
    public void execute(){
        fan.decreaseSpeed();
    }
}
