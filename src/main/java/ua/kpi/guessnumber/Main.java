package ua.kpi.guessnumber;

import ua.kpi.guessnumber.controllers.Controller;
import ua.kpi.guessnumber.models.Model;
import ua.kpi.guessnumber.views.View;

public class Main {

    public static void main(String[] args) {
        Model model = new Model(50, 0, 100);
        View view = new View();
        Controller controller = new Controller(model, view);
        controller.startGame();
    }
}
