package dev.neigborstan.game.rpgquest.repository;


import dev.neigborstan.game.rpgquest.init.*;
import lombok.Getter;


public class Repository {
    private static Repository INSTANCE;

    private int userId = 0;
    private final LocationInit locationInit;
    private final QuestionInit questionInit;
    private final LocationKeyInit locationKeyInit;
    @Getter
    private final AnswerInit answerInit;
    @Getter
    private final PersonInit personInit;
    @Getter
    private UserInit userInit;

    private Repository() {
        userInit = new UserInit();
        locationInit = new LocationInit();
        locationKeyInit = new LocationKeyInit(locationInit);
        questionInit = new QuestionInit(locationInit);
        answerInit = new AnswerInit(locationInit, questionInit);
        personInit = new PersonInit(locationInit, questionInit, locationKeyInit);

    }

    public static Repository getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Repository();
        }

        return INSTANCE;
    }
}
