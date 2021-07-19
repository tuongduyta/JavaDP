import java.util.ArrayList;
import java.util.List;

public class FanInvoker {
    private List<FanCommand> fancommandList = new ArrayList<>();

    public void TurnOnFan(FanCommand on){
        fancommandList.add(on);
    }
    public void TurnOffFan(FanCommand off){
        fancommandList.add(off);
    }
    public void IncreaseSpeedFan(FanCommand increase){
        fancommandList.add(increase);
    }
    public void DecreaseSpeedFan(FanCommand decrease){
        fancommandList.add(decrease);
    }
    public void proceeding(){
        for(FanCommand fanCommand: fancommandList){
            fanCommand.execute();
        }
    }
}
