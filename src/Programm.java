
import java.util.ArrayList;
import java.util.List;

public class Programm {
    public static void main(String[] args) {
        //инициализация списка игрушек
        List<Toy> toys = new ArrayList<Toy>();

        //инициализация списка призовых игрушек
        List<Toy> prizeToys = new ArrayList<Toy>();

        //инициализация списка выданных игрушек
        List<Toy> sendToys = new ArrayList<Toy>();

        // инициализируем меню
        Menu m = new Menu();
        MenuAction ma = new MenuAction();

        // бесконечный цикл по меню, пока не выберем режим = 0
        while (true) {
            // вызов меню
            m.showMenu();
            // если выбрали режим 0 - выход из программы
            if (m.getAction() == 0) {
                System.out.println("Пока!");
                break;
            } else {
                System.out.println("Выбран пункт меню: " + m.getAction());
                ma.selectAction(m.getAction());
            }
        }
    }
}
