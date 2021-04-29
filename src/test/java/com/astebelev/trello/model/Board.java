package com.astebelev.trello.model;

public class Board {
    private String boardName;
    private String visibility;

    public Board(String boardName, String visibility) {
        this.boardName = boardName;
        this.visibility = visibility;
    }

    public String getBoardName() {
        return boardName;
    }

    public String getVisibility() {
        return visibility;
    }
}
