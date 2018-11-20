import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private ArrayList<Book> collection;
    private int capacity;
    private HashMap<String, Integer> bookGenres;


    public Library(){
        this.collection = new ArrayList<>();
        this.capacity = 1000;
        this.bookGenres = new HashMap();
    }

    public int getCount(String genre){
        return this.bookGenres.get(genre);
    }

    public int countBooks(){
        return this.collection.size();
    }

    public void addBook(Book book){
        if(countBooks() < this.capacity) {
            this.collection.add(book);
        }
    }

    public HashMap countGenres(){
        for(int i = 0; i < countBooks(); i++){
            Book book = this.collection.get(i);
            String bookGenre = book.getGenre();

            if(this.bookGenres.get(bookGenre) != null ){
                this.bookGenres.put(bookGenre, this.bookGenres.get(bookGenre) +1);
            }
            else{
                this.bookGenres.put(bookGenre, 1);
            }
        }

        return bookGenres;

    }

    public Book removeBook(){
        return this.collection.remove(0);
    }
}
