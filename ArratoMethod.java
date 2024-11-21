import java.util.Arrays;

public class ArratoMethod {
    
    static int sum = 0;
    static int average = 0;
    static int min = Integer.MAX_VALUE; // Initialize to a very high value
    static int max = Integer.MIN_VALUE; // Initialize to a very low value
    static int sumOddNumber = 0;
    static int oddCount = 0;
    static StringBuilder oddNumbers = new StringBuilder();
    
    public static void main(String[] args) {
        int bucky[] = {3, -4, 5, 15, 33, 17, 9, 1, 2, 16, 19, 8, 7, -58, 5, 33, 9, 2, 3, 9, 16, -4, 15};
        int result = change(bucky);
        int num[] = {45,12,9,6,1, 2, 3, 4, 5,-9,-87,0};
        //for(int i=0;i<num.length;i++) {
     	   //System.out.print(num[i]+" ");}
        Arrays.sort(num);
        for(int j=0;j<num.length;j++) {
        	System.out.print(" ");
        	System.out.print(" ");
        	System.out.print(num[j]+" ");
        }
        //shiftLeft(num);
        shiftRight(num);
        System.out.println(" ");
        System.out.println("The array sum = " + result);
        System.out.println("The array average = " + average);
        System.out.println("The array minimum value = " + min);
        System.out.println("The array maximum value = " + max);
        System.out.println("The odd numbers count = " + oddCount);
        System.out.println("The odd numbers are: " + oddNumbers.toString());
        System.out.println("The left shifted array = " + Arrays.toString(num));
        System.out.println("The right shifted array = " + Arrays.toString(num));
       
    } 
    

    // Method to sum all elements in an array and calculate average, min, max, and odd numbers
    public static int change(int[] x) {
        for (int i = 0; i < x.length; i++) {
            sum += x[i]; // Calculate the sum of the array
            average = sum / x.length; // Calculate the array average value
           
            if (x[i] < min) { // Calculate the array minimum value
                min = x[i];
            }
            if (x[i] > max) { // Calculate the array maximum value
                max = x[i];
            }
            
            if (x[i] % 2 != 0) { // Check if the number is odd
                sumOddNumber += x[i]; // Sum odd numbers
                oddCount++; // Count the odd numbers
                oddNumbers.append(x[i]).append(" ");
            }
        }
        return sum; // Return the sum of the array
    }
    
    // Method to shift the array left
    public static void shiftLeft(int[] arr) {
        int firstElement = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = firstElement;
    }

    // Method to shift the array right
    public static void shiftRight(int[] arr) {
    	int lastElement=arr[arr.length-1];
    	for(int i=arr.length-1;i>0;i--) {
    		arr[i]=arr[i-1];
    	}
    arr[0]=lastElement;
    }
}
