
import Phone.Iphone;
import Phone.LightningPhone;
import Phone.MicroUSB;
import Phone.Samsung;
import Adapter.LightningtoMicroUSB;
import Adapter.MicroUSBtoLightning;

public class Client {
    static void rechargeLightningPhone(LightningPhone phone){
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

        //Recharge normal
        System.out.println("Recharge Lightning!");
        rechargeLightningPhone(iphone);

        System.out.println("Recharge MicroUSB!");
        rechargeMicroUSB(samsung);

        //Recharge with Adapter
        System.out.println("Recharge Lightning with MicroUSB");
        rechargeMicroUSB(new LightningtoMicroUSB(iphone));

        System.out.println("Recharge microUSB with Lightning");
        rechargeLightningPhone(new MicroUSBtoLightning(samsung));
    }
}
