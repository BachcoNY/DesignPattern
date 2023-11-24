package Creational.AbstractFactoryPattern;

import Creational.AbstractFactoryPattern.Chair.Chair;
import Creational.AbstractFactoryPattern.Table.Table;

public abstract class FurnitureAbstractFactory {
 
    public abstract Chair createChair();
 
    public abstract Table createTable();
     
}