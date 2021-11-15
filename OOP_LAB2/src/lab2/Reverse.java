package lab2;

public class Reverse {
    public static void main(String[] args) {
        int[] array = {1, 3, 1, 2};
        reverse(array);
        print(array);
    }

    public static void reverse(int[] array) {
        for (int i = 0; i < array.length/2;i++){
            int temp = array[array.length-1-i];
            array[array.length-1-i]=array[i];
            array[i]=temp;
        }
    }
    static void print(int[] array) {
        System.out.println();
        if (array.length == 1) System.out.print("[" + array[0] + "]");
        else
            for (int i = 0; i < array.length; i++) {
                if (i == 0) {
                    System.out.print("[" + array[i]);
                } else if (i == array.length - 1) {
                    System.out.print(", " + array[i] + "]");
                } else {
                    System.out.print(", " + array[i]);
                }
            }
    }
}
