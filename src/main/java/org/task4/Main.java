package org.task4;

public class Main {
    public static void main(String[] args) {

        String login = "Tarasdfsdsfsdfsdfsdfsdfdfgdfgdfgdfg";
        String password = "1234354353453534533545345345345";
        String confirmPassword = "1234354353453534533545345345345";


        try {
            System.out.println(checkData(login, password, confirmPassword));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }

    public static Boolean checkData(String login, String password, String confirmPassword) throws Exception {
        if (login.length() < 20) {
            throw new WrongLoginException();
        }
        if (password.length() > 20 && password.equals(confirmPassword)) {
            return true;
        } else {
            throw new WrongPasswordException();
        }
    }
}
