import java.util.List;
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
