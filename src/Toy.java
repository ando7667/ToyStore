public class Toy {
    private int idToy;
    private String nameToy;
    private int amount;
    private int chanceFalling;

    public Toy(int id, String name) {
        this(id, name, 1, 1);
    }

    public Toy(int id, String name, int amount, int chance) {
//        if (id == null || id.length() > 10) {
//            throw new IllegalArgumentException("invalid idToy");
//        }
//        if (name == null || name.length() > 30) {
//            throw new IllegalArgumentException("invalid nameToy");
//        }
//        if (amount == null || amount.length() > 10) {
//            throw new IllegalArgumentException("invalid amount");
//        }
//        if (chance == null || chance.length() > 3) {
//            chance = "100";
//        }

        this.idToy = id;
        this.nameToy = name;
        this.amount = amount;
        this.chanceFalling = chance;
    }
    public int getIdToy() {
        return idToy;
    }

    public String getNameToy() {
        return nameToy;
    }

    public void setNameToy(String name) {
        this.nameToy = name;
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

    public void setChanceFalling(int chance) {
        this.chanceFalling = chance;
    }

    @Override
    public String toString() {
        return "id:" + idToy + ", наименование:" + nameToy + ", количество:" + amount + ", шанс выпадения:" + chanceFalling + ";";
    }
}
