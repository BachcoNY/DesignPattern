package Creational.AbstractFactoryPattern;

import Creational.AbstractFactoryPattern.Chair.Chair;
import Creational.AbstractFactoryPattern.Chair.PlasticChair;
import Creational.AbstractFactoryPattern.Table.PlasticTable;
import Creational.AbstractFactoryPattern.Table.Table;

public class FlasticFactory extends FurnitureAbstractFactory {
 
    @Override
    public Chair createChair() {
        return new PlasticChair();
    }
 
    @Override
    public Table createTable() {
        return new PlasticTable();
    }
 
}