package Structural_Pattern.CompositePattern;

import java.util.ArrayList;
import java.util.List;
//Tạo Composite
public class CompositeGift extends GiftBase implements IGiftOperations {
    private List<GiftBase> gifts;

    public CompositeGift(String name, int price) {
        super(name, price);
        this.gifts = new ArrayList<>();
    }

    @Override
    public void Add(GiftBase gift) {
        gifts.add(gift);
    }

    @Override
    public void Remove(GiftBase gift) {
        gifts.remove(gift);
    }

    @Override
    public int calculateTotalPrice() {
        int total = 0;

        System.out.println(name + " contains the following products with prices:");

        for (GiftBase gift : gifts) {
            total += gift.calculateTotalPrice();
        }

        return total;
    }
}
