package com.teachmeskills.hw10.task1.fabric;

import com.teachmeskills.hw10.task1.model.card.BasicCard;
import com.teachmeskills.hw10.task1.model.card.BelCard;
import com.teachmeskills.hw10.task1.model.card.MasterCard;
import com.teachmeskills.hw10.task1.model.card.VisaCard;

/**
 * Class with static method to creat bank cards.
 */
public class CardFabric {

    public static BasicCard[] CreationOfBankCards() {

        BasicCard belCard = new BelCard(756, "1213 1221 1234 5678", 567.8);
        BasicCard masterCard1 = new MasterCard(788, "5678 0987 4343 0987", 788.05);
        BasicCard visaCard1 = new VisaCard(788, "5678 0987 4343 0987", 800);
        BasicCard masterCard2 = new MasterCard(789, "5678 0102 4343 0987", 900);
        BasicCard visaCard2 = new VisaCard(789, "5678 0102 4343 0987", 100.1);

        BasicCard[] cards = new BasicCard[5];
        cards[0] = belCard;
        cards[1] = masterCard1;
        cards[2] = visaCard1;
        cards[3] = masterCard2;
        cards[4] = visaCard2;
        return cards;
    }
}
