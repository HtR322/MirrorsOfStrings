package ru.htr;

import ru.htr.kata.TrainingTasks;

public class MainClass {
    public static void main(String[] args) {
        System.out.println(TrainingTasks.oper(TrainingTasks::vertMirror,"QHdgSh\noaMDnH\nXxNNlC\nHxxvRi\nAvVTqb\nuRySvw"));
        System.out.println(TrainingTasks.oper(TrainingTasks::horMirror,"Ordwapth\n" +
                "OrkDwnLy\n" +
                "eitAEBkW\n" +
                "fPcftkbl\n" +
                "yxrgfLvg\n" +
                "fURthgsd\n" +
                "KhwIfwlE\n" +
                "nctLIoxv"));
    }
}
