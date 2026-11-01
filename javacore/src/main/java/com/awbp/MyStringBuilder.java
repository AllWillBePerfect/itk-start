package com.awbp;

public final class MyStringBuilder extends AbstractMyStringBuilder {

    public MyStringBuilder append(String str) {
         super.append(str);
         return this;
    }

    public MyStringBuilder append(char c) {
        super.append(c);
        return this;
    }

    public MyStringBuilder undo() {
        super.undo();
        return this;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
