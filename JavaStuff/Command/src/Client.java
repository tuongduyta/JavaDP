public class Client {
    public static void main(String[]args){
        Fan f1 = new Fan("Fan1");
        Fan f2 = new Fan("Fan2");
        TurnOnFan turnonfan = new TurnOnFan(f1);
        TurnOffFan turnofffan = new TurnOffFan(f1);

        FanInvoker faninvoker = new FanInvoker();
        faninvoker.TurnOnFan(turnonfan);
        faninvoker.TurnOffFan(turnofffan);

        faninvoker.proceeding();


    }
}
