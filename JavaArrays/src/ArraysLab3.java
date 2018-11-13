import java.util.Arrays;

public class ArraysLab3 {
	public static void main(String[] args) {
		int[] a1 = {5,10,15,20,25,30,40};
		int[] a2 = {7,14,21,28,35,42,49,56};
		
		int[] sumArr = sum(a1,a2);
		System.out.println(Arrays.toString(sumArr));
		
		int appendNum = 200;
		int[] appendArr = append(a1,appendNum);
		System.out.println(Arrays.toString(appendArr));
		
		int removeidx =5;
		int[] removeArr = remove(a2,removeidx);
		System.out.println(Arrays.toString(removeArr));
		
		int sumOfEvens = sumEven(appendArr);
		System.out.println(sumOfEvens);
		
		
		rotateRight(a1);
		System.out.println(Arrays.toString(a1));
	}

	public static int[] sum(int[] arr1, int[] arr2) {
		int[] sumarray = new int[arr1.length];
		for(int i= 0; i < arr1.length;i++) {
			sumarray[i] = arr1[i]+arr2[i];
		}
		return sumarray;
	}
	public static int[] append(int[] arr,int num) {
		int[] returnarray= new int[arr.length+1];
		for(int i= 0; i < arr.length; i ++) {
			returnarray[i]=arr[i];
		}
		returnarray[arr.length]= num;
		return returnarray;
	}
	public static int[] remove(int[] arr, int idx) {
		int[] removearray = new int[arr.length-1];
		for(int i= 0; i < idx && i<arr.length; i++){
			removearray[i]= arr[i];
		}
		for(int i= (idx + 1); i > idx && i < arr.length; i++) {
			removearray[i-1]= arr[i];
		}
		return removearray;
	}
	public static int sumEven(int[] arr) {
		int sum = 0;
		for(int i = 0; i < arr.length; i+=2 ) {
			sum += arr[i];
		}
		return sum;
	}
	public static void rotateRight(int[] arr) {
		int lastint = arr[arr.length-1];
		for(int i = arr.length-2; i >= 0 ; i-- ){
			arr[i+1] = arr[i];
		}
		arr[0] = lastint;
	}
}