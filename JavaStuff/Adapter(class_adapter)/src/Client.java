import Adapter.IphonetoMicroUSB;
import Adapter.SamsungtoLightning;
import Phone.Iphone;
import Phone.LightningPhone;
import Phone.MicroUSB;
import Phone.Samsung;

public class Client {
    static void rechargeLightning(LightningPhone phone){
        phone.recharge();
        phone.useLightning();

    }
    static void rechargeMicroUSB(MicroUSB phone){
        phone.recharge();
        phone.useMicroUSB();
    }
    public static void main(String[]args){
        Iphone iphone = new Iphone();
        Samsung samsung = new Samsung();

        //Recharge Normal
        System.out.println("Recharge Lightning");
        rechargeLightning(iphone);
        System.out.println("Recharge MicroUSB");
        rechargeMicroUSB(samsung);
        //Recharge with Adapter
        System.out.println("Recharge Lightning with MicroUSB");
        rechargeMicroUSB(new IphonetoMicroUSB());
        System.out.println("Recharge MicroUSB to Lightning");
        rechargeLightning(new SamsungtoLightning());
    }
}
