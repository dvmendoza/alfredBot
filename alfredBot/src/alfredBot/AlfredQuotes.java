package alfredBot;

import java.util.Date;
import java.util.Calendar;

public class AlfredQuotes {
	Date now = new Date();
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        // YOUR CODE HERE
        return String.format("Hello, %s. Lovely to see you.", name);
    }
    
    public String dateAnnouncement() {
        // YOUR CODE HERE
        return "It is currently" + now;
    }
    
    public String respondBeforeAlexis(String conversation) {
        // YOUR CODE HERE
        return "for snarky response return string";
    }
    
	// NINJA BONUS
	// See the specs to overload the guessGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}


