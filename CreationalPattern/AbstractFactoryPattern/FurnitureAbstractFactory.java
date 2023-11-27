package CreationalPattern.AbstractFactoryPattern;

import CreationalPattern.AbstractFactoryPattern.Chair.Chair;
import CreationalPattern.AbstractFactoryPattern.Table.Table;

public abstract class FurnitureAbstractFactory {
 
    public abstract Chair createChair();
 
    public abstract Table createTable();
     
}