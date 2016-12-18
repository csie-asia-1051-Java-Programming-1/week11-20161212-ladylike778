package hw;
/*
 * Date: 2016/12/12
 * Author: 105021037  ???
 */
import java.util.*;
public class hw01 {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		String n=scn.nextLine();
		int p=scn.nextInt();
		char[]s=n.toCharArray();
		for(int i=0;i<s.length;i++){
			char a=s[i];
			int b=a;
			if(b<65){
				b=b-p;
			}else if((b+p)>122){
				b=b-123+97;
			}else if((b+p)>90&&(b+p)<97){
				b=b-91+65;
			}
			System.out.print((char)(b+p));
		}

	}
}