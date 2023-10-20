import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List< Book > bookList = new ArrayList< Book >();
        bookList.add(new Book("Things Fall Apart", "Chinua Achebe", 209, 1958));
        bookList.add(new Book("Fairy tales", "Hans Christian Andersen", 784, 1836));
        bookList.add(new Book("The Divine Comedy", "Dante Alighieri", 928, 1315));
        bookList.add(new Book("The Epic Of Gilgamesh", "Unknown", 160, -1700));
        bookList.add(new Book("Dead Soul","Nikolai Gogol", 432, 1842));
        bookList.add(new Book("One Thousand and One Nights", "Unknown", 288, 1200));
        bookList.add(new Book("Madame Bovary", "Gustave Flaubert", 528, 1857));
        bookList.add(new Book("Pride and Prejudice", "Jane Austen", 226, 1813));
        bookList.add(new Book("One Hundred Years of Solitude", "Gabriel García Márquez", 422, 1967));
        bookList.add(new Book("Molloy, Malone Dies, The Unnamable, the trilogy", "Samuel Beckett", 256, 1952));


        Map<String, String> bookMap = bookList.stream().collect(Collectors.toMap(Book::getBookName, Book::getAuthorName));
        System.out.println("Author Name by Book Name");
        System.out.println("--------------------------------------------------");
        bookMap.forEach((k, v) -> System.out.println("Book Name: " + k + ", Author Name: " + v));

        System.out.println("##################################################");

        List < Book > filteredList = bookList.stream().filter(book -> book.getPageNumber() > 350).toList();
        System.out.println("Book List with more than 350 pages");
        System.out.println("--------------------------------------------------");
        filteredList.forEach(book -> System.out.println(book.getBookName()));

    }
}