package com.teachmeskills.hw10.task1.model.client;

import com.teachmeskills.hw10.task1.model.card.BasicCard;
import com.teachmeskills.hw10.task1.util.CardUtil;

import java.util.Locale;

/**
 * Class Client for type of clients
 * all fields are private
 * contains getters and setters
 * contains a method that counts the number of cards and the number of identical cards.
 */
public class Client {

    private String firstName;
    private String lastName;
    private String passportNumber;
    private BasicCard[] cards;

    public Client(String firstName, String lastName, String passportNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.passportNumber = passportNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase(Locale.ROOT).trim();
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase(Locale.ROOT).trim();
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        if (passportNumber.startsWith("AB")) {
            this.passportNumber = passportNumber;
        } else if (passportNumber.startsWith("BM")) {
            this.passportNumber = passportNumber;
        } else if (passportNumber.startsWith("HB")) {
            this.passportNumber = passportNumber;
        } else if (passportNumber.startsWith("KH")) {
            this.passportNumber = passportNumber;
        } else if (passportNumber.startsWith("MP")) {
            this.passportNumber = passportNumber;
        } else if (passportNumber.startsWith("MC")) {
            this.passportNumber = passportNumber;
        } else if (passportNumber.startsWith("KB")) {
            this.passportNumber = passportNumber;
        } else if (passportNumber.startsWith("PP")) {
            this.passportNumber = passportNumber;
        } else if (passportNumber.startsWith("SP")) {
            this.passportNumber = passportNumber;
        } else if (passportNumber.startsWith("DP")) {
            this.passportNumber = passportNumber;
        } else {
            System.out.println("re-Enter. Incorrect passNumber");
        }
    }

    public BasicCard[] getCards() {
        return cards;
    }

    public void setCards(BasicCard[] cards) {
        this.cards = cards;

    }

    public void countTheNumberOfCards(BasicCard[] cards) {
        BasicCard[] uniqCards = CardUtil.removeDuplicates(cards);

        for (BasicCard uniqCard : uniqCards) {
            int quantity = 0;
            for (BasicCard card : cards) {
                if (uniqCard.equals(card)) {
                    quantity++;
                }
            }

            System.out.println("\nCard: " + uniqCard.getCardNumber() + " occurs " + quantity + " times");
        }

        System.out.println("\nThe number of client cards is " + cards.length);
    }
}

