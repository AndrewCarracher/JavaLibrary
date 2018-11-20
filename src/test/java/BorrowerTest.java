import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower borrower;
    private Library library;
    private Book book;

    @Before
    public void before(){
        borrower = new Borrower();
        library = new Library();
        book = new Book("Tarzan", "Edgar Rice Burroughs", "fantasy");
        library.addBook(book);
    }

    @Test
    public void checkNumberOfBooksBorrowed(){
        assertEquals(0, borrower.bookCount());
    }

    @Test
    public void CheckCanAddBook(){
        borrower.addBook(library);
        assertEquals(1, borrower.bookCount());
        assertEquals(0, library.countBooks());
    }

}
