package com.teachmeskills.hw10.task1.model.util;

import com.teachmeskills.hw10.task1.model.card.BasicCard;

import java.util.Arrays;

/**
 * The class contains a static method that removes duplicate bank cards.
 */
public class CardUtil {

    public static BasicCard[] removeDuplicates(BasicCard[] cards) {
        BasicCard[] result = new BasicCard[cards.length];
        int resultIndex = 0;
        for (BasicCard card : cards) {
            boolean isDuplicate = false;
            for (int j = 0; j < resultIndex; j++) {
                if (card.equals(result[j])) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                result[resultIndex] = card;
                resultIndex++;
            }
        }
        return Arrays.copyOf(result, resultIndex);
    }
}
