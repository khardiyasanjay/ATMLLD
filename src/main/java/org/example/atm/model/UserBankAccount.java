package org.example.atm.model;

public class UserBankAccount {
    public int balance;

    public void withdrawalBalance(int amount) {
        balance = balance - amount;
    }

}
