import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book1;
    private Book book2;
    private Book book3;


    @Before
    public void before(){
        library = new Library();
        book1 = new Book("Tarzan", "Edgar Rice Burroughs", "fantasy");
        book2 = new Book("The Little Mermaid", "Hans Christian Andersen", "fantasy");
        book3 = new Book("One Last Kill", "Barry Eisler", "action");
    }

    @Test
    public void checkStock(){
        assertEquals(0, library.countBooks());
    }

    @Test
    public void checkCanAddBook(){
        library.addBook(this.book1);
        assertEquals(1, library.countBooks());
    }

    @Test
    public void checkBookByGenre(){
        library.addBook(this.book1);
        library.addBook(this.book2);
        library.addBook(this.book3);
        HashMap booksGenres = library.countGenres();
        assertEquals(2, library.getCount("fantasy"));
    }
}
