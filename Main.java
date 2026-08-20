public class Main {
    public static void main(String[] args){
        Library library=new Library();
        Book book1=new Book(1,"the alchemist","panloCoelho");
        Book book2=new Book(2,"Harry Potter","JK Rowling");

        library.addBook(book1);
        library.addBook(book2);
    }
}
