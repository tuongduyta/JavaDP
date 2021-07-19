public class ShapeFactory {
    public Shape getShape(String shape){
        if ("Rectangle".equals(shape)) {
            return new Rectangle();
        } else if ("Circle".equals(shape)) {
            return new Circle();
        } else if ("Square".equals(shape)) {
            return new Square();
        }
        return null;
    }
}
