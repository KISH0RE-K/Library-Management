import java.util.*;
public class Member extends Person {
    private ArrayList<Book> borrowedbooks=new ArrayList<>();
    public Member(int id,String name,String phone){
        super(id,name,phone);
    }

    @Override
    public void displayRole(){
        System.out.println("Role:Library Member");
    }

    public void borrowBook(Book book){
        borrowedbooks.add(book);
    }

    public void returnBook(Book book){
        borrowedbooks.remove(book);
    }

    public void viewBorrowedBooks(){
        if(borrowedbooks.isEmpty()){
            System.out.println("No books borrowed");
            return;
        }
        for(Book book:borrowedbooks){
            System.out.println(book.getId());
            System.out.println(book.getTitle());
            System.out.println(book.getAuthor());
        }
    }
}
