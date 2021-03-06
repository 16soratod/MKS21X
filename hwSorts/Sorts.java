import java.util.ArrayList;
public class Sorts{
    public static void printArray(int[] data){
        String ret = "";//empty string to concatenate elements in array                                                                                                                                 
        for(int i = 0; i < data.length-1; i++){//data.length-1 since you don't want the last element to have ','                                                                                        
            ret += data[i] + ", ";//loops that add each element along with a comma to ret                                                                                                               
        }
        System.out.println("{ " + ret + data[data.length-1] + " }");//print out brackets + elements + last element                                                                                      
    }

    public static void insertionSort(int[] data){
        for(int i = 1; i < data.length; i++){//start off with a for loop                                                                                                                                
            if(data[i] < data[i-1] && i != -1){//if element on right is less than the one on left, and when i isn't -1 (there will be an error for out of bounds if not for this)                       
                int n = data[i];//remember the element that you will be replacing                                                                                                                       
                data[i] = data[i-1];//replace element on right to the left                                                                                                                              
                data[i-1] = n;//move up the element on the left                                                                                                                                         
                insertionSort(data);//recursion: continue the above process until i reaches -1 and goes out of the for loop or if the element on right is larger than the left. Basically keeps comparing the element on the right to the left.                                                                                                                                                                
    }
        }

    }
    public static void selectionSort(int[] data){
	for(int i = 0; i < data.length; i++){
	    for(int j = 0; j < data.length; j++){
		int min = data[i];
		if(min < data[j]){
		    min = data[j];
		    data[j] = data[i];
		    data[i] = min;
		}
	    }
	}
    }
    public static void bubbleSort(int[] data){
	for(int j = 0; j < data.length-1; j++){
	    for(int i = 0; i < data.length-1; i++){
		if(data[i] > data[i+1]){
		    int val = data[i];
		    data[i] = data[i+1];
		    data[i+1] = val;
		}
	    }
	}
    }
    public static void main(String[]args){
        int[] ary = { 8, 6, 7, 5, 3, 0, 9};
        int[] ary2 = { 2, 5, 8, 90, 1, 0, 0, 0, 24, 5, 8};
        int[] ary3 = { 8, 6, 7, 5, 3, 0, 9};
	int[] ary4 = { 2, 5, 8, 90, 1, 0, 0, 0, 24, 5, 8};
	int[] ary5 = { 8, 6, 7, 5, 3, 0, 9};
        int[] ary6 = { 2, 5, 8, 90, 1, 0, 0, 0, 24, 5, 8};
 	System.out.println("First test case");
        Sorts.printArray(ary);
        Sorts.insertionSort(ary);
        Sorts.printArray(ary);
        System.out.println("Second test case");
        Sorts.printArray(ary2);
        Sorts.insertionSort(ary2);
        Sorts.printArray(ary2);
	System.out.println("Selection Sort");
	Sorts.selectionSort(ary3);
	Sorts.printArray(ary3);
	Sorts.selectionSort(ary4);
        Sorts.printArray(ary4);
	System.out.println("Bubble Sort");
        Sorts.bubbleSort(ary5);
        Sorts.printArray(ary5);
        Sorts.bubbleSort(ary6);
        Sorts.printArray(ary6);
    }
}

