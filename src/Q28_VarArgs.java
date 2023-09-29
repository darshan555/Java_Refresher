public class Q28_VarArgs {
    static  int sum(int x,int ...arr){        // ... is called varArgs
        int result = x;
        for (int element :
                arr) {
            result += element;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("The sum is "+sum(10));
        System.out.println("The sum of 5,4,7,8 is "+sum(5,4,7,8));
        System.out.println("The sum of 10,20,30 is "+sum(10,20,30));
    }
}
