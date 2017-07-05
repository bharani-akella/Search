package interview;
import java.util.Scanner;
public class LinearSearchRecursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int size;     
		System.out.println("Enter the size of array");
         Scanner s=new Scanner(System.in);
         size=s.nextInt();
         int a[]=new int[size];
       LinearSearchRecursive ls=new LinearSearchRecursive();
       ls.insert(a, 0, size);
       System.out.println("Enter key to be searched");
       int key=s.nextInt();
       ls.search(a, 0, size, key);
      	}
	public void insert(int array[],int findex,int lindex){
		Scanner s=new Scanner(System.in);
		if(findex==lindex)return;
		System.out.println("Enter element for position "+findex);
		array[findex]=s.nextInt();
		insert(array,findex+1,lindex);
	}
	
	public void search(int array[],int findex,int lindex,int key){
		
		if(findex==lindex){
			System.out.println("Key is not present");
			return;
		}
		
		if(array[findex]==key){
    		 System.out.println(key+" found at position "+(findex));
    		 return;  	
		}
		
		search(array,findex+1,lindex,key);
	}

}
