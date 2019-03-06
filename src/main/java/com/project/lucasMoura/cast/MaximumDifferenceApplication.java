package com.project.lucasMoura.cast;

public class MaximumDifferenceApplication {

	int maxDifference(int array[], int arrSize) 
	{ 
		int maxDifference = 0; 

		for (int i = 0; i + 1 < arrSize; i++){
			
			if(array[i+1] > array[i]) {
				for(int j = 0; j < i+1; j++) {
					if(array[i+1] > array[j]) {
						if ((array[i+1] - array[j]) > maxDifference) 
							maxDifference = array[i+1] - array[j]; 		
					}				
				}
			}
//			for (int j = 1; j < arrSize; j++){ 
//				if(array[j] > array[i])
//
//			} 
			
			
		} 
		return maxDifference; 
	} 

	/* Driver program to test above functions */
	public static void main(String[] args) 
	{ 
		MaximumDifferenceApplication maxdif = new MaximumDifferenceApplication(); 
		int arrayNumbers[] = {7, 9, 5, 6, 3, 2}; 
		System.out.println("Maximum differnce is " + maxdif.maxDifference(arrayNumbers, arrayNumbers.length)); 
	} 

}
