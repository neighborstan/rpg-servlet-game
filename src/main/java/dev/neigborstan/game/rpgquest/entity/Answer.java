package dev.neigborstan.game.rpgquest.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Answer {
    private int id;
    private String text;
    private Question prev;
    private Question next;
}
