package Decorator;

import Window.Window;

public class VerticalWindow extends DecoratedWindow{

    public VerticalWindow(Window window){
        super(window);
    }
    private void drawVerticalWindow(){
        super.setDescription(super.getDescription() + "vertical scrollbar");
    }


    @Override
    public void draw(){
        drawVerticalWindow();
        super.draw();
    }
    @Override
    public String getDescription(){
        return super.getDescription();
    }
}
