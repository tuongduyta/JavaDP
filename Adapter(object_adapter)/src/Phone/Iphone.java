package Phone;

public class Iphone implements LightningPhone{
    private boolean connector;

    @Override
    public void recharge(){
        if(connector){
            System.out.println("Recharge Start!");
            System.out.println("Recharge end!");
        }
        else{
            System.out.println("Please Connect Lightning");
        }
    }

    @Override
    public void useLightning(){
        connector = true;
        System.out.println("Lightning connected");
    }
}
