package App;

import Presenter.Presenter;
import View.ConsoleView;

public class Main {
    public static void main(String[] args) {

        Presenter presenter =new Presenter(new ConsoleView());
        presenter.start();

    }
}
