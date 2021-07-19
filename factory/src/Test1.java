public class Test1{


    public static void main(String[]args){
        ShapeFactory shapefactory = new ShapeFactory();
        Shape shape1 = shapefactory.getShape("Rectangle");
        shape1.draw();
    }
}
