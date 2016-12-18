package ex;
/*
 * Date: 2016/12/12
 * Author: 105021037 ???
 */
import java.util.*;
public class ex02 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("½Ð¿é¤J¼Æ¦r: ");
		String str = scn.nextLine();
		String a[]=(str.split(" "));
		int sun=0;
		int data[]=new int [a.length];
		for(int i=0;i<a.length;i++){
			data[i]=Integer.valueOf(a[i]);
			
			sun+=data[i];
		}
		System.out.println("\nSize: "+data.length);
		System.out.println("Avg: "+(sun/3));

	}
}