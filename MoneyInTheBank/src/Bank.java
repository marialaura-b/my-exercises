public class Bank {

    private double balance;

    public Bank(double balance) {

        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }
    public double cash(double withdraw) {
        if (balance > withdraw) {
            System.out.println("Ok! Podes levantar dinheiro, o teu saldo é: " + (balance - withdraw ));
            return balance -= withdraw;
        } else {
            System.out.println("Não há saldo suficiente");
            return balance;
        }
    }

    public double deposit(double cashDeposit) {
        System.out.println("Já está! " + (balance += cashDeposit));
        return balance += cashDeposit;
    }
}