package Day53.Practice.Ibrahim.Inheritance;

public class Apple extends Fruit{
    int discount; // 15

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    @Override
    public void setPrice(double price) {
        super.price = price - (price * discount / 100);
    }
}
