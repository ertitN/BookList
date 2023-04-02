package booklist;
import java.time.Year;
public class Book {
    private String bookName;
    private int pageNumber;
    private String authorName;
    private Year releaseYear;




    public Book(String bookName, int pageNumber, String authorName, Year releaseDate) {
        this.bookName = bookName;
        if (pageNumber <= 0){
            this.pageNumber = 100;
        }
        else {
            this.pageNumber = pageNumber;
        }

        this.authorName = authorName;
        this.releaseYear = releaseDate;
    }

    public String getBookName() {
        return bookName;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public String getAuthorName() {
        return authorName;
    }

    public Year getReleaseYear() {
        return releaseYear;
    }

    public String toString(){
        return "Book Name: "+bookName+" Page Number: "+pageNumber+" Release Year: "+ releaseYear;
    }
}
