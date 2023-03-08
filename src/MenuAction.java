import java.util.List;
import java.util.Scanner;
import java.util.concurrent.LinkedBlockingDeque;

public class MenuAction {

    private static Scanner inputUser = new Scanner(System.in);

    public void selectAction(int action, ToyStore toys, List<Toy> prizeToy) {

        switch (action) {
            case 1:
                rafflePrizeToys(toys, prizeToy);
                break;
            case 2:
                toys.printToys();
                break;
            case 3:
                printPrizeToys(prizeToy);
                break;
            case 4:
                outputIssuedToys();
                break;
            case 5:
                takePrizeToy(toys, prizeToy);
                break;
            case 6:
                addNewToy(toys);
                break;
            case 7:
                changeChanceToy(toys);
                break;
            default:
                System.out.println("Был передан неправильный аргумент меню!");
                break;
        }
    }

    public void rafflePrizeToys(ToyStore toys, List<Toy> prizeToy) {
        int count = inputInt("Введите количество разыгрываемых игрушек:");
        for (int i = count; i > 0; i--) {
            Toy toy = toys.getRiffleToy();
            int amount = toy.getAmount();
            int id = toy.getIdToy();
            if (amount >= 1) {
                amount--;
                toys.changeAmountToy(id, amount);
                toy.setAmount(amount);
                prizeToy.add(toy);
            }
        }
    }

    public void printPrizeToys(List<Toy> prizeToy) {
        for (int i = 0; i < prizeToy.size(); i++) {
            System.out.println("index:" + i + " => " + prizeToy.get(i));
        }
    }

    public void takePrizeToy(ToyStore toys, List<Toy> prizeToy) {
        if (!prizeToy.isEmpty()) {
            int count = inputInt("Введите количество игрушек для выдачи:");
            for (int i = count; i > 0; i--) {
                toys.saveRiffleToy(prizeToy);
            }
        }
    }

    public void outputIssuedToys() {

    }

    public void addNewToy(ToyStore toys) {
        System.out.println("Введите наименование игрушки");
        String name = inputUser.nextLine();
        if (name == null || name.length() > 30) {
            System.out.println("Ошибка ввода");
        }

        int amount = inputInt("Введите количество этой игрушки");
        int chance = inputInt("Введите шанс выпадения игушки:");
        toys.addToy(name, amount, chance);
    }

    public void changeChanceToy(ToyStore toys) {
        int id = inputInt("Введите ид игрушки:");
        int chance = inputInt("Введите шанс выпадения игушки:");
        toys.changeToy(id, chance);
    }


    // ввод целого числа
    public int inputInt(String str) {
        System.out.println(str);
        int num;
        if (inputUser.hasNextInt()) {
            num = inputUser.nextInt();
        } else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            inputUser.next();
            //рекурсия
            num = inputInt(str);
        }
        return num;
    }

}
