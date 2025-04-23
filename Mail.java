package ex3;

public class Mail {
    private String senderAdress;
    private String subject;
    private String message;
    private int datetime;
    boolean read = false;

    public Mail(String senderAdress, String subject,  int datetime, String message) {
        this.senderAdress = senderAdress;
        this.subject = subject;
        this.message = message;
        this.datetime = datetime;
    }

    public String getInfo(){
        return ( subject + " from " + senderAdress + " on " + datetime + ": " + message );
    }
    public void read (){
        read = true;
    }

    public String getSenderAdress() {
        return senderAdress;
    }

    public String getSubject() {
        return subject;
    }

    public boolean isRead() {
        return read;
    }

    public int getDatetime() {
        return datetime;
    }

    public String getMessage() {
        return message;
    }

}
