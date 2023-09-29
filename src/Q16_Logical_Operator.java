public class Q16_Logical_Operator {
    public static void main(String[] args) {
        boolean a = false;
        boolean b = false;

        if(a && b){                     // AND
            System.out.println("Y");
        }else {
            System.out.println("N");
        }

        if(a || b){                     // OR
            System.out.println("Y");
        }else {
            System.out.println("N");
        }

        if (!a){
            System.out.println("false");
        }else {
            System.out.println("True");
        }
    }

}
