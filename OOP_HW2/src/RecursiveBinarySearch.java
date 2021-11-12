public class RecursiveBinarySearch {
    public static void main(String[] args) {
        int[] sorted_array = {11, 14, 16, 18, 20, 25, 28, 30, 34, 40, 45};
        int key = 18;
        int firstIndex = 0;
        int lastIndex = sorted_array.length - 1;
        if (binarySearch(sorted_array, key, firstIndex, lastIndex))
            System.out.printf("Index = %d", binarySearchIndex(sorted_array, key, firstIndex, lastIndex));
        else System.out.print("NotFound");
    }

    public static boolean binarySearch(int[] sorted_array, int key, int firstIndex, int lastIndex) {
        if (sorted_array[firstIndex] == key) return true;
        else if (sorted_array[lastIndex] == key) return true;
        else if (firstIndex == lastIndex) return false;
        else {
            int middleIndex = (firstIndex + lastIndex) / 2;
            if (key == sorted_array[middleIndex]) return true;
            else {
                if ((key < sorted_array[middleIndex])) {
                    middleIndex--;
                    return binarySearch(sorted_array, key, firstIndex, middleIndex);
                }
                if ((key > sorted_array[middleIndex])) {
                    middleIndex++;
                    return binarySearch(sorted_array, key, middleIndex, lastIndex);
                }
            }
        }
        return false;
    }

    public static int binarySearchIndex(int[] sorted_array, int key, int firstIndex, int lastIndex) {
        if (sorted_array[firstIndex] == key) return firstIndex;
        else if (sorted_array[lastIndex] == key) return lastIndex;
        else if (firstIndex == lastIndex) return -1;
        else {
            int middleIndex = (firstIndex + lastIndex) / 2;
            if (key == sorted_array[middleIndex]) return middleIndex;
            else {
                if ((key < sorted_array[middleIndex])) {
                    middleIndex--;
                    return binarySearchIndex(sorted_array, key, firstIndex, middleIndex);
                }
                if ((key > sorted_array[middleIndex])) {
                    middleIndex++;
                    return binarySearchIndex(sorted_array, key, middleIndex, lastIndex);
                }
            }
        }
        return -1;
    }

}
