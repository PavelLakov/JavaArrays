import java.util.Arrays;

import javax.swing.SortingFocusTraversalPolicy;


public class arraysMerge {

	public static void main(String[] args) {
	 int[]a= {1,2,3,7,9,0,18,36,-8};
	 int[]b= {4,-5,5,6,9,22,};
	 
	 
	 
	 int []c=new int[a.length+b.length];
	 
	 for(int i=0;i<a.length;i++) {
		 c[i] =a[i];
	 }
	 
	 for(int i=0;i<b.length;i++) {
		 c[i+a.length]= b[i];
		
		 
		 
	 }
	 System.out.println("merged array: "+" "+Arrays.toString(c));
	 
	 /******Sorting the merged array***/
	 
	 //1.Approach:
	 //Arrays.sort(c);
	 
	 //2.Approach
	 for(int i=0;i<c.length;i++) {
		 
		 for(int j=i+1;j<c.length;j++) {
			 
			 if(c[i]>c[j]) {// here is the logic '>' sorting ascending  in  order. if '<' sorting in descending oder
				 int temp=c[i];
				 c[i]=c[j];
				 c[j]=temp;
			 }
		 }
		 
		 
	 }System.out.println("merged aray sorted: "+" "+Arrays.toString(c));
	 
	 
	}

}
