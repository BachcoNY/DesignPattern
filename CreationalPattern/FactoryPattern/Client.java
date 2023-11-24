package Creational.FactoryPattern;

public class Client {

    public static void main(String[] args) {
        Bank bank1 = BankFactory.getBank(BankType.TPBANK);
        System.out.println(bank1.getBankName()); //

        Bank bank2 = BankFactory.getBank(BankType.VIETCOMBANK);
        System.out.println(bank2.getBankName());
    }
}