package dev.neigborstan.game.rpgquest.repository;

import dev.neigborstan.game.rpgquest.entity.Answer;
import dev.neigborstan.game.rpgquest.entity.Question;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class AnswerRepoTest {

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4, 5})
    void getAnswersByQuestionId(int questionId) {
        List<Answer> answers = new ArrayList<>();

        IntStream.rangeClosed(1, 5)
                .forEach((num) -> answers.add(new Answer(
                        num, "text" + num, new Question(
                        num, "text" + num, Question.Type.CONTINUE), Mockito.mock(Question.class)))
                );

        AnswerRepo answerRepo = new AnswerRepo();
        for (Answer answer : answers) {
            answerRepo.save(answer.getId(), answer);
        }

        List<Answer> expected = answers.stream()
                .filter(v -> v.getPrev().getId() == questionId)
                .toList();

        List<Answer> actual = answerRepo.getAnswersByQuestionId(questionId);

        assertEquals(expected, actual);
    }
}