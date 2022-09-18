package dev.neigborstan.game.rpgquest.init;

import dev.neigborstan.game.rpgquest.entity.Question;

import java.util.HashMap;
import java.util.Map;

public class QuestionInit {
    private final Map<Integer, Question> questions = new HashMap<>();

    public QuestionInit(LocationInit locationInit) {

        questions.put(1, new Question(1, "Приветствую тебя!", Question.Type.CONTINUE));
        questions.put(2, new Question(2, "Удачи!", Question.Type.END));
        questions.put(3, new Question(3, "Куда направляешься?", Question.Type.CONTINUE));
        questions.put(4, new Question(4, "Ясно! Чем могу помочь?", Question.Type.CONTINUE));
        questions.put(5, new Question(5, "Помогу решить вопрос с " + locationInit.getLocationById(2).getName(), Question.Type.CONTINUE));
        questions.put(6, new Question(6, "Да без проблем, готово!", Question.Type.SUCCESS));
        questions.put(7, new Question(7, "Привет!", Question.Type.CONTINUE));
        questions.put(8, new Question(8, "На связи!", Question.Type.END));
        questions.put(9, new Question(9, "Куда спешишь?", Question.Type.CONTINUE));
        questions.put(10, new Question(10, "Не близко! Помощь нужна?", Question.Type.CONTINUE));
        questions.put(11, new Question(11, "Разрулю вопрос с " + locationInit.getLocationById(5).getName(), Question.Type.CONTINUE));
        questions.put(12, new Question(12, "Не вопрос, сделано!", Question.Type.SUCCESS));
        questions.put(13, new Question(13, "Приветствую!", Question.Type.CONTINUE));
        questions.put(14, new Question(14, "Счастливо!", Question.Type.END));
        questions.put(15, new Question(15, "Куда путь держишь?", Question.Type.CONTINUE));
        questions.put(16, new Question(16, "Знаю такой, да. Помочь?", Question.Type.CONTINUE));
        questions.put(17, new Question(17, "Договорюсь по " + locationInit.getLocationById(6).getName(), Question.Type.CONTINUE));
        questions.put(18, new Question(18, "Все схвачено, вперед!", Question.Type.SUCCESS));
        questions.put(19, new Question(19, "Приветствую тебя!", Question.Type.CONTINUE));
        questions.put(20, new Question(20, "Удачи!", Question.Type.END));
        questions.put(21, new Question(21, "Куда направляешься?", Question.Type.CONTINUE));
        questions.put(22, new Question(22, "Ясно! Чем могу помочь?", Question.Type.CONTINUE));
        questions.put(23, new Question(23, "Помогу решить вопрос с " + locationInit.getLocationById(10).getName(), Question.Type.CONTINUE));
        questions.put(24, new Question(24, "Да без проблем, готово!", Question.Type.SUCCESS));
        questions.put(25, new Question(25, "Приветствую тебя!", Question.Type.CONTINUE));
        questions.put(26, new Question(26, "Удачи!", Question.Type.END));
        questions.put(27, new Question(27, "Куда направляешься?", Question.Type.CONTINUE));
        questions.put(28, new Question(28, "Ясно! Чем могу помочь?", Question.Type.CONTINUE));
        questions.put(29, new Question(29, "Помогу решить вопрос с " + locationInit.getLocationById(8).getName(), Question.Type.CONTINUE));
        questions.put(30, new Question(30, "Да без проблем, готово!", Question.Type.SUCCESS));
        questions.put(31, new Question(31, "Приветствую тебя!", Question.Type.CONTINUE));
        questions.put(32, new Question(32, "Удачи!", Question.Type.END));
        questions.put(33, new Question(33, "Куда направляешься?", Question.Type.CONTINUE));
        questions.put(34, new Question(34, "Ясно! Чем могу помочь?", Question.Type.CONTINUE));
        questions.put(35, new Question(35, "Помогу решить вопрос с " + locationInit.getLocationById(12).getName(), Question.Type.CONTINUE));
        questions.put(36, new Question(36, "Да без проблем, готово!", Question.Type.SUCCESS));
        questions.put(37, new Question(37, "Приветствую тебя!", Question.Type.CONTINUE));
        questions.put(38, new Question(38, "Удачи!", Question.Type.END));
        questions.put(39, new Question(39, "Куда направляешься?", Question.Type.CONTINUE));
        questions.put(40, new Question(40, "Ясно! Чем могу помочь?", Question.Type.CONTINUE));
        questions.put(41, new Question(41, "Помогу решить вопрос с " + locationInit.getLocationById(13).getName(), Question.Type.CONTINUE));
        questions.put(42, new Question(42, "Да без проблем, готово!", Question.Type.SUCCESS));
        questions.put(43, new Question(43, "Приветствую тебя!", Question.Type.CONTINUE));
        questions.put(44, new Question(44, "Удачи!", Question.Type.END));
        questions.put(45, new Question(45, "Куда направляешься?", Question.Type.CONTINUE));
        questions.put(46, new Question(46, "Ясно! Чем могу помочь?", Question.Type.CONTINUE));
        questions.put(47, new Question(47, "Помогу решить вопрос с " + locationInit.getLocationById(15).getName(), Question.Type.CONTINUE));
        questions.put(48, new Question(48, "Да без проблем, готово!", Question.Type.SUCCESS));
        questions.put(49, new Question(49, "Приветствую тебя!", Question.Type.CONTINUE));
        questions.put(50, new Question(50, "Удачи!", Question.Type.END));
        questions.put(51, new Question(51, "Куда направляешься?", Question.Type.CONTINUE));
        questions.put(52, new Question(52, "Ясно! Чем могу помочь?", Question.Type.CONTINUE));
        questions.put(53, new Question(53, "Помогу решить вопрос с " + locationInit.getLocationById(14).getName(), Question.Type.CONTINUE));
        questions.put(54, new Question(54, "Да без проблем, готово!", Question.Type.SUCCESS));
    }

    public Question getQuestionById(int questionId) {
        return questions.get(questionId);
    }
}
