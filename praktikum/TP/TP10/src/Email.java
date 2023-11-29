import java.util.Date;

public class Email {
    private int id;
    private String sender;
    private String content;
    private Date date;
    private boolean starred;
    private String subject;

    public Email(int id, String sender, String subject, String content, Date date, boolean starred) {
        this.id = id;
        this.sender = sender;
        this.content = content;
        this.date = date;
        this.starred = starred;
        this.subject = subject;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isStarred() {
        return starred;
    }

    public void setStarred(boolean starred) {
        this.starred = starred;
    }

    public void display() {
        System.out.println(
                "id : " + id +
                ", sender : " + sender +
                ", subject : " + subject +
                ", content : " + content +
                ", date : " + date +
                ", Starred : " + starred
        );
    }
}
