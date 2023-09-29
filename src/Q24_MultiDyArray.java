public class Q24_MultiDyArray {
    public static void main(String[] args) {
        int[][] flate = new int[2][3];
        flate[0][0] = 101;
        flate[0][1] = 102;
        flate[0][2] = 103;
        flate[1][0] = 201;
        flate[1][1] = 202;
        flate[1][2] = 203;

        for(int i = 0; i< flate.length ; i++){
            for (int j = 0 ; j< flate[i].length;j++){
                System.out.print(flate[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }

    }
}
