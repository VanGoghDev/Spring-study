package ru.firsov;

public enum Command {
    //какие товары купил клиент
    CLIENTS_GOODS("/clgood"),

    //какие клиенты купили определенный товар
    GOODS_BY_CL("/goodcl"),

    //Удалить клиента
    DELETE_CL("/delcl"),

    //Удалить товар
    DELETE_GOOD("/delgl");


    public String getText() {
        return text;
    }

    private String text;

    Command(String s) {
        text = s;
    }
}
