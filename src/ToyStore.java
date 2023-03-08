import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ToyStore {

    int idToy = 0;
    //инициализируем список игрушек
    private final Map<String, Toy> toyList = new HashMap<>();

    // получить запись игрушки из списка игрушек
    public Toy getToy(String id) {
        return toyList.get(id);
    }

    // добавление игрушки к списку
    public Toy addToy(String name, String amount, String chance) {
        idToy++;
        String id = Integer.toString(idToy);
        Toy toy = new Toy(id, name, amount , chance);
        return toyList.put(id, toy);
    }

    public void printToys() {

    }
}
