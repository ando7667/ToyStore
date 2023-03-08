import java.util.List;

public class RaffleToy {

    public Toy raffleToy(List<Toy> toys) {
        double completeWeight = 0.0;
        for (Toy toy : toys)
            completeWeight += (double) (toy.getChanceFalling());
        double r = Math.random() * completeWeight;
        double countWeight = 0.0;
        for (Toy toy : toys) {
            countWeight += (double) (toy.getChanceFalling());
            if (countWeight >= r)
                return toy;
        }
        throw new RuntimeException("Нечего показывать.");
    }

}
