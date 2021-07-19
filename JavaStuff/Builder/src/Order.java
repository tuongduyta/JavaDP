public class Order {
    private Ordertype ordertype;
    private Breadtype breadtype;
    private Saucetype saucetype;
    private Vegetabletype vegetabletype;

    public Order(Ordertype ordertype,Breadtype breadtype,Saucetype saucetype,Vegetabletype vegetabletype){
        this.ordertype = ordertype;
        this.breadtype = breadtype;
        this.saucetype = saucetype;
        this.vegetabletype = vegetabletype;

    }
    @Override
    public String toString() {
        return "Order [orderType=" + ordertype + ", breadType=" + breadtype + ", sauceType=" + saucetype
                + ", vegetableType=" + vegetabletype + "]";
    }
    public Ordertype getOrdertype(){
        return ordertype;
    }
    public Breadtype getBreadtype(){
        return breadtype;
    }
    public Saucetype getSaucetype(){
        return saucetype;
    }
    public Vegetabletype getVegetabletype(){
        return vegetabletype;
    }
    public enum Ordertype{
        ON_SITE,TAKE_AWAY,
    }

    public enum Breadtype{
        SIMPLE,OMELETTE,BUTTER,FRIED_EGG,GRILLED_FISH,PORK,BEEF,
    }
    public enum Saucetype{
        KETCHUP,CHILLI_SAUCE,MAYONNAISE,MUSTARD,SOY_SAUCE,FISH_SAUCE,OLIVE_OIL,
    }
    public enum Vegetabletype{
        SALAD,CUCUMBER,TOMATO,
    }
}