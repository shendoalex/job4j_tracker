package ru.job4j.oop;

public class Error {

    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("Активна: " + active);
        System.out.println("Статус: " + status);
        System.out.println("Сообщение: " + message);
    }

    public static void main(String[] args) {
        Error error0 = new Error();
        Error error1 = new Error(true, 1, "Message 1");
        Error error2 = new Error(false, 2, "Message 2");
        Error error3 = new Error(true, 3, "Message 3");
        error0.printInfo();
        error1.printInfo();
        error2.printInfo();
        error3.printInfo();
    }
}
