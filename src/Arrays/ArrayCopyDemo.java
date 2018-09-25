package Arrays;
import java.util.Arrays;

class ArrayCopyDemo {
    public static void main(String[] args) {
        char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e',
			    'i', 'n', 'a', 't', 'e', 'd' };
        char[] copyTo_system = new char[7];
        System.arraycopy(copyFrom, 2, copyTo_system, 0, 7);
        
        char[] copyTo_arrays = Arrays.copyOfRange(copyFrom, 2, 9);
        System.out.println(new String(copyTo_system));
        System.out.println(new String(copyTo_arrays));
        
        System.out.println("Both the arrays are similar or not : " + Arrays.equals(copyTo_system, copyTo_arrays));
        
        Arrays.sort(copyFrom);
        int indexOfFirstf = Arrays.binarySearch(copyFrom, 'f');
        System.out.println("The letter f is at index " + indexOfFirstf);
    }
}
