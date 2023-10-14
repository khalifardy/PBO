package job;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Artist {
    private String name;
    private String birthdate;
    private int age;

    // Konstruktor
    public Artist(String name, String birthdate) {
        this.name = name;
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date birthDate = dateFormat.parse(birthdate);
            Calendar calendarNow = Calendar.getInstance();
            Calendar calendarBirth = Calendar.getInstance();
            calendarBirth.setTime(birthDate);

            if (calendarNow.get(Calendar.MONTH) <= calendarBirth.get(Calendar.MONTH) &&
                calendarNow.get(Calendar.YEAR) >= calendarBirth.get(Calendar.YEAR)) {
                age = calendarNow.get(Calendar.YEAR) - calendarBirth.get(Calendar.YEAR) - 1;
            } else if (calendarNow.get(Calendar.MONTH) > calendarBirth.get(Calendar.MONTH) &&
                       calendarNow.get(Calendar.YEAR) >= calendarBirth.get(Calendar.YEAR)) {
                age = calendarNow.get(Calendar.YEAR) - calendarBirth.get(Calendar.YEAR);
            } else {
                age = 0;
            }

            SimpleDateFormat outputFormat = new SimpleDateFormat("dd MMMM yyyy");
            this.birthdate = outputFormat.format(birthDate);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthdate(String birthdate) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date = dateFormat.parse(birthdate);
            SimpleDateFormat outputFormat = new SimpleDateFormat("dd MMMM yyyy");
            this.birthdate = outputFormat.format(date);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getName() {
        return name;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public int getAge() {
        return age;
    }

    public void displayInfo() {
        System.out.println("Artist name: " + name);
        System.out.println("Birthdate: " + birthdate);
        System.out.println("Age: " + age);
    }
}

