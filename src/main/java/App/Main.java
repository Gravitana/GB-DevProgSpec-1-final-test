package App;

import Presenter.Presenter;
import View.ConsoleView;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Presenter presenter =new Presenter(new ConsoleView());
        presenter.start();

    }
}
