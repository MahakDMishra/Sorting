
public class NewSort {
	static void bubbleSort(int[] arr){  
        int n = arr.length;  
        int temp = 0;  
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(arr[j-1] > arr[j]){
                                 temp = arr[j-1];  
                                 arr[j-1] = arr[j];  
                                 arr[j] = temp;  
                         }  
                          
                 }  
         }  
  
    } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[] ={7,98,73,24,39,420,51};  
         
         System.out.println("Array Before Sort");  
         for(int i=0; i < arr.length; i++){  
                 System.out.print(arr[i] + " ");  
         }  
         System.out.println();  
           
         bubbleSort(arr);
          
         System.out.println("Array After Sort");  
         for(int i=0; i < arr.length; i++){  
                 System.out.print(arr[i] + " ");  
         } 

	}

}