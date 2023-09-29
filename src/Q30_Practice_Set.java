public class Q30_Practice_Set {
    // Question 1: Multiplication table
    static void mtplTable(int x){
        for(int i = 1;i<=10;i++){
            System.out.println(x+"*"+i+"="+(i*x));
        }
    }
    // Question 2: Print pattern
    static void Pattern(int x){
        for(int i=1;i<=x;i++){
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    // Question 3: sum of first n natural number
    static int sum(int x){
        if (x==1){
            return 1;
        }else {
            return x + sum(x-1);
        }
    }
    // Question 4: Print pattern
    static void pattern2(int x){
        for (int i = x;i>=1;i--){
            for (int j = i;j>=1;j--){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    // Question 5: fibonacci number
    static int fib(int x){
        if(x==1){
            return 0;
        } else if (x==2) {
            return 1;
        }else {
            return fib(x-1)+fib(x-2);
        }
    }
    //Question 6: Average of marks
    static float Average(int ...marks){
        int sum = 0;
        int subject = 0;
        for (int element :
                marks) {
            sum += element;
            subject += 1;
        }
        float avg = (sum / subject);
        return avg;
    }

    public static void main(String[] args) {
        //mtplTable(10);

        //Pattern(5);

        //System.out.println("Sum of n is "+sum(5));

        //pattern2(5);

        //System.out.println(fib(10));

        //System.out.println("average of my marks is "+Average(98,87,75,90,90));


    }
}
