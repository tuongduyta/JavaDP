package Phone;

public class Samsung implements MicroUSB{
    private boolean connector;

    @Override
    public void recharge(){
        if(connector){
            System.out.println("Recharge Start!");
            System.out.println("Recharge Finish!");
        }
        else{
            System.out.println("Please connect MicroUSB!");
        }
    }

    @Override
    public void useMicroUSB(){
        connector = true;
        System.out.println("MicroUSB Connected!");

    }
}
