package fc;

import java.util.HashMap;
import java.util.Scanner;

public class AddCards {

    String front;
    String back;

    public HashMap<String, String> Add(HashMap<String, String> deck) {

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("front of card (or 'q' to quit): ");
            front = input.next();
            if(front.equals("q")) {
                break;
            }
            System.out.println("back of card: ");
            back = input.next();

            deck.put(front, back);
        }

        input.close();
        return deck;
    }

}
