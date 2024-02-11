package com.teachmeskills.hw10.task1.model.card;

import java.util.Objects;

/**
 * Abstract parent class for type of cards from which only three classes are inherited (BelCard, MasterCard, VisaCard).
 */
public abstract sealed class BasicCard permits BelCard, MasterCard, VisaCard {

    private int cvv;
    private String cardNumber;
    private double amount;

    public BasicCard(int cvv, String cardNumber, double amount) {
        this.cvv = cvv;
        this.cardNumber = cardNumber;
        this.amount = amount;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        if (cvv > 999 || cvv < 100) {
            System.out.println("Incorrect CVV-code. re-Enter");
        } else {
            this.cvv = cvv;
        }
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BasicCard basicCard)) return false;
        return cvv == basicCard.cvv && Objects.equals(cardNumber, basicCard.cardNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cvv, cardNumber);
    }
}
