public class Demo {
    public static void main(String[]args){
        Subject subject = new Subject();

        new BinaryObserver(subject);
        new OctalObserver(subject);
        new HexaObserver(subject);

        System.out.println("First change state: 15");
        subject.setState(15);
    }
}
