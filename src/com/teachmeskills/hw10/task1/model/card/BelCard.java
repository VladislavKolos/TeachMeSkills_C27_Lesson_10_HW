package com.teachmeskills.hw10.task1.model.card;

/**
 * The class is a descendant of the class BasicCard
 * the class BelCard cannot be extended from.
 */
public final class BelCard extends BasicCard {
    public BelCard(int cvv, String cardNumber, double amount) {
        super(cvv, cardNumber, amount);
    }
}
