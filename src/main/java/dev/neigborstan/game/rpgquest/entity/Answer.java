package dev.neigborstan.game.rpgquest.entity;

import lombok.Getter;

public class Answer {
    @Getter
    private int id;
    @Getter
    private String text;
    @Getter
    private Question prev;
    @Getter
    private Question next;

    public Answer(int id, String text, Question prev, Question next) {
        this.id = id;
        this.text = text;
        this.prev = prev;
        this.next = next;
    }
}
