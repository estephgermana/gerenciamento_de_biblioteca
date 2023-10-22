public class Main {
    public static void main(String[] args) {
        BookFactory factory = new BookFactory();

        Book novel = factory.createBook("novel");
        Book nonFiction = factory.createBook("nonfiction");

        System.out.println(novel.getTitle());
        System.out.println(nonFiction.getTitle());
    }
}