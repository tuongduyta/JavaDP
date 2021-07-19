package Adapter;

import Phone.Iphone;
import Phone.MicroUSB;

public class IphonetoMicroUSB extends Iphone implements MicroUSB {
    @Override
    public void useMicroUSB() {
        System.out.println("MicroUSB Connected!");
        useLightning();
    }
}
