package com.teachmeskills.hw10.task1.model.card;

/**
 * The class is a descendant of the class BasicCard
 * the class MasterCard cannot be extended from.
 */
public final class MasterCard extends BasicCard {
    public MasterCard(int cvv, String cardNumber, double amount) {
        super(cvv, cardNumber, amount);
    }
}
