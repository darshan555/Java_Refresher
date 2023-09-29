public class Q27_methodOverloading {
    static int change(int a){
        a = 98;
        return a;
    }
   static int change(int[] arr) {
       arr[0] = 98;
       return arr[0];
   }

    static void cal(){
        System.out.println("Hello ji this is calculator..");
    }
    static int cal(int x,int y){
        int z = x * y;
        return z;
    }
    static int cal(int x,int y,int w){
        int z = x + y + w;
        return z;
    }
    public static void main(String[] args) {
        // Case 1: In this case value can not be change after calling method
        /*int x = 45;
        change(x);
        System.out.println(x);*/

        // Case 2: In this case value can change after calling method because in the array is passes reference
        /*int[] values = {24,25,87,47,69};
        change(values);
        System.out.println(values[0]);*/

        // Method overloading means same method name,but it is work on how argument passed
        cal();
        System.out.println(cal(5,4));
        System.out.println(cal(4,5,6));
    }
}
