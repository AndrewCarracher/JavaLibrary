import java.util.ArrayList;

public class Borrower {
    private ArrayList<Book> borrowedBooks;

    public Borrower(){
        this.borrowedBooks = new ArrayList<>();
    }

    public int bookCount(){
        return this.borrowedBooks.size();
    }

    public void addBook(Library library){
        Book book = library.removeBook();
        this.borrowedBooks.add(book);
    }
}
