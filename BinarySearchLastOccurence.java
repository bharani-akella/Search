package interview;
import java.util.Scanner;
public class BinarySearchLastOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
              int key,a[],size,first,last;
              System.out.println("Enter the size of array");
              size=s.nextInt();
              a=new int[size];
              last=size-1;
              first=0;
              
              for(int i=0;i<size;i++){
            	  System.out.println("Enter element at position "+i);
            	a[i]=s.nextInt();  
              }
              
              System.out.println("Which element's first occurence is to be found out?");
              key=s.nextInt();
              
              BinarySearchLastOccurence bs=new BinarySearchLastOccurence();
              int last_Occurence=bs.lastOccurence(a, first, last, key);
              if(last_Occurence!=-1){
            	  System.out.println("The first occurence is at position "+last_Occurence);  
              }else{
            	  System.out.println("Key is not present");
              }
              
	}
	
	public int lastOccurence(int a[],int first,int last,int key){
		int result=-1;
		int mid;
		while(first<=last){
			mid=(first+last)/2;
			if(key==a[mid]){
				result=mid;
				first=mid+1;
			}
			
			else if(key<a[mid]){
				last=mid-1;
			}
			
			else if(key>a[mid]){
				first=mid+1;
			}
		}
		
		return result;
	}
	
	

}
