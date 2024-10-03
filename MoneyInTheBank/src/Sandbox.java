public class Sandbox {

    public static void main(String[] args) {

        Bank bank = new Bank(50000);
        Person person = new Person(bank); //uma referência aponta para um novo obj
        // System.out.println(person.cash());

        person.cash(40);
        person.deposit(800);
    }
}