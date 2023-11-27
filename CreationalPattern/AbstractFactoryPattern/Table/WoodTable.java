package CreationalPattern.AbstractFactoryPattern.Table;

public class WoodTable implements Table {
    @Override
    public void create() {
        System.out.println("Create wood table");
    }
}