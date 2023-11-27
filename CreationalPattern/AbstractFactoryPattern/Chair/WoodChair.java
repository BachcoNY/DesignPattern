package CreationalPattern.AbstractFactoryPattern.Chair;

public class WoodChair implements Chair {
    @Override
    public void create() {
        System.out.println("Create wood chair");
    }
}
