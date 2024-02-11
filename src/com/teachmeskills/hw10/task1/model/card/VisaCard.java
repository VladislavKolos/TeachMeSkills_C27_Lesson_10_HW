package com.teachmeskills.hw10.task1.model.card;

/**
 * The class is a descendant of the class BasicCard
 * the class VisaCard cannot be extended from.
 */
public final class VisaCard extends BasicCard {
    public VisaCard(int cvv, String cardNumber, double amount) {
        super(cvv, cardNumber, amount);
    }
}
