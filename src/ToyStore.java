import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ToyStore {

    int idToy = 1;
    //инициализируем список игрушек
//    private final Map<String, Toy> toyList = new HashMap<>();
    private List<Toy> toyList;


    public ToyStore(List<Toy> toys){
        this.toyList = toys;
    }



    // получить запись игрушки из списка игрушек
    public Toy getToy(int id) {
        return toyList.get(id);
    }

    // добавление игрушки к списку
    public Toy addToy(String name, int amount, int chance) {
        idToy++;
        int id = idToy;
        Toy toy = new Toy(id, name, amount, chance);
        toyList.add(toy);
        return toy;
    }

    public void changeToy(int id, String name, int amount, int chance) {
        Toy toy = getToy(id);
        toy.setNameToy(name);
        toy.setAmount(amount);
        toy.setChanceFalling(chance);
    }

    public void changeToy(int id, int chance) {
        Toy toy = getToy(searchIndexToy(id));
        toy.setChanceFalling(chance);
    }
    public void changeAmountToy(int id, int amount) {
        Toy toy = getToy(searchIndexToy(id));
        toy.setAmount(amount);
    }

    public Toy searchToy(int codeIsIn) {
            for(Toy toy : toyList) {
                if(toy.getIdToy() == codeIsIn) {
                    return toy;
                }
            }
            return null;
    }

    public int searchIndexToy(int codeIcIn) {
        int index = -1;
        for (Toy toy : toyList) {
            if (toy.getIdToy() == codeIcIn) index = toyList.indexOf(toy);
        }
        return index;
    }

    private void removeToy(int id) {
        toyList.remove(id);
    }

    public void printToys() {
        for (int i = 0; i < toyList.size(); i++) {
            System.out.println("index:" + i + " => " + toyList.get(i));
        }
    }

    public Toy getRiffleToy() {
        RaffleToy random = new RaffleToy();
        return random.raffleToy(toyList);
    }

    public void saveRiffleToy(List<Toy> prizeToy) {
        Toy toy = prizeToy.get(0);
        String text = toy.toString();
        try (FileWriter writer = new FileWriter("./src/Toys.txt", true)) {
            writer.write(text);
            writer.append('\n');
            writer.flush();
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
        prizeToy.remove(toy);
    }
}

