public class Array {
    public static void main(String[] args) {
        int [] iniArray1;
        iniArray1 = new int[3];
        iniArray1 [0] = 1;
        iniArray1 [1] = 2;
        iniArray1 [2] = 3;

        System.out.println(iniArray1[1]);
//Array initialization 2
        int[] iniArray2  = new int[]{
                1,2,3
        };
 //Array initialization 3
        int[] iniArray3 = {
                1,2,3,4,5
        };
        System.out.println(iniArray3.length);

        //Array dalam Array
        String [][] ArrayDalamArray = {
                {"Ega", "Kusnadi"},
                {"Siti", "Indriani"},

        };
        System.out.println(ArrayDalamArray[0]);
        System.out.println((ArrayDalamArray[0][1]));
    }
    }

