package com.simplekey.alpinespringbootdemo.dto;

public class Todo {

    private String text;
    private boolean done;

    // 생성자
    public Todo (String text, boolean done) {
        this.text = text;
        this.done = done;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}
