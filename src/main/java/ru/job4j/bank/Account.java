package ru.job4j.bank;

import java.util.Objects;

/**
 * Класс описывает модель банковского счета.
 *
 * @author Aleksei Shendo
 * @version 1.0
 */
public class Account {
    private String requisite;
    private double balance;

    /**
     * Канонический параметризованный конструктор
     *
     * @param requisite - реквизиты
     * @param balance   - баланс
     */
    public Account(String requisite, double balance) {
        this.requisite = requisite;
        this.balance = balance;
    }

    /**
     * Метод геттер для реквизита
     *
     * @return - возвращает значение поля requisite
     */
    public String getRequisite() {
        return requisite;
    }

    /**
     * Метод сеттер для реквизита
     *
     * @param requisite - устанавливает значение поля requisite
     */
    public void setRequisite(String requisite) {
        this.requisite = requisite;
    }

    /**
     * Метод геттер для баланса
     *
     * @return - возвращает значение поля balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Метод сеттер для баланса
     *
     * @param balance - устанавливает значение поля balance
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Типовое переопределение метода equals
     *
     * @param o - объект с которым идет сравнение
     * @return - возвращает результат сравнения только по полю requisite
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Account account = (Account) o;
        return Objects.equals(requisite, account.requisite);
    }

    /**
     * Типовое переопределение метода hashcode
     *
     * @return - возвращает результат сравнения только по полю requisite
     */
    @Override
    public int hashCode() {
        return Objects.hash(requisite);
    }
}