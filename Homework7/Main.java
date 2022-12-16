package Homework7;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Reader x1 = new Reader("Гаврилычев Д.С.", "34", "Юридический", "12.12.1998", "8-967-8800947");
        Reader x2 = new Reader("Умнов В.И.", "12", "Педагогический", "03.09.1998", "8-965-8652989");
        Reader x3 = new Reader("Денисов И.С.", "78", "Ремонтный", "06.06.1998", "8-967-8800987");
        Reader x4 = new Reader("Савельев А.Е.", "95", "ВКС", "14.06.1998", "8-909-0520907");
        ArrayList<Reader> visitors = new ArrayList<Reader>();
        visitors.add(x1);
        visitors.add(x2);
        visitors.add(x3);
        visitors.add(x4);
        String[] nameBooks = {"Остров сокровищ", "Война и мир"};

        visitors.get(2).takeBook(2);
        visitors.get(2).takeBook(nameBooks);
        visitors.get(0).returnBook(2);
        visitors.get(0).returnBook(nameBooks);

    }
}