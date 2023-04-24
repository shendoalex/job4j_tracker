package ru.job4j.bank;

import java.util.Objects;

/**
 * Класс описывает модель данных клиента банка
 *
 * @author Aleksei Shendo
 * @version 1.0
 */
public class User {
    private String passport;
    private String username;

    /**
     * Параметризованный конструктор
     *
     * @param passport - номер паспорта
     * @param username - имя клиента
     */
    public User(String passport, String username) {
        this.passport = passport;
        this.username = username;
    }

    /**
     * Метод геттер для номера паспорта
     *
     * @return - возвращает номер паспорта клиента
     */
    public String getPassport() {
        return passport;
    }

    /**
     * Метод сеттер для номер паспорта
     *
     * @param passport - устанавливает номер паспорта в значение поля passport
     */
    public void setPassport(String passport) {
        this.passport = passport;
    }

    /**
     * Метод геттер для имени клиента
     *
     * @return - возвращает имя клиента
     */
    public String getUsername() {
        return username;
    }

    /**
     * Метод сеттер для имени клиента
     *
     * @param username - устанавливает имя клиента в значение поля username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Типовое переопределение метода equals
     *
     * @param o - объект с которым идет сравнение
     * @return - возвращает результат сравнения только по полю passport
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(passport, user.passport);
    }

    /**
     * Типовое переопределение метода hashcode
     *
     * @return - возвращает результат сравнения только по полю passport
     */
    @Override
    public int hashCode() {
        return Objects.hash(passport);
    }
}