package com.awbp;


import java.util.ArrayList;
import java.util.List;

public class History {

    private final List<Memento> history = new ArrayList<>();
    public void push(Memento m) {
        history.add(m);
    }

    public void undo() {
        if (!history.isEmpty()) {
            history.removeLast();
        }
    }

    public String concatenate() {
        StringBuilder stringBuilder = new StringBuilder();
        for (var memento : history) {
            stringBuilder.append(memento.value());
        }
        return stringBuilder.toString();
    }

}
