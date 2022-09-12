package dev.neigborstan.game.rpgquest.entity;

import lombok.Getter;

public class Question {
    @Getter
    private int id;
    @Getter
    private String text;
    @Getter
    private Type type;

    public Question(int id, String text, Type type) {
        this.id = id;
        this.text = text;
        this.type = type;
    }

    public enum Type{
        CONTINUE,
        END,
        SUCCESS
    }
}
