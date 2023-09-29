class Mydata{
    int id;
    String name;
    int salary;
    public Mydata(int i,String n){          //This is constructor,Constructor name is same as Class name
        id = i;                             // In constructor, we can also overload constructor
        name = n;
    }
    public Mydata(){
        salary = 10000;
    }
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
public class Q34_Constructor {
    public static void main(String[] args) {
        Mydata fd = new Mydata();
        fd.setId(5);
        fd.setName("Jatin");
        System.out.println(fd.getId());
        System.out.println(fd.getName());
        System.out.println(fd.salary);
    }
}
