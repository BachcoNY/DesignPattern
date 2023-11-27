package CreationalPattern.AbstractFactoryPattern;

import CreationalPattern.AbstractFactoryPattern.Chair.Chair;
import CreationalPattern.AbstractFactoryPattern.Chair.WoodChair;
import CreationalPattern.AbstractFactoryPattern.Table.Table;
import CreationalPattern.AbstractFactoryPattern.Table.WoodTable;

public class WoodFactory extends FurnitureAbstractFactory {
 
    @Override
    public Chair createChair() {
        return new WoodChair();
    }
 
    @Override
    public Table createTable() {
        return new WoodTable();
    }
}
