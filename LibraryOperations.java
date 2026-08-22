public interface LibraryOperations {
    public void addBook(Book book);

    public void viewBooks();

    public Book searchBook(int id) throws BookNotFoundException;

    public void addMember(Member member);

    public void viewMembers();

    public Member searchMember(int id) throws MemberNotFoundException;

    public void borrowBook(int memberId,int bookId);

    public void returnBook(int memberId,int bookId);
}
