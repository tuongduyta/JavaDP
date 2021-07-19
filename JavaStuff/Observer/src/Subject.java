import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observerList = new ArrayList<Observer>();
    private int state;

    public int getState(){
        return state;
    }
    public void setState(int state){
        this.state = state;
        notifyObservers();
    }
    public void attach(Observer observer){
        observerList.add(observer);

    }
    public void notifyObservers(){
        for(Observer observer: observerList){
            observer.update();
        }
    }

}
