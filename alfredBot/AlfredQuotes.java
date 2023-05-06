import java.util.Date;
import java.text.SimpleDateFormat;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        // YOUR CODE HERE
        return "Hello, " + name + ". Lovely to see you.";
    }
    
    public String dateAnnouncement() {
        // YOUR CODE HERE
        Date date = new Date();
        return "It is currently " + date;
    }
    
    public String respondBeforeAlexis(String conversation) {
        // YOUR CODE HERE
        int a = conversation.indexOf("Alexis"); 
        int b = conversation.indexOf("Alfred"); 

        if (a >= 0){
            return "Right away, sir. She certainly isn't sophisticated enough for that." ;
        } else if (b >= 0) {
            return "At your service. As you wish, naturally";
        } else {
            return "Right. And with that I shall retire";
        }
    }
    
	// NINJA BONUS
	// See the specs to overload the guestGreeting method
    public String guestGreeting(String name, String dayPeriod) {
        // YOUR CODE HERE
        return "Good " + dayPeriod + ", " +  name + ". Lovely to see you.";
    }

        // SENSEI BONUS
        // Write your own AlfredQuote method using any of the String methods you have learned!

    public String guestGreeting(String name, boolean angry) {
        // YOUR CODE HERE
        System.out.println(angry);
        SimpleDateFormat simpleFormat = new SimpleDateFormat("HH");
        // int hour = Integer.parseInt(simpleFormat.format(new Date()));
        int hour = 19;

        if (hour >= 17) {
            return "Good evening, " +  name + ". Lovely to see you.";
        } else if (hour >= 12) {
            return "Good afternoon, " +  name + ". Lovely to see you.";
        } else if (hour >= 5) {
            return "Good morning, " + name + ". Lovely to see you.";
        } else {
            if (angry){
            return "Where have you been, " + name + "?! It's past your bedtime!";
            } else {
                return "Would you like a cup of tea, " + name + "? You need a good night's rest.";
            }
        }
    }

}