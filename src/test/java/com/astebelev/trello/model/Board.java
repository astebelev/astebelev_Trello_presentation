package com.astebelev.trello.model;

public class Board {
    private String boardName;
    private String visibility;





    public String getBoardName() {
        return boardName;
    }

    public String getVisibility() {
        return visibility;
    }

    public Board setBoardName(String boardName) {
        this.boardName = boardName;
        return this;
    }

    public Board setVisibility(String visibility) {
        this.visibility = visibility;
        return this;
    }

    @Override
    public String toString() {
        return "Board{" +
                "boardName='" + boardName + '\'' +
                ", visibility='" + visibility + '\'' +
                '}';
    }
}
