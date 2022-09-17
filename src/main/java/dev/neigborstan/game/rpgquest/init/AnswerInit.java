package dev.neigborstan.game.rpgquest.init;

import dev.neigborstan.game.rpgquest.entity.Answer;
import dev.neigborstan.game.rpgquest.entity.Location;
import dev.neigborstan.game.rpgquest.entity.Question;
import lombok.Getter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AnswerInit {
    private final Map<Integer, Answer> answers = new HashMap<>();

    public AnswerInit(LocationInit locationInit, QuestionInit questionInit) {

        Answer answer1 = new Answer(1, "Приветствовать", questionInit.getQuestionById(1), questionInit.getQuestionById(3));
        Answer answer2 = new Answer(2, "Уйти", questionInit.getQuestionById(1), questionInit.getQuestionById(2));
        Answer answer3 = new Answer(3, "Некоторые локации закрыты, как быть?", questionInit.getQuestionById(4), questionInit.getQuestionById(5));
        Answer answer4 = new Answer(4, "Уйти", questionInit.getQuestionById(4), questionInit.getQuestionById(2));
        Answer answer5 = new Answer(5, "Мне нужно в " + locationInit.getLocationById(14).getName(), questionInit.getQuestionById(3), questionInit.getQuestionById(4));
        Answer answer6 = new Answer(6, "Уйти", questionInit.getQuestionById(3), questionInit.getQuestionById(2));
        Answer answer7 = new Answer(7, "Спасибо! Буду должен", questionInit.getQuestionById(5), questionInit.getQuestionById(6));
        Answer answer8 = new Answer(8, "Пока не надо, зайду позже", questionInit.getQuestionById(5), questionInit.getQuestionById(2));

        Answer answer9 = new Answer(9, "Приветствовать", questionInit.getQuestionById(7), questionInit.getQuestionById(9));
        Answer answer10 = new Answer(10, "Уйти", questionInit.getQuestionById(7), questionInit.getQuestionById(8));
        Answer answer11 = new Answer(11, "Некоторые локации закрыты, как быть?", questionInit.getQuestionById(10), questionInit.getQuestionById(11));
        Answer answer12 = new Answer(12, "Уйти", questionInit.getQuestionById(10), questionInit.getQuestionById(8));
        Answer answer13 = new Answer(13, "Мне нужно в " + locationInit.getLocationById(14).getName(), questionInit.getQuestionById(9), questionInit.getQuestionById(10));
        Answer answer14 = new Answer(14, "Уйти", questionInit.getQuestionById(9), questionInit.getQuestionById(8));
        Answer answer15 = new Answer(15, "Спасибо! Буду должен", questionInit.getQuestionById(11), questionInit.getQuestionById(12));
        Answer answer16 = new Answer(16, "Пока не надо, зайду позже", questionInit.getQuestionById(11), questionInit.getQuestionById(8));

        Answer answer17 = new Answer(17, "Приветствовать", questionInit.getQuestionById(13), questionInit.getQuestionById(15));
        Answer answer18 = new Answer(18, "Уйти", questionInit.getQuestionById(13), questionInit.getQuestionById(14));
        Answer answer19 = new Answer(19, "Некоторые локации закрыты, как быть?", questionInit.getQuestionById(16), questionInit.getQuestionById(17));
        Answer answer20 = new Answer(20, "Уйти", questionInit.getQuestionById(16), questionInit.getQuestionById(14));
        Answer answer21 = new Answer(21, "Мне нужно в " + locationInit.getLocationById(14).getName(), questionInit.getQuestionById(15), questionInit.getQuestionById(16));
        Answer answer22 = new Answer(22, "Уйти", questionInit.getQuestionById(15), questionInit.getQuestionById(14));
        Answer answer23 = new Answer(23, "Спасибо! Буду должен", questionInit.getQuestionById(17), questionInit.getQuestionById(18));
        Answer answer24 = new Answer(24, "Пока не надо, зайду позже", questionInit.getQuestionById(17), questionInit.getQuestionById(14));

        Answer answer25 = new Answer(25, "Приветствовать", questionInit.getQuestionById(19), questionInit.getQuestionById(21));
        Answer answer26 = new Answer(26, "Уйти", questionInit.getQuestionById(19), questionInit.getQuestionById(20));
        Answer answer27 = new Answer(27, "Некоторые локации закрыты, как быть?", questionInit.getQuestionById(22), questionInit.getQuestionById(23));
        Answer answer28 = new Answer(28, "Уйти", questionInit.getQuestionById(22), questionInit.getQuestionById(20));
        Answer answer29 = new Answer(29, "Мне нужно в " + locationInit.getLocationById(14).getName(), questionInit.getQuestionById(21), questionInit.getQuestionById(22));
        Answer answer30 = new Answer(30, "Уйти", questionInit.getQuestionById(21), questionInit.getQuestionById(20));
        Answer answer31 = new Answer(31, "Спасибо! Буду должен", questionInit.getQuestionById(23), questionInit.getQuestionById(24));
        Answer answer32 = new Answer(32, "Пока не надо, зайду позже", questionInit.getQuestionById(23), questionInit.getQuestionById(20));

        Answer answer33 = new Answer(33, "Приветствовать", questionInit.getQuestionById(25), questionInit.getQuestionById(27));
        Answer answer34 = new Answer(34, "Уйти", questionInit.getQuestionById(25), questionInit.getQuestionById(26));
        Answer answer35 = new Answer(35, "Некоторые локации закрыты, как быть?", questionInit.getQuestionById(28), questionInit.getQuestionById(29));
        Answer answer36 = new Answer(36, "Уйти", questionInit.getQuestionById(28), questionInit.getQuestionById(26));
        Answer answer37 = new Answer(37, "Мне нужно в " + locationInit.getLocationById(14).getName(), questionInit.getQuestionById(27), questionInit.getQuestionById(28));
        Answer answer38 = new Answer(38, "Уйти", questionInit.getQuestionById(27), questionInit.getQuestionById(26));
        Answer answer39 = new Answer(39, "Спасибо! Буду должен", questionInit.getQuestionById(29), questionInit.getQuestionById(30));
        Answer answer40 = new Answer(40, "Пока не надо, зайду позже", questionInit.getQuestionById(29), questionInit.getQuestionById(26));

        Answer answer41 = new Answer(41, "Приветствовать", questionInit.getQuestionById(31), questionInit.getQuestionById(33));
        Answer answer42 = new Answer(42, "Уйти", questionInit.getQuestionById(31), questionInit.getQuestionById(32));
        Answer answer43 = new Answer(43, "Некоторые локации закрыты, как быть?", questionInit.getQuestionById(34), questionInit.getQuestionById(35));
        Answer answer44 = new Answer(44, "Уйти", questionInit.getQuestionById(34), questionInit.getQuestionById(32));
        Answer answer45 = new Answer(45, "Мне нужно в " + locationInit.getLocationById(14).getName(), questionInit.getQuestionById(33), questionInit.getQuestionById(34));
        Answer answer46 = new Answer(46, "Уйти", questionInit.getQuestionById(33), questionInit.getQuestionById(32));
        Answer answer47 = new Answer(47, "Спасибо! Буду должен", questionInit.getQuestionById(35), questionInit.getQuestionById(36));
        Answer answer48 = new Answer(48, "Пока не надо, зайду позже", questionInit.getQuestionById(35), questionInit.getQuestionById(32));

        Answer answer49 = new Answer(49, "Приветствовать", questionInit.getQuestionById(37), questionInit.getQuestionById(39));
        Answer answer50 = new Answer(50, "Уйти", questionInit.getQuestionById(37), questionInit.getQuestionById(38));
        Answer answer51 = new Answer(51, "Некоторые локации закрыты, как быть?", questionInit.getQuestionById(40), questionInit.getQuestionById(41));
        Answer answer52 = new Answer(52, "Уйти", questionInit.getQuestionById(40), questionInit.getQuestionById(38));
        Answer answer53 = new Answer(53, "Мне нужно в " + locationInit.getLocationById(14).getName(), questionInit.getQuestionById(39), questionInit.getQuestionById(40));
        Answer answer54 = new Answer(54, "Уйти", questionInit.getQuestionById(39), questionInit.getQuestionById(38));
        Answer answer55 = new Answer(55, "Спасибо! Буду должен", questionInit.getQuestionById(41), questionInit.getQuestionById(42));
        Answer answer56 = new Answer(56, "Пока не надо, зайду позже", questionInit.getQuestionById(41), questionInit.getQuestionById(38));

        Answer answer57 = new Answer(57, "Приветствовать", questionInit.getQuestionById(43), questionInit.getQuestionById(45));
        Answer answer58 = new Answer(58, "Уйти", questionInit.getQuestionById(43), questionInit.getQuestionById(44));
        Answer answer59 = new Answer(59, "Некоторые локации закрыты, как быть?", questionInit.getQuestionById(46), questionInit.getQuestionById(47));
        Answer answer60 = new Answer(60, "Уйти", questionInit.getQuestionById(46), questionInit.getQuestionById(44));
        Answer answer61 = new Answer(61, "Мне нужно в " + locationInit.getLocationById(14).getName(), questionInit.getQuestionById(45), questionInit.getQuestionById(46));
        Answer answer62 = new Answer(62, "Уйти", questionInit.getQuestionById(45), questionInit.getQuestionById(44));
        Answer answer63 = new Answer(63, "Спасибо! Буду должен", questionInit.getQuestionById(47), questionInit.getQuestionById(48));
        Answer answer64 = new Answer(64, "Пока не надо, зайду позже", questionInit.getQuestionById(47), questionInit.getQuestionById(44));

        Answer answer65 = new Answer(65, "Приветствовать", questionInit.getQuestionById(49), questionInit.getQuestionById(51));
        Answer answer66 = new Answer(66, "Уйти", questionInit.getQuestionById(49), questionInit.getQuestionById(50));
        Answer answer67 = new Answer(67, "Некоторые локации закрыты, как быть?", questionInit.getQuestionById(52), questionInit.getQuestionById(53));
        Answer answer68 = new Answer(68, "Уйти", questionInit.getQuestionById(52), questionInit.getQuestionById(50));
        Answer answer69 = new Answer(69, "Мне нужно в " + locationInit.getLocationById(14).getName(), questionInit.getQuestionById(51), questionInit.getQuestionById(52));
        Answer answer70 = new Answer(70, "Уйти", questionInit.getQuestionById(51), questionInit.getQuestionById(50));
        Answer answer71 = new Answer(71, "Спасибо! Буду должен", questionInit.getQuestionById(53), questionInit.getQuestionById(54));
        Answer answer72 = new Answer(72, "Пока не надо, зайду позже", questionInit.getQuestionById(53), questionInit.getQuestionById(50));

        answers.put(1, answer1);
        answers.put(2, answer2);
        answers.put(3, answer3);
        answers.put(4, answer4);
        answers.put(5, answer5);
        answers.put(6, answer6);
        answers.put(7, answer7);
        answers.put(8, answer8);

        answers.put(9, answer9);
        answers.put(10, answer10);
        answers.put(11, answer11);
        answers.put(12, answer12);
        answers.put(13, answer13);
        answers.put(14, answer14);
        answers.put(15, answer15);
        answers.put(16, answer16);

        answers.put(17, answer17);
        answers.put(18, answer18);
        answers.put(19, answer19);
        answers.put(20, answer20);
        answers.put(21, answer21);
        answers.put(22, answer22);
        answers.put(23, answer23);
        answers.put(24, answer24);

        answers.put(25, answer25);
        answers.put(26, answer26);
        answers.put(27, answer27);
        answers.put(28, answer28);
        answers.put(29, answer29);
        answers.put(30, answer30);
        answers.put(31, answer31);
        answers.put(32, answer32);

        answers.put(33, answer33);
        answers.put(34, answer34);
        answers.put(35, answer35);
        answers.put(36, answer36);
        answers.put(37, answer37);
        answers.put(38, answer38);
        answers.put(39, answer39);
        answers.put(40, answer40);

        answers.put(41, answer41);
        answers.put(42, answer42);
        answers.put(43, answer43);
        answers.put(44, answer44);
        answers.put(45, answer45);
        answers.put(46, answer46);
        answers.put(47, answer47);
        answers.put(48, answer48);

        answers.put(49, answer49);
        answers.put(50, answer50);
        answers.put(51, answer51);
        answers.put(52, answer52);
        answers.put(53, answer53);
        answers.put(54, answer54);
        answers.put(55, answer55);
        answers.put(56, answer56);

        answers.put(57, answer57);
        answers.put(58, answer58);
        answers.put(59, answer59);
        answers.put(60, answer60);
        answers.put(61, answer61);
        answers.put(62, answer62);
        answers.put(63, answer63);
        answers.put(64, answer64);

        answers.put(65, answer65);
        answers.put(66, answer66);
        answers.put(67, answer67);
        answers.put(68, answer68);
        answers.put(69, answer69);
        answers.put(70, answer70);
        answers.put(71, answer71);
        answers.put(72, answer72);
    }

    public List<Answer> getAnswersByQuestionId(int questionId) {
        return answers.values().stream()
                .filter(v -> v.getPrev().getId() == questionId)
                .collect(Collectors.toList());
    }

    public Answer getAnswerById(int id) {
        return answers.get(id);
    }
}
