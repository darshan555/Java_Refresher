public class Q29_FactorialUsingRecursion {
    static int factorial(int x){
        if(x == 0 || x == 1){
            return 1;
        }else {
            return x*(factorial(x-1));
        }
    }
    public static void main(String[] args) {
        int a = 0;
        System.out.println("The value of factorial n is :"+factorial(a));
    }
}
