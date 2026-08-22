import java.util.*;

public class Library implements LibraryOperations{
    private ArrayList<Book> books=new ArrayList<>();
    private ArrayList<Member> members=new ArrayList<>();

    @Override
    public void addBook(Book book){
        if(searchBook(book.getId())!=null){
            System.out.println("Book with id already exists");
            return;
        }
        books.add(book);
    }

    @Override
    public void viewBooks(){
        for(Book book:books){
            System.out.println(book.getId());
            System.out.println(book.getTitle());
            System.out.println(book.getAuthor());
        }
    }

    @Override
    public Book searchBook (int id) throws BookNotFoundException{
        for(Book book:books){
            if(book.getId()==id){
                return book;
            }
        }
        throw new BookNotFoundException("Book Not Found");
    }

    @Override
    public void addMember(Member member){
        if(searchMember(member.getId())!=null){
            System.out.println("member with id already exists");
            return;
        }
        members.add(member);
    }

    @Override
    public void viewMembers(){
        for(Member member:members){
            System.out.println(member.getId());
            System.out.println(member.getName());
            System.out.println(member.getPhone());
        }
    }

    @Override
    public Member searchMember(int id){
        for(Member member:members){
            if(member.getId()==id){
                return member;
            }
        }
        return null;    
    }

    @Override
    public void borrowBook(int memberId,int bookId){
        try{
            Book book=searchBook(bookId);
            Member member=searchMember(memberId);
            if(member==null){
                System.out.println("Member Not Found");
                return;
            }else if(book.getStatus()==false){
                System.out.println("Book not available");
                return;
            }else{
                System.out.println("Book available");
                book.setStatus(false);
            }
        }catch(BookNotFoundException e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void returnBook(int memberId,int bookId){    
        try{
            Book book=searchBook(bookId);
            Member member=searchMember(memberId);
            if(member==null){
                System.out.println("Member Not Found");
                return;
            }else if(book.getStatus()==true){
                System.out.println("Book already available");
                return;
            }else{
                book.setStatus(true);
                System.out.println("Book returned Successfully");  
            }
        }catch(BookNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}