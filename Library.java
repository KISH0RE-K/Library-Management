import java.util.*;

public class Library{
    private ArrayList<Book> books=new ArrayList<>();
    private ArrayList<Member> members=new ArrayList<>();

    public void addBook(Book book){
        if(searchBook(book.getId())!=null){
            System.out.println("Book with id already exists");
            return;
        }
        books.add(book);
    }

    public void viewBooks(){
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

    public void addMember(Member member){
        if(searchMember(member.getId())!=null){
            System.out.println("member with id already exists");
            return;
        }
        members.add(member);
    }

    public void viewMembers(){
        for(Member member:members){
            System.out.println(member.getId());
            System.out.println(member.getName());
            System.out.println(member.getPhone());
        }
    }

    public Member searchMember(int id){
        for(Member member:members){
            if(member.getId()==id){
                return member;
            }
        }
        return null;    
    }

    public void borrowBook(int memberId,int bookId){
        Member member=searchMember(memberId);
        Book book=searchBook(bookId);
        if(member==null){
            System.out.println("Member Not Found");
            return;
        }else if(book==null){
            System.out.println("Book Not found");
            return;
        }else if(book.getStatus()==false){
            System.out.println("Book not available");
            return;
        }else{
            System.out.println("Book available");
            book.setStatus(false);
        }
    }

    public void returnBook(int memberId,int bookId){
        Member member=searchMember(memberId);
        Book book=searchBook(bookId);
        if(member==null){
            System.out.println("Member Not Found");
            return;
        }else if(book==null){
            System.out.println("Book Not found");
            return;
        }else if(book.getStatus()==true){
            System.out.println("Book already available");
            return;
        }else{
            book.setStatus(true);
            System.out.println("Book returned Successfully");  
        }
    }
}