public class Sandbox {

    public static void main(String[] args) {

        Bank bank = new Bank(50000f);
        Person person = new Person(bank, 50, 50);
        // System.out.println(person.cash());

        person.cash(40f);
    }
}