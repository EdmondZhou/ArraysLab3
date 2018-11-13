import java.util.Arrays;

public class LotsOfCopies {

	public static void main(String[] args) {
		int num = 7;
		String strMain = "APCS";
		int[] arrMain = {1,2,3,4,5};
		changeMe(num, strMain, arrMain);
		System.out.println("num: " + num);
		System.out.println("strMain: " + strMain);
		System.out.println("arrMain: " + Arrays.toString(arrMain));
		part2WithInts();
		part2WithStrings();
		part2WithArrays();
	}
	public static void part2WithStrings() {
		String a = "Hi";
		String b = a;
		a = "Bye";
		System.out.println("a: " + a);
		System.out.println("b: " + b);
	}
	
	public static void part2WithInts() {
		int a=7;//a = start value
		int b=a;//b = a
		a=1;//a = new value
		System.out.println("a: " + a);
		System.out.println("b: " + b);
	}
	
	public static void part2WithArrays() {
		int[] array = {1,2,3};//a = start value
		int[] array2 =array;//b = a
		array[1]=5;//a = new value
		System.out.println("a: " + Arrays.toString(array));
		System.out.println("b: " + Arrays.toString(array2));
	}
	
	
	
	public static void changeMe(int x,String str,int[] arr) {
		x =229886;
		str += str;
		arr[4] = 100;		
	
	}
}