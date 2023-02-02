
public class CombineArrays {
    /**
     * Combine two arrays into a single array and return it.
     *
     * @param arr1 an array of ints.
     * @param arr2 an array of ints.
     * @return an array containing the contents of arr1 followed by the contents of arr2.
     */
    public int[] combine(int[] arr1, int[] arr2){

        int length = arr1.length + arr2.length;
        int[] newArray = new int[length];

        int i = 0;

        for(int element: arr1){
            newArray[i] = element;
            i++;
        }

        for(int element: arr2){
            newArray[i] = element;
            i++;
        }
    
        
        return newArray;
    }
}
