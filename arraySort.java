

public class arraySort {

	public static void main(String[] args) {
        int[] arr = {1, 4, 5, 3, 6, 8, 12, 45, -5, -7, 0};
        int temp;
        System.out.print("original array:"+" ");
        for(int q:arr) {
       
        	System.out.print(q+ " ");
        }
        // Bubble sort algorithm
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) { // here using'<' sort in descending order and vis versa
                    // Swap elements
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        

        System.out.println();
        System.out.print("Sorted array: ");
        for (int p : arr) {
            System.out.print(p + " ");}
        
        /*Largest element*/
        int max=arr[0];
        for(int i=0;i<arr.length;i++) {
        	if(arr[i]>max) {
        		max=arr[i];
        		}
        }
        System.out.println();
        System.out.println("the largest array number is: "+max);

        /*Smallest element*/
	int min=arr[0];
	for(int i=0;i<arr.length;i++) {
		if(arr[i]<min) {
			min=arr[i];
		}
	}
	System.out.println("the smallest array numbeer is: "+ min);

}
	}