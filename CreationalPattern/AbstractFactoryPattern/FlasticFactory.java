package CreationalPattern.AbstractFactoryPattern;

import CreationalPattern.AbstractFactoryPattern.Chair.Chair;
import CreationalPattern.AbstractFactoryPattern.Chair.PlasticChair;
import CreationalPattern.AbstractFactoryPattern.Table.PlasticTable;
import CreationalPattern.AbstractFactoryPattern.Table.Table;

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