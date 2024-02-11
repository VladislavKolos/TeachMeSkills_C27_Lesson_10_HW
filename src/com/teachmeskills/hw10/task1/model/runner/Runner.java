package com.teachmeskills.hw10.task1.model.runner;

import com.teachmeskills.hw10.task1.model.client.Client;
import com.teachmeskills.hw10.task1.model.fabric.CardFabric;

/**
 * Class with method main to run the program
 * contains one class object
 * method is called in this class.
 */
public class Runner {
    public static void main(String[] args) {

        Client client = new Client("Vladislav", "Kolos", "PD1234567");

        client.countTheNumberOfCards(CardFabric.CreationOfBankCards());
    }
}
