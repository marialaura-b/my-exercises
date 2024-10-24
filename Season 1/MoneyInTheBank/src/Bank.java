public class Bank {
    private double balance; //Saldo da conta (privado, so pode ser acessado na propria classe)

    public Bank(double balance) { //Construtor
        this.balance = balance; //diferencia o parâmetro balance do atributo balance da classe
    }

    public double getBalance() {
        return balance;
    } //Verifica saldo

    public double cash(double withdraw) {
        if (balance >= withdraw) {
            System.out.println("Ok! Podes levantar dinheiro, o teu saldo é: " + (balance - withdraw ));
            return balance -= withdraw;
        } else {
            System.out.println("Não há saldo suficiente");
            return balance;
        }
    }

    public void deposit(double cashDeposit) {
        if (cashDeposit > 0) {
            balance += cashDeposit;
            System.out.println("Já está! O deposito foi realizado e o saldo total é: " + balance);
            return; //balance += cashDeposit;
        }
        System.out.println("Quantidade invalida para depósito.");
        return;
    }
}