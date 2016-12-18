package ex;
/*
 * Date: 2016/12/12
 * Author: 105021037  ???
 */
import java.util.*;
public class ex01 {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int dataSize =scn.nextInt();
		int save []=new int [dataSize];
		int x=0;
		if(dataSize>10||dataSize<1){
			System.out.println("erro");
		}
		while(x!=dataSize){//Here~~~~~~~~~~~~~~~~~~~~~~
			int data1 []=new int [3];
		
			for(int i=0;i<3;i++){
				data1[i]=scn.nextInt();
			}
			boolean flag = true;
			int y=0;
			while(flag){
				for(int i=1;i<3-1;i++){
					if(data1[i]>data1[i+1]){
						System.out.println("您輸入的第"+i+"筆資料有錯: ");
						data1[i]=scn.nextInt();
					}else if(data1[i]>data1[0]){
						System.out.println("您輸入的第"+i+"筆資料有錯: ");
						data1[i]=scn.nextInt();
					}else{
						flag=false;
					}
				}
			}
			int data2 []=new int [data1[2]];
		
			for(int i=0;i<data1[2];i++){
				data2[i]=scn.nextInt();
			}	
			for(int i=0;i<data2.length-1;i++){
				for(int j=0;j<data2.length-1;j++){
					if(data2[j+1]>data2[j]){
						int change=data2[j+1];
						data2[j+1]=data2[j];
						data2[j]=change;
					}
				}
			}
			int sum=0;
			for(int i=data2.length-1;i>=data2.length-data1[1];i--){
				sum+=data2[i];
			}if (sum<data1[0]){
				save[x]=sum;
			}else{
				save[x]=-1;
			}x++;
		}for(int i=0;i<dataSize;i++){
			if(save[i]>0){
				System.out.println(save[i]);
			}else if(save[i]==-1){
				System.out.println("impossible");
			}
		}
		
	}}