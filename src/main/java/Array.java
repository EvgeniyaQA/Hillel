

public class Array {
    public static void main(String[] args) {


        int[] arrayOne = new int[7];

        System.out.println(arrayOne.length);

        arrayOne[3] = 15;
        arrayOne[6] = 9;
        arrayOne[1] = 12;
        arrayOne[2] = 40;
        System.out.println(arrayOne[3]);
        /*for (int i = 0; i < 7; i++) {//вместо  i<7 - i<arrayOne.length
            System.out.println(arrayOne[i]);
        }
        for (int i = 0; i < arrayOne.length; i++) {//вместо  i<7 - i<arrayOne.length
            System.out.print(arrayOne[i]);
        }*/
        for (int i = arrayOne.length-1; i > 0; i--) {//вместо  i<7 - i<arrayOne.length
            System.out.print(arrayOne[i]);
        }
    }
}
