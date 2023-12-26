package com.example.devopsquiz;

public class Result {
    private int score;
    private int totalQuestions;

    public Result(int score, int totalQuestions) {
        this.score = score;
        this.totalQuestions = totalQuestions;
    }

    public int getScore() {
        return score;
    }

    public int getTotalQuestions() {
        return totalQuestions;
    }
}
