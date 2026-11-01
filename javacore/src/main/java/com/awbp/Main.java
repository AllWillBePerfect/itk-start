package com.awbp;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MyStringBuilder myStringBuilder = new MyStringBuilder();

        myStringBuilder.append("Hello");
        myStringBuilder.append(", ");
        myStringBuilder.append("Java!");

        myStringBuilder.undo();
        myStringBuilder.append("World!");

        System.out.println(myStringBuilder);
    }
}