package interview;
import java.util.Scanner;
public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
               int first,last,size,a[],mid,key;
               Scanner s=new Scanner(System.in);
               System.out.println("Enter size of array");
               size=s.nextInt();
               first=0;
               last=size-1;
               a=new int[size];
               
               for(int i=0;i<size;i++){
            	   System.out.println("Enter position at "+i);
            	   a[i]=s.nextInt();
               }
               
               System.out.println("Enter the key value to be searched..");
               key=s.nextInt();
               
               while(first<=last){
            	   mid=(first+last)/2;
            	   if(key==a[mid]){
            		   System.out.println(key +" found at position "+mid);
            		   return;
            	   }
            	   
            	   else if(key<a[mid]){
            		   last=(mid-1);
            	   }
            	   
            	   else if(key>a[mid]){
            		   first=mid+1;
            	   }
               }
               
               System.out.println("Key not present");
               
	}

}
