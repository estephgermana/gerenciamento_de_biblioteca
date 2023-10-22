import java.util.ArrayList;
import java.util.List;

public class LibraryManager {
    private static LibraryManager instance;

    private List<Book> books;

    private LibraryManager() {
        // Inicialização da biblioteca e carregamento de livros
        books = new ArrayList<>();
    }

    public static LibraryManager getInstance() {
        if (instance == null) {
            instance = new LibraryManager();
        }
        return instance;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> getAllBooks() {
        return books;
    }
}

class Book {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}

public class Main {
    public static void main(String[] args) {
        LibraryManager library = LibraryManager.getInstance();
        library.addBook(new Book("Java Design Patterns"));
        
        LibraryManager anotherLibrary = LibraryManager.getInstance();
        List<Book> allBooks = anotherLibrary.getAllBooks();
        for (Book book : allBooks) {
            System.out.println(book.getTitle());
        }
    }
}
