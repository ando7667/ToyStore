public class Toy {
    String idToy;
    String nameToy;
    String amount;
    String chanceFalling;

    public Toy(String id, String name) {
        this(id,name,"1","1");
    }

    public Toy(String id, String name, String amount, String chance) {
        if (id == null || id.length() > 10) {
            throw new IllegalArgumentException("invalid idToy");
        }
        if (nameToy == null || nameToy.length() > 30) {
            throw new IllegalArgumentException("invalid nameToy");
        }
        if (amount == null || amount.length() > 10) {
            throw new IllegalArgumentException("invalid amount");
        }
        if (chance == null || chance.length() > 3) {
            chance = "100";
        }

        this.idToy = id;
        this.nameToy = name;
        this.amount = amount;
        this.chanceFalling = chance;
    }

    @Override
    public String toString() {
        return "id: " + idToy + ", название: " + nameToy + ", количество: " + amount + ", шанс выпадения: " + chanceFalling + ";";
    }
}
