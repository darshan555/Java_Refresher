class Employee{
    int id;
    String name;
    int salary;
    public void printData(){
        System.out.println("My name is "+name);
        System.out.println("and My id is "+id);
    }
    public int getSalary(){
        return salary;
    }
}
public class Q31_Class {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
        emp1.id = 7;
        emp1.name = "Jigar";
        emp1.salary = 50000;
        emp2.id = 5;
        emp2.name = "Darshan";
        emp1.printData();
        System.out.println(emp1.getSalary());
        emp2.printData();

    }
}
