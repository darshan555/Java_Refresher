class MyEmployee{
    private int id;
    private String name;
    public void setId(int i){
        id = i;
    }
    public int getId(){
        return id;
    }
    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
}
public class Q33_AccessModifier {
    public static void main(String[] args) {
        MyEmployee emp1 = new MyEmployee();
        emp1.setId(25);
        System.out.println(emp1.getId());
        emp1.setName("Darshan");
        System.out.println(emp1.getName());
    }
}
