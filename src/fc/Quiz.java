package fc;

import java.util.HashMap;
import java.util.Map;

public class Quiz {

    public void Play(HashMap<String, String> deck) {
        for (Map.Entry<String, String> card : deck.entrySet()) {
            System.out.println(card.getKey() + " - " + card.getValue());
        }
    }

}
