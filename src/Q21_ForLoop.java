public class Q21_ForLoop {
    public static void main(String[] args) {
        int check = 100;

        for (int i = 0;i<=check;i++){
            if(i%2==0){
                continue;
            }
            System.out.println(i);
        }

        /*for(int i = check; i>=1 ; i--){
            System.out.println(i);
            if(i==25){
                break;
            }
        }*/
    }
}
