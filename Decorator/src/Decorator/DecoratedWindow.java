package Decorator;

import Window.Window;

public abstract class DecoratedWindow implements Window {
    private Window decoratedwindow;

    protected DecoratedWindow(Window window){
        this.decoratedwindow = window;
    }

    @Override
    public void draw(){
        decoratedwindow.draw();
    }

    @Override
    public String getDescription(){
        return decoratedwindow.getDescription();
    }
    @Override
    public void setDescription(String description){
        decoratedwindow.setDescription(description);
    }

}
