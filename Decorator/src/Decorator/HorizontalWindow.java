package Decorator;

import Window.Window;

public class HorizontalWindow extends DecoratedWindow{
    public HorizontalWindow(Window window) {
        super(window);
    }
    private void drawHorizontalWindow(){
        super.setDescription(super.getDescription() + "Horizontal Scrollbar");
    }

    @Override
    public void draw(){
        drawHorizontalWindow();
        super.draw();
    }
    @Override
    public String getDescription(){
        return super.getDescription();
    }
}
