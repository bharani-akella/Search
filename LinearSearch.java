package interview;
import java.util.Scanner;
public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int size,a[],key;      
		Scanner s=new Scanner(System.in);
		
                System.out.println("Enter the size of array");
                size=s.nextInt();
                a=new int[size];
               
                for(int i=0;i<size;i++){
                	System.out.println("Enter element at position "+i);
                	a[i]=s.nextInt();
                }
                
                System.out.println("Enter the key to be searched...  ");
                key=s.nextInt();
                
                for(int j=0;j<size;j++){
                	if(a[j]==key){
                		System.out.println(key+" found at position "+j);
                		return;
                	}
                }
                System.out.println("Key is not present");
	}

}
