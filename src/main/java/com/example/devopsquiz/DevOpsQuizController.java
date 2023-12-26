package com.example.devopsquiz;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class DevOpsQuizController {

    private final Quiz quiz = new Quiz();
    private Result userResult;

    @GetMapping("/quiz")
    public String showQuiz(Model model) {
        List<Question> questions = quiz.getQuestions();
        model.addAttribute("questions", questions);
        return "quiz";
    }

    @PostMapping("/quiz")
    public String submitQuiz(@RequestParam(name = "answers") List<Integer> answers, Model model) {
        int score = calculateScore(answers);
        userResult = new Result(score, quiz.getQuestions().size());
        model.addAttribute("userResult", userResult);
        return "result";
    }

    private int calculateScore(List<Integer> answers) {
        int score = 0;
        List<Question> questions = quiz.getQuestions();

        for (int i = 0; i < answers.size(); i++) {
            if (answers.get(i).equals(questions.get(i).getCorrectOption())) {
                score++;
            }
        }
        return score;
    }
}
