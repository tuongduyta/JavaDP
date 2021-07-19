public class SingleObject {
    //create object SingleObject
    private static SingleObject instance = new SingleObject();
    //create private constructor so that class SingleObject can't be instantiated
    private SingleObject(){}

    public static SingleObject getInstance(){
        return instance;
        }
       public void showMessage(){
        System.out.println("Ahihiihaha");
       }
    }

