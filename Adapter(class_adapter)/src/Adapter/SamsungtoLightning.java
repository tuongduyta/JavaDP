package Adapter;

import Phone.Samsung;
import Phone.LightningPhone;

public class SamsungtoLightning extends Samsung implements LightningPhone {
    @Override
    public void useLightning() {
        System.out.println("Lightning Connected!");
        useMicroUSB();
    }
}
