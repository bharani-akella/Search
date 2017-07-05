package interview;
import java.util.Scanner;
public class BinarySearchCountofKey {

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
              
              System.out.println("Which element's count is to be found out?");
              key=s.nextInt();
              
              BinarySearchCountofKey bs=new BinarySearchCountofKey();
            
              int key_Count=bs.count(a, first, last, key);
              
              if(key_Count!=-1){
            	  System.out.println(key+" is present "+key_Count+" times");
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
	
	public int firstOccurence(int a[],int first,int last,int key){
		int result=-1;
		int mid;
		while(first<=last){
			mid=(first+last)/2;
			if(key==a[mid]){
				result=mid;
				last=mid-1;
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

	public int count(int a[],int first,int last,int key){
		int first_occurence=firstOccurence(a, first, last, key);
		int last_occurence=lastOccurence(a, first, last, key);
		
		int result=(last_occurence-first_occurence+1);
		return result;
		
	}

}
