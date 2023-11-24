package Creational.AbstractFactoryPattern;

import Creational.AbstractFactoryPattern.Chair.Chair;
import Creational.AbstractFactoryPattern.Chair.WoodChair;
import Creational.AbstractFactoryPattern.Table.Table;
import Creational.AbstractFactoryPattern.Table.WoodTable;

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
