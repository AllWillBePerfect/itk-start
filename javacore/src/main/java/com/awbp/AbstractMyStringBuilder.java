package com.awbp;

abstract class AbstractMyStringBuilder {

    private final History history = new History() ;


    public AbstractMyStringBuilder append(String str) {
        history.push(new Memento(str));
        return this;
    }

    public AbstractMyStringBuilder append(char c) {
        history.push(new Memento(String.valueOf(c)));
        return this;
    }

    public AbstractMyStringBuilder undo() {
        history.undo();
        return this;
    }

    @Override
    public String toString() {
        return history.concatenate();
    }
}
