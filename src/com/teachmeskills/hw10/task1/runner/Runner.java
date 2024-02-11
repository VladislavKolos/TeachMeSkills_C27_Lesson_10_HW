package com.teachmeskills.hw10.task1.runner;

import com.teachmeskills.hw10.task1.fabric.CardFabric;
import com.teachmeskills.hw10.task1.model.client.Client;

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
