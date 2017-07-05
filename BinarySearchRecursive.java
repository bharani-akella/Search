package interview;
import java.util.Scanner;
public class BinarySearchRecursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
               int key,a[],size,low,high;
               System.out.println("Enter the size of array");
               size=s.nextInt();
               a=new int[size];
               low=0;
               high=size-1;
               
               for(int i=0;i<size;i++){
            	   System.out.println("Enter element at position "+i);
            	   a[i]=s.nextInt();
               }
               
               System.out.println("Enter the key to be searched");
               key=s.nextInt();
               
               BinarySearchRecursive bs=new BinarySearchRecursive();
               bs.search(a, low, high, key);
               
	}
	
	public void search(int a[],int low,int high,int key){
		int mid;
		if(low>high){
			System.out.println("Key not present");
			return;
		}
		
		mid=(low+high)/2;
		if(key==a[mid]){
			System.out.println(key+" found at position "+mid);
			return;
		}
		
		else if(key<a[mid]){
			search(a, low, (mid-1), key);
		}
		
		else if(key>a[mid]){
			search(a,mid+1,high,key);
		}
		
	}

}
