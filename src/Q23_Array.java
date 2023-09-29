public class Q23_Array {
    public static void main(String[] args) {
//        int[] marks = new int[5];
//        marks[0] = 89;
//        marks[1] = 78;
//        marks[2] = 46;
//        marks[3] = 60;
//        marks[4] = 56;
//        marks[5] = 56;   Throws an error

//        System.out.println(marks[4]);
//        System.out.println(marks.length);

        String[] name = {"Darshan","Jigar","Kishan","Vinay"};
//        System.out.println(name.length);
//        System.out.println(name[2]);

        /*for(int i = 0; i < name.length ; i++){
            System.out.println(name[i]);
        }*/
        /*for (int i =name.length-1;i>=0;i--){
            System.out.println(name[i]);
        }*/
        
        // For-each loop
        for (String element:name) {
            System.out.println(element);
        }
    }
}
