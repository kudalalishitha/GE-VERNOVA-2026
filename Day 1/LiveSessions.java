import java.util.ArrayList;
import java.util.List;

public class LiveSessions {

    String topic;
    List<String> messages = new ArrayList<>();

    public LiveSessions(String topic) {
        this.topic = topic;
    }

    public void sendMessage(String user, String msg) {
        messages.add(user + ": " + msg);
    }
    public void showChat() {
        System.out.println("\n--- Live Chat on " + topic + " ---");
        for (String m : messages) {
            System.out.println(m);
        }
    }
}
