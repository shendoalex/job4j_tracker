package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Класс описывает модель банковской системы.
 *
 * @author Aleksei Shendo
 * @version 1.0
 */
public class BankService {
    /**
     * Поле содержит всех пользователей системы, с их счетами
     */
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод добавляет нового пользователя в систему
     * Если пользователь уже существует - добавление не происходит
     *
     * @param user - пользователь user будет добавлени в Map users
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    /**
     * Метод удаляет пользователя из системы
     *
     * @param passport - уникальный параметр на основании которого происходит удаление
     * @return - если пользователь найден и удален - true, иначе - false
     */
    public boolean deleteUser(String passport) {
        return users.remove(new User(passport, "")) != null;
    }

    /**
     * Метод добавляет новый банковский счет к пользователю
     *
     * @param passport - уникальный идентификатор паспорта пользователя
     * @param account  - добавляемый банковский счет
     */
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> accounts = users.get(user);
            if (!accounts.contains(account)) {
                accounts.add(account);
            }
        }
    }

    /**
     * Метод ищет пользователя по номеру паспорта
     *
     * @param passport - уникальный идентификатор паспорта пользователя
     * @return - возвращает пользователя user класса User
     */
    public User findByPassport(String passport) {
        User foundUser = null;
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                foundUser = user;
                break;
            }
        }
        return foundUser;
    }

    /**
     * Метод ищет банковский счет по паспорту и реквизитам
     *
     * @param passport  - уникальный идентификатор паспорта пользователя
     * @param requisite - реквизиты счета
     * @return - возвращает обьект найденного счета класса Account
     */
    public Account findByRequisite(String passport, String requisite) {
        Account resultAccount = null;
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> accounts = users.get(user);
            for (Account account : accounts) {
                if (account.getRequisite().equals(requisite)) {
                    resultAccount = account;
                    break;
                }
            }
        }
        return resultAccount;
    }

    /**
     * Метод переводит деньги с обного счет на другой
     *
     * @param srcPassport   - паспорт отправителя
     * @param srcRequisite  - реквизиты отправителя
     * @param destPassport  - паспорт получателя
     * @param destRequisite - реквизиты получателя
     * @param amount        - сумма к переводу
     * @return - результат операции (true - если перечисление успешно, иначе - false)
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account accountFrom = findByRequisite(srcPassport, srcRequisite);
        Account accountTo = findByRequisite(destPassport, destRequisite);
        if (accountFrom != null && accountTo != null && accountFrom.getBalance() >= amount) {
            accountFrom.setBalance(accountFrom.getBalance() - amount);
            accountTo.setBalance(accountTo.getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }

    /**
     * Метод для получения всех банковских счетов конкретного клиента
     *
     * @param user - клиент
     * @return - возвращает список со всеми счетами клиента
     */
    public List<Account> getAccounts(User user) {
        return users.get(user);
    }
}