import java.util.Scanner;

public class Menu {
    private static Scanner scanner = new Scanner(System.in);
    private int action;

    public Menu() {
        this.action = 0;
    }

    public int getAction() {
        return action;
    }

    // массив строк меню выбора опреции c игрушками
    private String[] arr_action = new String[]{
            "Выход",
            "Разыграть призовые игрушки",
            "Вывод списка игрушек",
            "Вывод списка призовых игрушек",
            "Вывод списка выданных игрушек",
            "Добавить новую игрушку",
            "Изменить шанс выпадения игрушки",
    };

    // вывод массива строк на экран в виде меню
    private void showText(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + " - " + arr[i]);
        }
    }

    // получить число от пользователя
    public double getNumber() {
        double num;
        if (scanner.hasNextDouble()) {
            num = scanner.nextDouble();
        } else {
            System.out.println("Вы допустили ошибку при вводе операции. Попробуйте еще раз.");
            scanner.next(); //рекурсия до правильного ввода
            num = getNumber();
        }
        return num;
    }

    // установка действия
    private void setAction() {
        while (true) {
            System.out.println("Выберите действие:");
            showText(arr_action);
            action = (int) getNumber();
            // проверяем выход за пределы существующих действий
            if (action < arr_action.length && action >= 0) {
                break;
            }
        }
    }

    // пройтись по меню и выбрать режим и операцию
    public void showMenu() {
        setAction();
    }
}