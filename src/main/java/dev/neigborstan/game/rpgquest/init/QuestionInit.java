package dev.neigborstan.game.rpgquest.init;

import dev.neigborstan.game.rpgquest.entity.Location;
import dev.neigborstan.game.rpgquest.entity.Question;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

public class QuestionInit {
    @Getter
    private final Map<Integer, Question> questions = new HashMap<>();

    public QuestionInit(Map<Integer, Location> locations) {

        Question question1 = new Question(1, "Приветствую тебя!", Question.Type.CONTINUE);
        Question question2 = new Question(2, "Удачи!", Question.Type.END);
        Question question3 = new Question(3, "Куда направляешься?", Question.Type.CONTINUE);
        Question question4 = new Question(4, "Ясно! Чем могу помочь?", Question.Type.CONTINUE);
        Question question5 = new Question(5, "Помогу решить вопрос с " + locations.get(2).getName(), Question.Type.CONTINUE);
        Question question6 = new Question(6, "Да без проблем, готово!", Question.Type.SUCCESS);

        Question question7 = new Question(7, "Привет!", Question.Type.CONTINUE);
        Question question8 = new Question(8, "На связи!", Question.Type.END);
        Question question9 = new Question(9, "Куда спешишь?", Question.Type.CONTINUE);
        Question question10 = new Question(10, "Не близко! Помощь нужна?", Question.Type.CONTINUE);
        Question question11 = new Question(11, "Разрулю вопрос с " + locations.get(5).getName(), Question.Type.CONTINUE);
        Question question12 = new Question(12, "Не вопрос, сделано!", Question.Type.SUCCESS);

        Question question13 = new Question(13, "Приветствую!", Question.Type.CONTINUE);
        Question question14 = new Question(14, "Счастливо!", Question.Type.END);
        Question question15 = new Question(15, "Куда путь держишь?", Question.Type.CONTINUE);
        Question question16 = new Question(16, "Знаю такой, да. Помочь?", Question.Type.CONTINUE);
        Question question17 = new Question(17, "Договорюсь по " + locations.get(6).getName(), Question.Type.CONTINUE);
        Question question18 = new Question(18, "Все схвачено, вперед!", Question.Type.SUCCESS);

        Question question19 = new Question(19, "Приветствую тебя!", Question.Type.CONTINUE);
        Question question20 = new Question(20, "Удачи!", Question.Type.END);
        Question question21 = new Question(21, "Куда направляешься?", Question.Type.CONTINUE);
        Question question22 = new Question(22, "Ясно! Чем могу помочь?", Question.Type.CONTINUE);
        Question question23 = new Question(23, "Помогу решить вопрос с " + locations.get(10).getName(), Question.Type.CONTINUE);
        Question question24 = new Question(24, "Да без проблем, готово!", Question.Type.SUCCESS);

        Question question25 = new Question(25, "Приветствую тебя!", Question.Type.CONTINUE);
        Question question26 = new Question(26, "Удачи!", Question.Type.END);
        Question question27 = new Question(27, "Куда направляешься?", Question.Type.CONTINUE);
        Question question28 = new Question(28, "Ясно! Чем могу помочь?", Question.Type.CONTINUE);
        Question question29 = new Question(29, "Помогу решить вопрос с " + locations.get(8).getName(), Question.Type.CONTINUE);
        Question question30 = new Question(30, "Да без проблем, готово!", Question.Type.SUCCESS);

        Question question31 = new Question(31, "Приветствую тебя!", Question.Type.CONTINUE);
        Question question32 = new Question(32, "Удачи!", Question.Type.END);
        Question question33 = new Question(33, "Куда направляешься?", Question.Type.CONTINUE);
        Question question34 = new Question(34, "Ясно! Чем могу помочь?", Question.Type.CONTINUE);
        Question question35 = new Question(35, "Помогу решить вопрос с " + locations.get(12).getName(), Question.Type.CONTINUE);
        Question question36 = new Question(36, "Да без проблем, готово!", Question.Type.SUCCESS);

        Question question37 = new Question(37, "Приветствую тебя!", Question.Type.CONTINUE);
        Question question38 = new Question(38, "Удачи!", Question.Type.END);
        Question question39 = new Question(39, "Куда направляешься?", Question.Type.CONTINUE);
        Question question40 = new Question(40, "Ясно! Чем могу помочь?", Question.Type.CONTINUE);
        Question question41 = new Question(41, "Помогу решить вопрос с " + locations.get(13).getName(), Question.Type.CONTINUE);
        Question question42 = new Question(42, "Да без проблем, готово!", Question.Type.SUCCESS);

        Question question43 = new Question(43, "Приветствую тебя!", Question.Type.CONTINUE);
        Question question44 = new Question(44, "Удачи!", Question.Type.END);
        Question question45 = new Question(45, "Куда направляешься?", Question.Type.CONTINUE);
        Question question46 = new Question(46, "Ясно! Чем могу помочь?", Question.Type.CONTINUE);
        Question question47 = new Question(47, "Помогу решить вопрос с " + locations.get(15).getName(), Question.Type.CONTINUE);
        Question question48 = new Question(48, "Да без проблем, готово!", Question.Type.SUCCESS);

        Question question49 = new Question(49, "Приветствую тебя!", Question.Type.CONTINUE);
        Question question50 = new Question(50, "Удачи!", Question.Type.END);
        Question question51 = new Question(51, "Куда направляешься?", Question.Type.CONTINUE);
        Question question52 = new Question(52, "Ясно! Чем могу помочь?", Question.Type.CONTINUE);
        Question question53 = new Question(53, "Помогу решить вопрос с " + locations.get(14).getName(), Question.Type.CONTINUE);
        Question question54 = new Question(54, "Да без проблем, готово!", Question.Type.SUCCESS);

        questions.put(1, question1);
        questions.put(2, question2);
        questions.put(3, question3);
        questions.put(4, question4);
        questions.put(5, question5);
        questions.put(6, question6);

        questions.put(7, question7);
        questions.put(8, question8);
        questions.put(9, question9);
        questions.put(10, question10);
        questions.put(11, question11);
        questions.put(12, question12);

        questions.put(13, question13);
        questions.put(14, question14);
        questions.put(15, question15);
        questions.put(16, question16);
        questions.put(17, question17);
        questions.put(18, question18);

        questions.put(19, question19);
        questions.put(20, question20);
        questions.put(21, question21);
        questions.put(22, question22);
        questions.put(23, question23);
        questions.put(24, question24);

        questions.put(25, question25);
        questions.put(26, question26);
        questions.put(27, question27);
        questions.put(28, question28);
        questions.put(29, question29);
        questions.put(30, question30);

        questions.put(31, question31);
        questions.put(32, question32);
        questions.put(33, question33);
        questions.put(34, question34);
        questions.put(35, question35);
        questions.put(36, question36);

        questions.put(37, question37);
        questions.put(38, question38);
        questions.put(39, question39);
        questions.put(40, question40);
        questions.put(41, question41);
        questions.put(42, question42);

        questions.put(43, question43);
        questions.put(44, question44);
        questions.put(45, question45);
        questions.put(46, question46);
        questions.put(47, question47);
        questions.put(48, question48);

        questions.put(49, question49);
        questions.put(50, question50);
        questions.put(51, question51);
        questions.put(52, question52);
        questions.put(53, question53);
        questions.put(54, question54);
    }
}
