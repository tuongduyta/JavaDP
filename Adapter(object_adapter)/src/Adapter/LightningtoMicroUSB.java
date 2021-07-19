package Adapter;

import Phone.MicroUSB;
import Phone.LightningPhone;

public class LightningtoMicroUSB implements MicroUSB {
    private LightningPhone lightningphone;

    public LightningtoMicroUSB(LightningPhone lightningphone){
        this.lightningphone = lightningphone;
    }
    @Override
    public void recharge() {
        lightningphone.recharge();

    }

    @Override
    public void useMicroUSB() {
        System.out.println("MicroUSb Connected!");
        lightningphone.useLightning();

    }
}
