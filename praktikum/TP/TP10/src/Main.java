import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        ArrayList<Email> arrayListEmail = new ArrayList<>();
        arrayListEmail.add(new Email(1, "miko", "ayu", "halo", new Date(2023-1900, 10, 26), true));
        arrayListEmail.add(new Email(2, "ayu", "miko", "halo", new Date(2023-1900, 10, 27), true));
        arrayListEmail.add(new Email(3, "siapa", "gaktahu", "halo", new Date(2023-1900, 10, 28), false));

        for (Email email : arrayListEmail) {
            if (email.isStarred()) {
                email.display();
            }
        }
    }
}
