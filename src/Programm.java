
import java.util.ArrayList;
import java.util.List;

public class Programm {
    public static void main(String[] args) {

        List<Toy> listToys = new ArrayList<Toy>();

        //инициализация списка игрушек
        ToyStore toys = new ToyStore(listToys);

        //инициализация списка призовых игрушек
        List<Toy> prizeToys = new ArrayList<Toy>();

        //инициализация списка выданных игрушек
        List<Toy> sendToys = new ArrayList<Toy>();

        // инициализируем меню
        Menu m = new Menu();
        MenuAction ma = new MenuAction();

        toys.addToy("Самокат", 2, 2);
        toys.addToy("Настольная игра 'Поле чудес'", 10, 5);
        toys.addToy("Настольная игра 'Шахматы'", 15, 5);
        toys.addToy("Бинокль", 20, 10);
        toys.addToy("Машинка", 25, 15);
        toys.addToy("Паровозик", 35, 25);
        toys.addToy("Скакалка", 50, 30);


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
                ma.selectAction(m.getAction(), toys, prizeToys);
            }
        }
    }
}
