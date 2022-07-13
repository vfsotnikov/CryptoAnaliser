package ru.javarush.cryptoanaliser.sotnikov;

import ru.javarush.cryptoanaliser.sotnikov.app.Application;
import ru.javarush.cryptoanaliser.sotnikov.controller.MainController;

public class Runner {
    public static void main(String[] args) {
        MainController mainController = new MainController();
        Application application = new Application(mainController);
        Result result = application.run(args);
        System.out.println(result);
    }
}
