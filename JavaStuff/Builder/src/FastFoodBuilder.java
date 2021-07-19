public class FastFoodBuilder implements OrderBuilder{
    private Order.Ordertype ordertype;
    private Order.Breadtype breadtype;
    private Order.Saucetype saucetype;
    private Order.Vegetabletype vegetabletype;
    @Override
    public OrderBuilder orderType(Order.Ordertype ordertype) {
        this.ordertype = ordertype;
        return this;
    }

    @Override
    public OrderBuilder orderBread(Order.Breadtype breadtype) {
        this.breadtype = breadtype;
        return this;
    }

    @Override
    public OrderBuilder orderSauce(Order.Saucetype saucetype) {
        this.saucetype = saucetype;
        return this;
    }

    @Override
    public OrderBuilder orderVegetable(Order.Vegetabletype vegetabletype) {
        this.vegetabletype = vegetabletype;
        return this;
    }

    @Override
    public Order build() {
        return new Order(ordertype,breadtype,saucetype,vegetabletype);
    }
}
