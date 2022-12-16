package Homework7;

public class Reader {
    public String fullName;
    public String ticketNumber;
    public String faculty;
    public String date;
    public String number;

    public Reader(String fullName, String ticketNumber, String faculty, String date, String number) {
        this.fullName = fullName;
        this.ticketNumber = ticketNumber;
        this.faculty = faculty;
        this.date = date;
        this.number = number;
    }

    public void takeBook(int countBooks) {
        System.out.println(this.fullName + " взял " + countBooks + " книги");
    }

    public void takeBook(String[] nameBook) {
        String s = "";
        for (int i = 0; i < nameBook.length; i++) {
            s += nameBook[i] + ", ";
        }
        System.out.println(this.fullName + " взял " + " книги: " + s.substring(0, s.length() - 2));
    }

    public void returnBook(int countBooks) {
        System.out.println(this.fullName + " вернул " + countBooks + " книги");
    }

    public void returnBook(String[] nameBook) {
        String s = "";
        for (int i = 0; i < nameBook.length; i++) {
            s += nameBook[i] + ", ";
        }
        System.out.println(this.fullName + " вернул " + " книги: " + s.substring(0, s.length() - 2));
    }
}