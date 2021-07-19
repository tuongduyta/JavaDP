import Window.Window;

public class SimpleWindow implements Window {
    private String description;

    public SimpleWindow(){
        this.description = "Simple Window";
    }
    @Override
    public void draw() {
        System.out.println("Drawing: " + description);

    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }
}
