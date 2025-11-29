import observer.Investor;
import subject.Stock;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Stock google = new Stock("GOOGL", 2800);

    Investor alice = new Investor("Alice");
    Investor bob = new Investor("Bob");

    google.attach(alice);
    google.attach(bob);

    google.setPrice(2850);
    google.setPrice(2900);
}
