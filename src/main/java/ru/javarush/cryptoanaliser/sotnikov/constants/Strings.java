package ru.javarush.cryptoanaliser.sotnikov.constants;

public class Strings {
    private static final String rus = "йцукенгшщзхъфывапролджэячсмитьбю";
    private static final String eng = "qwertyuiopasdfghjklzxcvbnm";
    private static final String cyphers = "1234567890";
    private static final String symbols = ",./!@#$%^&*()[]{}";
    public static final String ALPHABET = rus + rus.toUpperCase() + eng + eng.toUpperCase() + cyphers + symbols;
}
