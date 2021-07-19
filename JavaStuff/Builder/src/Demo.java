public class Demo {
    public static void main(String[]args){
        Order order = new FastFoodBuilder().orderType(Order.Ordertype.ON_SITE).orderBread(Order.Breadtype.GRILLED_FISH).orderSauce(Order.Saucetype.CHILLI_SAUCE)
                .orderVegetable(Order.Vegetabletype.TOMATO).build();
        System.out.println(order);
    }
}
