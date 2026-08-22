import java.util.*;
public class Main {
    public static void main(String[] args){
        Library library=new Library();
        Scanner sc=new Scanner(System.in);

        while (true) {

            System.out.println("===== LIBRARY MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Search Book");
            System.out.println("4. Add Member");
            System.out.println("5. View Members");
            System.out.println("6. Search Member");
            System.out.println("7. Borrow Book");
            System.out.println("8. Return Book");
            System.out.println("9. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice){
                case 1:
                    System.out.println("enter Book id:");
                    int id1=sc.nextInt();
                    sc.nextLine();
                    System.out.println("enter title:");
                    String title=sc.nextLine();
                    System.out.println("enter author name:");
                    String author=sc.nextLine();
                    library.addBook(new Book(id1,title,author));
                    break;
                case 2:
                    library.viewBooks();
                    break;
                case 3:
                    System.out.println("enter book id");
                    int id2=sc.nextInt();
                    try {
                        Book book = library.searchBook(id2);

                        System.out.println("Id: " + book.getId());
                        System.out.println("Title: " + book.getTitle());
                        System.out.println("Author: " + book.getAuthor());

                    } catch (BookNotFoundException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    System.out.println("enter member id:");
                    int id3=sc.nextInt();
                    sc.nextLine();
                    System.out.println("enter member name:");
                    String name=sc.nextLine();
                    System.out.println("enter phone number:");
                    String phone=sc.next();
                    library.addMember(new Member(id3,name,phone));
                    break;
                case 5:
                    library.viewMembers();
                    break;
                case 6:
                    System.out.println("enter member id:");
                    int id4=sc.nextInt();
                    Member member=library.searchMember(id4);
                    if(member!=null){
                        System.out.println("id:"+member.getId());
                        System.out.println("Name:"+member.getName());
                        System.out.println("phone"+member.getPhone());
                    }else{
                        System.out.println("No member Found");
                    }
                    break;
                case 7:
                    System.out.println("enter book id:");
                    int id5=sc.nextInt();
                    System.out.println("enter member id:");
                    int id6=sc.nextInt();
                    library.borrowBook(id6, id5);
                    break;
                case 8:
                    System.out.println("enter book id:");
                    int id7=sc.nextInt();
                    System.out.println("enter member id:");
                    int id8=sc.nextInt();
                    library.returnBook(id8, id7);
                    break;
                case 9:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
            } 
        }
    }
}
