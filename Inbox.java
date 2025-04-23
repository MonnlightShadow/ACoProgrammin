package ex3;
import java.util.LinkedList;

public class Inbox {
    private LinkedList <Mail> mails;

    public Inbox(){
        mails = new LinkedList<>();
    }

    public void addMail(Mail mail){
        mails.add(mail);
    }

    /**
     * counts the amount of unread Mails in the List mails
     * @return amount of unread Mails
     */
    public int countUnread(){
        int unread = 0;
        for (int i = 0; i < mails.size(); i++) {
            if (! mails.get(i).isRead()) unread++;
        }
        return unread;
    }
    /**
     *  prints the Mail with the corresponding index in the list
     * @param index - states which Mail in the list should be printed
     */
    public void open (int index) {
        if (index >= mails.size()) {
            System.out.println("Index out of bounds");
            return;
        }
        System.out.println(mails.get(index).getInfo());
        mails.get(index).read();
    }

    /**
     * prints the Headers of all Mail in the Inbox
     */
    public void printHeaders(){
        for (Mail mail : mails){
            System.out.println( mail.isRead() + " | "  + mail.getSubject() + " | " + mail.getSenderAdress() + " | " + mail.getDatetime() );
        }
    }


}

