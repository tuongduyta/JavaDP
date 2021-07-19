package Adapter;
import Phone.LightningPhone;
import Phone.MicroUSB;

public class MicroUSBtoLightning implements LightningPhone{
    private MicroUSB microUSB;

    public MicroUSBtoLightning(MicroUSB microUSB){
        this.microUSB = microUSB;
    }

    @Override
    public void recharge() {
        microUSB.recharge();
    }

    @Override
    public void useLightning() {
        System.out.println("Lightning Connected!");
        microUSB.useMicroUSB();
    }
}
