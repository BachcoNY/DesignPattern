package Structural_Pattern.CompositePattern;
//Tạo Leaf
public class SingleGift extends GiftBase {
    public SingleGift(String name, int price) {
        super(name, price);
    }

    @Override
    public int calculateTotalPrice() {
        System.out.println(name + " with the price " + price);
        return price;
    }
}
