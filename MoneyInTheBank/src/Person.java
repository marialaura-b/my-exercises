public class Person {
    //private String name;
    public float raiseMoney;//propriedade/atributos
    public float depositMoney;
    Bank bank;

    public Person(Bank bank, float raiseMoney, float depositMoney){

        //this.name = name;
        this.raiseMoney = raiseMoney;
        this.depositMoney = depositMoney;
        this.bank = bank;
    }

    public void cash(double withdraw){
        bank.cash(withdraw);
    }
}


