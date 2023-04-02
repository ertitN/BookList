package booklist;

import java.time.Year;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BookList {
    private  ArrayList<Book> bookList = new ArrayList<>();
    private Map<String,String> mappedList = new HashMap<>();
    private List<Book> filteredList = new ArrayList<>();

    private static int counter;
    public BookList(){
        if (counter == 0){
        bookList.add(new Book("Sefiller",1488,"Victor Hugo", Year.of(1862)));
        bookList.add(new Book("Hayvan Çiftliği",328,"George Orwell",Year.of(1949)));
        bookList.add(new Book("Kırmızı Pazartesi",144,"Gabriel Garcia",Year.of(1981)));
        bookList.add(new Book("Beyaz Diş",256,"Jack London",Year.of(1906)));
        bookList.add(new Book("Sonsuzluğun Sonu",464,"Isaac Asimov",Year.of(1985)));
        bookList.add(new Book("Anna Karenina",864,"Lev Tolstoy",Year.of(1877)));
        bookList.add(new Book("Yeraltından Notlar",144,"Fyodor Dostoyevski",Year.of(1864)));
        bookList.add(new Book("Otomatik Portakal",213,"Victor Hugo",Year.of(1962)));
        bookList.add(new Book("Gösteri Peygamberi",112,"Victor Hugo",Year.of(1970)));
        bookList.add(new Book("Savaş ve Barış",1392,"Victor Hugo",Year.of(1869)));
        }
        counter++;
    }


    public void printBookList(){
        System.out.println("Book List");
        bookList.stream().forEach(book -> System.out.println(book.toString()));
        System.out.println("**************");
    }

    public  void mapOperation(){
        mappedList =  bookList.stream().collect(Collectors.toMap(
                book -> book.getBookName(),book-> book.getAuthorName() ));
    }
    public  void printMappedList(){
        System.out.println("Mapped List");
        this.mappedList.entrySet().stream().forEach(System.out::println);
        System.out.println("**************");
    }

    public  void filterList(){

        filteredList =  bookList.stream().filter(book -> book.getPageNumber()>300).collect(Collectors.toList());

    }
    public  void printFilteredList(){
        System.out.println("Filtered List");
        filteredList.stream().forEach(element -> System.out.println(element.toString()));
        System.out.println("**************");
    }



}
