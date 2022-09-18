package dev.neigborstan.game.rpgquest.init;

import dev.neigborstan.game.rpgquest.entity.Answer;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AnswerInit {
    private final Map<Integer, Answer> answers = new HashMap<>();

    public AnswerInit(LocationInit locationInit, QuestionInit questionInit) {

        answers.put(1, new Answer(1, "Приветствовать", questionInit.getQuestionById(1), questionInit.getQuestionById(3)));
        answers.put(2, new Answer(2, "Уйти", questionInit.getQuestionById(1), questionInit.getQuestionById(2)));
        answers.put(3, new Answer(3, "Некоторые локации закрыты, как быть?", questionInit.getQuestionById(4), questionInit.getQuestionById(5)));
        answers.put(4, new Answer(4, "Уйти", questionInit.getQuestionById(4), questionInit.getQuestionById(2)));
        answers.put(5, new Answer(5, "Мне нужно в " + locationInit.getLocationById(14).getName(), questionInit.getQuestionById(3), questionInit.getQuestionById(4)));
        answers.put(6, new Answer(6, "Уйти", questionInit.getQuestionById(3), questionInit.getQuestionById(2)));
        answers.put(7, new Answer(7, "Спасибо! Буду должен", questionInit.getQuestionById(5), questionInit.getQuestionById(6)));
        answers.put(8, new Answer(8, "Пока не надо, зайду позже", questionInit.getQuestionById(5), questionInit.getQuestionById(2)));
        answers.put(9, new Answer(9, "Приветствовать", questionInit.getQuestionById(7), questionInit.getQuestionById(9)));
        answers.put(10, new Answer(10, "Уйти", questionInit.getQuestionById(7), questionInit.getQuestionById(8)));
        answers.put(11, new Answer(11, "Некоторые локации закрыты, как быть?", questionInit.getQuestionById(10), questionInit.getQuestionById(11)));
        answers.put(12, new Answer(12, "Уйти", questionInit.getQuestionById(10), questionInit.getQuestionById(8)));
        answers.put(13, new Answer(13, "Мне нужно в " + locationInit.getLocationById(14).getName(), questionInit.getQuestionById(9), questionInit.getQuestionById(10)));
        answers.put(14, new Answer(14, "Уйти", questionInit.getQuestionById(9), questionInit.getQuestionById(8)));
        answers.put(15, new Answer(15, "Спасибо! Буду должен", questionInit.getQuestionById(11), questionInit.getQuestionById(12)));
        answers.put(16, new Answer(16, "Пока не надо, зайду позже", questionInit.getQuestionById(11), questionInit.getQuestionById(8)));
        answers.put(17, new Answer(17, "Приветствовать", questionInit.getQuestionById(13), questionInit.getQuestionById(15)));
        answers.put(18, new Answer(18, "Уйти", questionInit.getQuestionById(13), questionInit.getQuestionById(14)));
        answers.put(19, new Answer(19, "Некоторые локации закрыты, как быть?", questionInit.getQuestionById(16), questionInit.getQuestionById(17)));
        answers.put(20, new Answer(20, "Уйти", questionInit.getQuestionById(16), questionInit.getQuestionById(14)));
        answers.put(21, new Answer(21, "Мне нужно в " + locationInit.getLocationById(14).getName(), questionInit.getQuestionById(15), questionInit.getQuestionById(16)));
        answers.put(22, new Answer(22, "Уйти", questionInit.getQuestionById(15), questionInit.getQuestionById(14)));
        answers.put(23, new Answer(23, "Спасибо! Буду должен", questionInit.getQuestionById(17), questionInit.getQuestionById(18)));
        answers.put(24, new Answer(24, "Пока не надо, зайду позже", questionInit.getQuestionById(17), questionInit.getQuestionById(14)));
        answers.put(25, new Answer(25, "Приветствовать", questionInit.getQuestionById(19), questionInit.getQuestionById(21)));
        answers.put(26, new Answer(26, "Уйти", questionInit.getQuestionById(19), questionInit.getQuestionById(20)));
        answers.put(27, new Answer(27, "Некоторые локации закрыты, как быть?", questionInit.getQuestionById(22), questionInit.getQuestionById(23)));
        answers.put(28, new Answer(28, "Уйти", questionInit.getQuestionById(22), questionInit.getQuestionById(20)));
        answers.put(29, new Answer(29, "Мне нужно в " + locationInit.getLocationById(14).getName(), questionInit.getQuestionById(21), questionInit.getQuestionById(22)));
        answers.put(30, new Answer(30, "Уйти", questionInit.getQuestionById(21), questionInit.getQuestionById(20)));
        answers.put(31, new Answer(31, "Спасибо! Буду должен", questionInit.getQuestionById(23), questionInit.getQuestionById(24)));
        answers.put(32, new Answer(32, "Пока не надо, зайду позже", questionInit.getQuestionById(23), questionInit.getQuestionById(20)));
        answers.put(33, new Answer(33, "Приветствовать", questionInit.getQuestionById(25), questionInit.getQuestionById(27)));
        answers.put(34, new Answer(34, "Уйти", questionInit.getQuestionById(25), questionInit.getQuestionById(26)));
        answers.put(35, new Answer(35, "Некоторые локации закрыты, как быть?", questionInit.getQuestionById(28), questionInit.getQuestionById(29)));
        answers.put(36, new Answer(36, "Уйти", questionInit.getQuestionById(28), questionInit.getQuestionById(26)));
        answers.put(37, new Answer(37, "Мне нужно в " + locationInit.getLocationById(14).getName(), questionInit.getQuestionById(27), questionInit.getQuestionById(28)));
        answers.put(38, new Answer(38, "Уйти", questionInit.getQuestionById(27), questionInit.getQuestionById(26)));
        answers.put(39, new Answer(39, "Спасибо! Буду должен", questionInit.getQuestionById(29), questionInit.getQuestionById(30)));
        answers.put(40, new Answer(40, "Пока не надо, зайду позже", questionInit.getQuestionById(29), questionInit.getQuestionById(26)));
        answers.put(41, new Answer(41, "Приветствовать", questionInit.getQuestionById(31), questionInit.getQuestionById(33)));
        answers.put(42, new Answer(42, "Уйти", questionInit.getQuestionById(31), questionInit.getQuestionById(32)));
        answers.put(43, new Answer(43, "Некоторые локации закрыты, как быть?", questionInit.getQuestionById(34), questionInit.getQuestionById(35)));
        answers.put(44, new Answer(44, "Уйти", questionInit.getQuestionById(34), questionInit.getQuestionById(32)));
        answers.put(45, new Answer(45, "Мне нужно в " + locationInit.getLocationById(14).getName(), questionInit.getQuestionById(33), questionInit.getQuestionById(34)));
        answers.put(46, new Answer(46, "Уйти", questionInit.getQuestionById(33), questionInit.getQuestionById(32)));
        answers.put(47, new Answer(47, "Спасибо! Буду должен", questionInit.getQuestionById(35), questionInit.getQuestionById(36)));
        answers.put(48, new Answer(48, "Пока не надо, зайду позже", questionInit.getQuestionById(35), questionInit.getQuestionById(32)));
        answers.put(49, new Answer(49, "Приветствовать", questionInit.getQuestionById(37), questionInit.getQuestionById(39)));
        answers.put(50, new Answer(50, "Уйти", questionInit.getQuestionById(37), questionInit.getQuestionById(38)));
        answers.put(51, new Answer(51, "Некоторые локации закрыты, как быть?", questionInit.getQuestionById(40), questionInit.getQuestionById(41)));
        answers.put(52, new Answer(52, "Уйти", questionInit.getQuestionById(40), questionInit.getQuestionById(38)));
        answers.put(53, new Answer(53, "Мне нужно в " + locationInit.getLocationById(14).getName(), questionInit.getQuestionById(39), questionInit.getQuestionById(40)));
        answers.put(54, new Answer(54, "Уйти", questionInit.getQuestionById(39), questionInit.getQuestionById(38)));
        answers.put(55, new Answer(55, "Спасибо! Буду должен", questionInit.getQuestionById(41), questionInit.getQuestionById(42)));
        answers.put(56, new Answer(56, "Пока не надо, зайду позже", questionInit.getQuestionById(41), questionInit.getQuestionById(38)));
        answers.put(57, new Answer(57, "Приветствовать", questionInit.getQuestionById(43), questionInit.getQuestionById(45)));
        answers.put(58, new Answer(58, "Уйти", questionInit.getQuestionById(43), questionInit.getQuestionById(44)));
        answers.put(59, new Answer(59, "Некоторые локации закрыты, как быть?", questionInit.getQuestionById(46), questionInit.getQuestionById(47)));
        answers.put(60, new Answer(60, "Уйти", questionInit.getQuestionById(46), questionInit.getQuestionById(44)));
        answers.put(61, new Answer(61, "Мне нужно в " + locationInit.getLocationById(14).getName(), questionInit.getQuestionById(45), questionInit.getQuestionById(46)));
        answers.put(62, new Answer(62, "Уйти", questionInit.getQuestionById(45), questionInit.getQuestionById(44)));
        answers.put(63, new Answer(63, "Спасибо! Буду должен", questionInit.getQuestionById(47), questionInit.getQuestionById(48)));
        answers.put(64, new Answer(64, "Пока не надо, зайду позже", questionInit.getQuestionById(47), questionInit.getQuestionById(44)));
        answers.put(65, new Answer(65, "Приветствовать", questionInit.getQuestionById(49), questionInit.getQuestionById(51)));
        answers.put(66, new Answer(66, "Уйти", questionInit.getQuestionById(49), questionInit.getQuestionById(50)));
        answers.put(67, new Answer(67, "Некоторые локации закрыты, как быть?", questionInit.getQuestionById(52), questionInit.getQuestionById(53)));
        answers.put(68, new Answer(68, "Уйти", questionInit.getQuestionById(52), questionInit.getQuestionById(50)));
        answers.put(69, new Answer(69, "Мне нужно в " + locationInit.getLocationById(14).getName(), questionInit.getQuestionById(51), questionInit.getQuestionById(52)));
        answers.put(70, new Answer(70, "Уйти", questionInit.getQuestionById(51), questionInit.getQuestionById(50)));
        answers.put(71, new Answer(71, "Спасибо! Буду должен", questionInit.getQuestionById(53), questionInit.getQuestionById(54)));
        answers.put(72, new Answer(72, "Пока не надо, зайду позже", questionInit.getQuestionById(53), questionInit.getQuestionById(50)));
    }

    public List<Answer> getAnswersByQuestionId(int questionId) {
        return answers.values().stream()
                .filter(v -> {
                    if (v.getPrev() == null) {
                        throw new IllegalArgumentException();
                    }
                    return v.getPrev().getId() == questionId;
                })
                .collect(Collectors.toList());
    }

    public Answer getAnswerById(int id) {
        return answers.get(id);
    }
}
