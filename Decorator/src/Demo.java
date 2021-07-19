import Decorator.HorizontalWindow;
import Decorator.VerticalWindow;
import Window.Window;

public class Demo {
    public static void main(String[] args){
        Window window = new SimpleWindow();

        System.out.println("-----Simple Window-----");
        window.draw();
        System.out.println("Description: " + window.getDescription());

        System.out.println("-----Vertical Window-----");
        Window verticalwindow = new VerticalWindow(window);
        verticalwindow.draw();
        System.out.println("Description: " + verticalwindow.getDescription());

        System.out.println("-----Vertical and Horizontal Window-----");
        Window verhorizontalwin = new HorizontalWindow(window);
        verhorizontalwin.draw();
        System.out.println("Description: " + verhorizontalwin.getDescription());


    }
}
