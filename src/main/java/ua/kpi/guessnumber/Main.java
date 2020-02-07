package ua.kpi.guessnumber;

import ua.kpi.guessnumber.controllers.Controller;
import ua.kpi.guessnumber.models.Model;
import ua.kpi.guessnumber.views.View;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int bottomLimit = 0;
        int topLimit = 100;
        int correctAnswer = new Random().nextInt(topLimit) + bottomLimit;
        Model model = new Model(correctAnswer, bottomLimit, topLimit);
        View view = new View();
        Controller controller = new Controller(model, view);
        controller.startGame();
    }
}
