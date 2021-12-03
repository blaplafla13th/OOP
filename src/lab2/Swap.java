package lab2;

public class Swap {
    public static void main(String[] args) {
        int[] array1 = {5, 1};
        int[] array2 = {1, 4, 1, 1};
        int[] array3 = {1, 3, 1, 2};
        if (swap(array2,array3)) {
            System.out.print("Contents are successfully swapped.");
            print(array2);
            print(array3);
        }
        else
            System.out.print("lab2.Swap fail.");
    }

    public static boolean swap(int[] array1, int[] array2) {
        if (array1.length != array2.length)
            return false;

        for(int i=0;i< array1.length;i++){
            int temp=array1[i];
            array1[i]=array2[i];
            array2[i]=temp;
        }
        return true;
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
