package dev.neigborstan.game.rpgquest.init;

import dev.neigborstan.game.rpgquest.entity.Answer;
import dev.neigborstan.game.rpgquest.repository.LocationRepo;
import dev.neigborstan.game.rpgquest.repository.QuestionRepo;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class AnswerInit {
    @Getter
    private final List<Answer> answers = new ArrayList<>();

    public AnswerInit(LocationRepo locationRepo, QuestionRepo questionRepo) {

        answers.add(new Answer(1, "Приветствовать", questionRepo.getById(1), questionRepo.getById(3)));
        answers.add(new Answer(2, "Уйти", questionRepo.getById(1), questionRepo.getById(2)));
        answers.add(new Answer(3, "Некоторые локации закрыты, как быть?", questionRepo.getById(4), questionRepo.getById(5)));
        answers.add(new Answer(4, "Уйти", questionRepo.getById(4), questionRepo.getById(2)));
        answers.add(new Answer(5, "Мне нужно в " + locationRepo.getById(14).getName(), questionRepo.getById(3), questionRepo.getById(4)));
        answers.add(new Answer(6, "Уйти", questionRepo.getById(3), questionRepo.getById(2)));
        answers.add(new Answer(7, "Спасибо! Буду должен", questionRepo.getById(5), questionRepo.getById(6)));
        answers.add(new Answer(8, "Пока не надо, зайду позже", questionRepo.getById(5), questionRepo.getById(2)));

        answers.add(new Answer(9, "Приветствовать", questionRepo.getById(7), questionRepo.getById(9)));
        answers.add(new Answer(10, "Уйти", questionRepo.getById(7), questionRepo.getById(8)));
        answers.add(new Answer(11, "Некоторые локации закрыты, как быть?", questionRepo.getById(10), questionRepo.getById(11)));
        answers.add(new Answer(12, "Уйти", questionRepo.getById(10), questionRepo.getById(8)));
        answers.add(new Answer(13, "Мне нужно в " + locationRepo.getById(14).getName(), questionRepo.getById(9), questionRepo.getById(10)));
        answers.add(new Answer(14, "Уйти", questionRepo.getById(9), questionRepo.getById(8)));
        answers.add(new Answer(15, "Спасибо! Буду должен", questionRepo.getById(11), questionRepo.getById(12)));
        answers.add(new Answer(16, "Пока не надо, зайду позже", questionRepo.getById(11), questionRepo.getById(8)));

        answers.add(new Answer(17, "Приветствовать", questionRepo.getById(13), questionRepo.getById(15)));
        answers.add(new Answer(18, "Уйти", questionRepo.getById(13), questionRepo.getById(14)));
        answers.add(new Answer(19, "Некоторые локации закрыты, как быть?", questionRepo.getById(16), questionRepo.getById(17)));
        answers.add(new Answer(20, "Уйти", questionRepo.getById(16), questionRepo.getById(14)));
        answers.add(new Answer(21, "Мне нужно в " + locationRepo.getById(14).getName(), questionRepo.getById(15), questionRepo.getById(16)));
        answers.add(new Answer(22, "Уйти", questionRepo.getById(15), questionRepo.getById(14)));
        answers.add(new Answer(23, "Спасибо! Буду должен", questionRepo.getById(17), questionRepo.getById(18)));
        answers.add(new Answer(24, "Пока не надо, зайду позже", questionRepo.getById(17), questionRepo.getById(14)));

        answers.add(new Answer(25, "Приветствовать", questionRepo.getById(19), questionRepo.getById(21)));
        answers.add(new Answer(26, "Уйти", questionRepo.getById(19), questionRepo.getById(20)));
        answers.add(new Answer(27, "Некоторые локации закрыты, как быть?", questionRepo.getById(22), questionRepo.getById(23)));
        answers.add(new Answer(28, "Уйти", questionRepo.getById(22), questionRepo.getById(20)));
        answers.add(new Answer(29, "Мне нужно в " + locationRepo.getById(14).getName(), questionRepo.getById(21), questionRepo.getById(22)));
        answers.add(new Answer(30, "Уйти", questionRepo.getById(21), questionRepo.getById(20)));
        answers.add(new Answer(31, "Спасибо! Буду должен", questionRepo.getById(23), questionRepo.getById(24)));
        answers.add(new Answer(32, "Пока не надо, зайду позже", questionRepo.getById(23), questionRepo.getById(20)));

        answers.add(new Answer(33, "Приветствовать", questionRepo.getById(25), questionRepo.getById(27)));
        answers.add(new Answer(34, "Уйти", questionRepo.getById(25), questionRepo.getById(26)));
        answers.add(new Answer(35, "Некоторые локации закрыты, как быть?", questionRepo.getById(28), questionRepo.getById(29)));
        answers.add(new Answer(36, "Уйти", questionRepo.getById(28), questionRepo.getById(26)));
        answers.add(new Answer(37, "Мне нужно в " + locationRepo.getById(14).getName(), questionRepo.getById(27), questionRepo.getById(28)));
        answers.add(new Answer(38, "Уйти", questionRepo.getById(27), questionRepo.getById(26)));
        answers.add(new Answer(39, "Спасибо! Буду должен", questionRepo.getById(29), questionRepo.getById(30)));
        answers.add(new Answer(40, "Пока не надо, зайду позже", questionRepo.getById(29), questionRepo.getById(26)));

        answers.add(new Answer(41, "Приветствовать", questionRepo.getById(31), questionRepo.getById(33)));
        answers.add(new Answer(42, "Уйти", questionRepo.getById(31), questionRepo.getById(32)));
        answers.add(new Answer(43, "Некоторые локации закрыты, как быть?", questionRepo.getById(34), questionRepo.getById(35)));
        answers.add(new Answer(44, "Уйти", questionRepo.getById(34), questionRepo.getById(32)));
        answers.add(new Answer(45, "Мне нужно в " + locationRepo.getById(14).getName(), questionRepo.getById(33), questionRepo.getById(34)));
        answers.add(new Answer(46, "Уйти", questionRepo.getById(33), questionRepo.getById(32)));
        answers.add(new Answer(47, "Спасибо! Буду должен", questionRepo.getById(35), questionRepo.getById(36)));
        answers.add(new Answer(48, "Пока не надо, зайду позже", questionRepo.getById(35), questionRepo.getById(32)));

        answers.add(new Answer(49, "Приветствовать", questionRepo.getById(37), questionRepo.getById(39)));
        answers.add(new Answer(50, "Уйти", questionRepo.getById(37), questionRepo.getById(38)));
        answers.add(new Answer(51, "Некоторые локации закрыты, как быть?", questionRepo.getById(40), questionRepo.getById(41)));
        answers.add(new Answer(52, "Уйти", questionRepo.getById(40), questionRepo.getById(38)));
        answers.add(new Answer(53, "Мне нужно в " + locationRepo.getById(14).getName(), questionRepo.getById(39), questionRepo.getById(40)));
        answers.add(new Answer(54, "Уйти", questionRepo.getById(39), questionRepo.getById(38)));
        answers.add(new Answer(55, "Спасибо! Буду должен", questionRepo.getById(41), questionRepo.getById(42)));
        answers.add(new Answer(56, "Пока не надо, зайду позже", questionRepo.getById(41), questionRepo.getById(38)));

        answers.add(new Answer(57, "Приветствовать", questionRepo.getById(43), questionRepo.getById(45)));
        answers.add(new Answer(58, "Уйти", questionRepo.getById(43), questionRepo.getById(44)));
        answers.add(new Answer(59, "Некоторые локации закрыты, как быть?", questionRepo.getById(46), questionRepo.getById(47)));
        answers.add(new Answer(60, "Уйти", questionRepo.getById(46), questionRepo.getById(44)));
        answers.add(new Answer(61, "Мне нужно в " + locationRepo.getById(14).getName(), questionRepo.getById(45), questionRepo.getById(46)));
        answers.add(new Answer(62, "Уйти", questionRepo.getById(45), questionRepo.getById(44)));
        answers.add(new Answer(63, "Спасибо! Буду должен", questionRepo.getById(47), questionRepo.getById(48)));
        answers.add(new Answer(64, "Пока не надо, зайду позже", questionRepo.getById(47), questionRepo.getById(44)));

        answers.add(new Answer(65, "Приветствовать", questionRepo.getById(49), questionRepo.getById(51)));
        answers.add(new Answer(66, "Уйти", questionRepo.getById(49), questionRepo.getById(50)));
        answers.add(new Answer(67, "Некоторые локации закрыты, как быть?", questionRepo.getById(52), questionRepo.getById(53)));
        answers.add(new Answer(68, "Уйти", questionRepo.getById(52), questionRepo.getById(50)));
        answers.add(new Answer(69, "Мне нужно в " + locationRepo.getById(14).getName(), questionRepo.getById(51), questionRepo.getById(52)));
        answers.add(new Answer(70, "Уйти", questionRepo.getById(51), questionRepo.getById(50)));
        answers.add(new Answer(71, "Спасибо! Буду должен", questionRepo.getById(53), questionRepo.getById(54)));
        answers.add(new Answer(72, "Пока не надо, зайду позже", questionRepo.getById(53), questionRepo.getById(50)));
    }
}
