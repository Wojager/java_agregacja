public class Bank {
    public static void main(String[] args) {

        Person person1 = new Person();
        person1.firstName = "Jan";
        person1.lastName = "Kowalski";
        person1.pesel = "21212121212";

        Address addressPerson1 = new Address();
        addressPerson1.country = "Poland";
        addressPerson1.city = "Kalisz";
        addressPerson1.zip = "12-123";
        addressPerson1.street = "Inna";
        addressPerson1.houseNumber = "22A";
        addressPerson1.flatNumber = "13";

        person1.livingAddress = addressPerson1;
        person1.registeredAddress =addressPerson1;

        BankAccount bankAccount1 = new BankAccount();
        bankAccount1.owner = person1;
        bankAccount1.balance = 10_000.00;

        Credit credit1 = new Credit();
        credit1.borrower = person1;
        credit1.cashBorrowed = 5000.00;
        credit1.cashReturned = 0.00;
        credit1.interestRate = 0.10;
        credit1.termMonths = 12;

        System.out.println("osoba: ");
        System.out.println(person1.firstName + " " + person1.lastName + " " + person1.pesel);
        System.out.println("posiada konto bankowe z kwotą: " + bankAccount1.balance);
        System.out.println("oraz kredyt na kwotę: " + credit1.cashBorrowed);

    }
}
