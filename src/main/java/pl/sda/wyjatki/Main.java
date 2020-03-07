package pl.sda.wyjatki;

import pl.sda.wyjatki.exeptions.EmailException;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        User user = new User ();
        user.setLogin ("login");
        try {
            user.setEmail ("adres");
        } catch (EmailException e) {
            e.printStackTrace ( );
        }
    }
}

