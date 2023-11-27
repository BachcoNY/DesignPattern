package Structural_Pattern.CompositePattern;
//Tạo Component
public abstract class GiftBase {
    protected String name;
    protected int price;

    public GiftBase(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public abstract int calculateTotalPrice();
}

