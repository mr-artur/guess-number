package ua.kpi.guessnumber.models;

import java.util.ArrayList;
import java.util.List;

public class Model {

    private final int correctAnswer;
    private final List<Integer> answers = new ArrayList<>();
    private int bottomLimit;
    private int topLimit;

    public Model(int correctAnswer, int bottomLimit, int topLimit) {
        this.correctAnswer = correctAnswer;
        this.bottomLimit = bottomLimit;
        this.topLimit = topLimit;
    }

    public void setBottomLimit(int bottomLimit) {
        this.bottomLimit = bottomLimit;
    }

    public void setTopLimit(int topLimit) {
        this.topLimit = topLimit;
    }

    public void addAnswer(int answer) {
        answers.add(answer);
    }

    public int getBottomLimit() {
        return bottomLimit;
    }

    public int getTopLimit() {
        return topLimit;
    }

    public List<Integer> getAnswers() {
        return answers;
    }

    public void tryToGuess(int answer) {
        addAnswer(answer);
        if (!isAnswerCorrect()) {
            updateLimits(answer);
        }
    }

    public boolean isAnswerCorrect() {
        int lastIndex = answers.size() - 1;
        return lastIndex >= 0 && answers.get(lastIndex) == correctAnswer;
    }

    private void updateLimits(int answer) {
        if (answer > correctAnswer) {
            setTopLimit(answer);
        } else {
            setBottomLimit(answer);
        }
    }
}
