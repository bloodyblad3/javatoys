package Toys;
import java.util.List;

public class Main {
    
    public static void main(String[] args) {

        ToyBox toyBox = new ToyBox();

        toyBox.addToy(new Toy("Car", 10, 20));
        toyBox.addToy(new Toy("Doll", 5, 30));
        toyBox.addToy(new Toy("Teddy Bear", 7, 50));

        List<Toy> prizeToys = toyBox.getPrizeToys(2);

        for (Toy toy : prizeToys) {
            System.out.println("prize toy: " + toy.getName());
        }

        toyBox.updateToyWeight(1, 25.0);

        prizeToys = toyBox.getPrizeToys(1);

        for (Toy toy : prizeToys) {
            System.out.println("prize toy: " + toy.getName());
        }
    }
}
