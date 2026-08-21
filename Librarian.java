public class Librarian extends Person {
    public Librarian(int id,String name,String phone){
        super(id,name,phone);
    }
    
    @Override
    public void displayRole(){
        System.out.println("Role: Librarian");
    }
}
