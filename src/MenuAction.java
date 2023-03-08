import java.util.Scanner;

public class MenuAction {

    private static Scanner inputUser = new Scanner(System.in);
    public void selectAction(int action, ToyStore toys) {

        switch (action) {
            case 1:
                rafflePrizeToys();
                break;
            case 2:
                toys.printToys();
                break;
            case 3:
                displayingPrizeToys();
                break;
            case 4:
                outputIssuedToys();
                break;
            case 5:
                addNewToy(toys);
                break;
            case 6:
                changeChanceToy(toys);
                break;
            default:
                System.out.println("Был передан неправильный аргумент меню!");
                break;
        }
    }

    public void rafflePrizeToys() {

    }

    public void displayingPrizeToys() {

    }

    public void outputIssuedToys() {

    }

    public void addNewToy(ToyStore toys) {
        System.out.println("Введите наименование игрушки");
        String name = inputUser.nextLine();
        if (name == null || name.length() > 30) {
            System.out.println("Ошибка ввода");
        }
        System.out.println("Введите количество этой игрушки");
        String amount = inputUser.nextLine();
        if (amount == null || amount.length() > 30) {
            System.out.println("Ошибка ввода");
        }
        String chance = inputChance();
        toys.addToy(name, amount, chance);
    }

    public void changeChanceToy(ToyStore toys) {
        String id = inputIdToys();
        String chance = inputChance();
        toys.changeToy(id, chance);
    }

    public String inputIdToys() {
        System.out.println("Введите id игрушки");
        String id = inputUser.nextLine();
        if (id == null || id.length() > 10) {
            System.out.println("Ошибка ввода");
        }
        return id;
    }

    public String inputChance() {
        System.out.println("Введите шанс выпадения игушки:");
        String chance = inputUser.nextLine();
        if (chance == null || chance.length() > 10) {
            System.out.println("Ошибка ввода");
        }
        return chance;
    }
}
