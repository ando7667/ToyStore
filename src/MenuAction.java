import java.util.List;

public class MenuAction {

    public void selectAction(int action, ToyStore toys) {

        switch (action) {
            case 1:
                RafflePrizeToys();
                break;
            case 2:
                toys.printToys();
                break;
            case 3:
                DisplayingPrizeToys();
                break;
            case 4:
                OutputIssuedToys();
                break;
            case 5:
                AddNewToy();
                break;
            case 6:
                ChangeChanceToy();
                break;
            default:
                System.out.println("Был передан неправильный аргумент меню!");
                break;
        }
    }

    public void RafflePrizeToys() {

    }

    public void DisplayingListToys() {

    }

    public void DisplayingPrizeToys() {

    }

    public void OutputIssuedToys() {

    }

    public void AddNewToy() {

    }

    public void ChangeChanceToy() {

    }


}
