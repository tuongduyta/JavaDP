
public interface OrderBuilder {
    public OrderBuilder orderType(Order.Ordertype ordertype);
    public OrderBuilder orderBread(Order.Breadtype breadtype);
    public OrderBuilder orderSauce(Order.Saucetype saucetype);
    public OrderBuilder orderVegetable(Order.Vegetabletype vegetabletype);
    public Order build();


}
