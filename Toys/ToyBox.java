package Toys;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ToyBox {
    private List<Toy> toys;

    public ToyBox() {
        toys = new ArrayList<>();
    }

    public void addToy(Toy toy) {
        toys.add(toy);
    }

    public void updateToyWeight(int id, double weight) {
        for (Toy toy : toys) {
            if (toy.getId() == id) {
                toy.setWeight(weight);
                break;
            }
        }
    }

    public List<Toy> getPrizeToys(int count) {
        List<Toy> prizeToys = new ArrayList<>();
        double totalWeight = 0.0;

        for (Toy toy : toys) {
            totalWeight += toy.getWeight();
        }

        Random random = new Random();

        for (int i = 0; i < count; i++) {
            double randomValue = totalWeight * random.nextDouble();
            double currentWeight = 0.0;

            for (Toy toy : toys) {
                currentWeight += toy.getWeight();

                if (currentWeight >= randomValue) {
                    prizeToys.add(toy);
                    totalWeight -= toy.getWeight();
                    toys.remove(toy);
                    break;
                }
            }
        }

        return prizeToys;
    }
}
