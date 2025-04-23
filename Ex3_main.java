package ex3;

public class Ex3_main {

    public static void main(String[] args) {
        Inbox inbox = new Inbox();
        Mail m1 = new Mail ("simon.bast@gmx.de" , "test", 20250410, "hello");
        Mail m2 = new Mail ("d.f@gmx.de", "Ich mag Kuchen", 20250412, "Kuchen ist toll! Liebe Grüße");
        Mail m3 = new Mail ("@gmail.com" , "Kuchen ist doof" , 20250413, "Kcuhen ist blööd!!!!!");
        inbox.addMail(m1);
        inbox.addMail(m2);
        inbox.addMail(m3);
        inbox.printHeaders();
        inbox.open(2);
        System.out.println("Amount of unread Mails: " + inbox.countUnread());
        inbox.printHeaders();
        //
    }
}
