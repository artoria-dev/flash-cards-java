package fc;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        HashMap<String, String> deck = new HashMap<String, String>();

	    AddCards ac = new AddCards();
	    deck = ac.Add(deck);
	    Quiz q = new Quiz();
	    q.Play(deck);
    }
}
