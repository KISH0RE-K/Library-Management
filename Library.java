import java.util.*;

public class Library{
    private ArrayList<Book> books=new ArrayList<>();
    private ArrayList<Member> members=new ArrayList<>();

    public void addBook(Book book){
        books.add(book);
    }

    public void viewBook(){
        for(Book book:books){
            System.out.println(book.getId());
            System.out.println(book.getTitle());
            System.out.println(book.getAuthor());
        }
    }

    public Book searchBook(int id){
        for(Book book:books){
            if(book.getId()==id){
                return book;
            }
        }
        return null;
    }
}