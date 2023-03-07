package ToyStore;

public class Toy {
    int idToy;
    String nameToy;
    int amount;
    int chanceFalling;

    public Toy(int id, String name) {
        this.idToy = id;
        this.nameToy = name;
        this.amount = 1;
        this.chanceFalling = 1;
    }

    public Toy(int id, String name, int amount, int chance) {
        this.idToy = id;
        this.nameToy = name;
        this.amount = amount;
        this.chanceFalling = chance;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getChanceFalling() {
        return chanceFalling;
    }

    public void setChanceFalling(int chanceFalling) {
        this.chanceFalling = chanceFalling;
    }

    @Override
    public String toString() {
        return "id: " + idToy + ", название: " + nameToy + ", количество: " + amount + ", шанс выпадения: " + chanceFalling + ";";
    }
}
