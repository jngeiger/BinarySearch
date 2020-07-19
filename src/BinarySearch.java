public class BinarySearch {
    public static void main(String[] args) { }

    public static boolean binarySearch(int[] array, int key)
    {
        int first = 0;
        int last = array.length-1;

        while (first <= last)
        {
            int mid = (first + last)/2;
            if (array[mid] == key) return true;
            else if (key < array[mid])
            {
                last = mid-1;
            }
            else if (key > array[mid])
            {
                first = mid+1;
            }
        }
        return false;
    }

    public static Boolean recBinarySearch(int[] array, int key)
    {
        return _recBinarySearch(array,key,0,array.length-1);
    }
    private static Boolean _recBinarySearch(int[] array, int key, int left, int right)
    {
        if (left > right) return false;
        int middle = left+right/2;
        if (key == array[middle]) return true;
        else if (key < array[middle]) return _recBinarySearch(array,key,left,--middle);
        else return _recBinarySearch(array,key,++middle,right);
    }
}
