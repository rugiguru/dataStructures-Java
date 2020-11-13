public class Array {
    
    public int SumArray(int[] myArray){
        int sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            sum += myArray[i];
        }
        return sum;
    }

}
