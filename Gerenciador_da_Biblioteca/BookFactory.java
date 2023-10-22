public class BookFactory {
    public Book createBook(String bookType) {
        if (bookType.equalsIgnoreCase("novel")) {
            return new Novel();
        } else if (bookType.equalsIgnoreCase("nonfiction")) {
            return new NonFiction();
        } else {
            return null;
        }
    }
}