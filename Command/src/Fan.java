public class Fan {
    private String name;

    public Fan(String name1){
        this.name = name1;
    }
    public void turnOn(){
        System.out.println(name + "turn On");
    }
    public void turnOff(){
        System.out.println(name + "turn Off");
    }
    public void increaseSpeed(){
        System.out.println(name + "Increase Speed");
    }
    public void decreaseSpeed(){
        System.out.println(name + "Decrease speed");
    }
}
