package org.example.atm.model;

public class User {
    public Card card;
    UserBankAccount bankAccount;

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

}
