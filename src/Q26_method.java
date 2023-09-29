public class Q26_method {
    static int logic(int x,int y){
        int z;
        if(x>y){
            z = x + y;
        }else {
            z = (x+y)*2;
        }
        return z;
    }
    public static void main(String[] args) {
        int w = logic(2,4);
        System.out.println(w);
    }
}
