public class Person {
    //private String name;
    //private float raiseMoney;//propriedade/atributos
    //private float depositMoney;
    Bank bank;

    public Person(Bank bank){ //, float raiseMoney, float depositMoney){/ onde inicializam as propriedades

        //this.name = name;
        //this.raiseMoney = raiseMoney;
        //this.depositMoney = depositMoney;
        this.bank = bank; //inicialização da propriedade
    }

    public void cash(double withdraw){
        bank.cash(withdraw);
    }

   public void deposit(float amount){
        bank.deposit(amount);
    }
}


