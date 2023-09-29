class Employees{
    int salary;
    String name;
    public int getSalaryOfE(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String ename){
        this.name = ename;
    }
}
class Cellphone{
    public void ringing(){
        System.out.println("Phone on ringing....");
    }public void vibrate(){
        System.out.println("Phone on vibrate....");
    }
}
class Square{
    int side;
    public int area(){
        return side*side;
    }
    public int peremeter(){
        return 4*side;
    }
}
public class Q32_Practice_Set {
    public static void main(String[] args) {
        /*Employees emp1 = new Employees();
        emp1.setName("Darshan");
        emp1.setName("jigar");
        System.out.println(emp1.getName());
        emp1.salary = 50000;
        System.out.println(emp1.getSalaryOfE());*/

        /*Cellphone phone1 = new Cellphone();
        phone1.ringing();
        phone1.vibrate();*/

        Square check = new Square();
        check.side = 4;
        System.out.println(check.area());
        System.out.println(check.peremeter());
    }
}
