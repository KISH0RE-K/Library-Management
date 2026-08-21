public class Member extends Person {
    public Member(int id,String name,String phone){
        super(id,name,phone);
    }

    @Override
    public void displayRole(){
        System.out.println("Role:Library Member");
    }
}
