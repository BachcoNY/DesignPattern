package Creational.AbstractFactoryPattern;

import Creational.AbstractFactoryPattern.Chair.Chair;
import Creational.AbstractFactoryPattern.Table.Table;

public class Client {
 
    public static void main(String[] args) {
 
        FurnitureAbstractFactory factory = FurnitureFactory.getFactory(MaterialType.FLASTIC);
 
        Chair chair = factory.createChair();
        chair.create(); // Create plastic chair
 
        Table table = factory.createTable();
        table.create(); // Create plastic table
    }
}