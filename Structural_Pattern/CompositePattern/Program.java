package Structural_Pattern.CompositePattern;

public class Program {
    public static void main(String[] args) {
        // Single gift
        SingleGift phone = new SingleGift("Phone", 256);
        phone.calculateTotalPrice();

        // Composite gift
        CompositeGift rootBox = new CompositeGift("RootBox", 0);
        SingleGift truckToy = new SingleGift("TruckToy", 289);
        SingleGift plainToy = new SingleGift("PlainToy", 587);
        rootBox.Add(truckToy);
        rootBox.Add(plainToy);

        CompositeGift childBox = new CompositeGift("ChildBox", 0);
        SingleGift soldierToy = new SingleGift("SoldierToy", 200);
        childBox.Add(soldierToy);

        rootBox.Add(childBox);

        System.out.println("Total price of this composite present is: " + rootBox.calculateTotalPrice());
    }
}

