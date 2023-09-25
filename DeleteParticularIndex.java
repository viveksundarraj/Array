package ArrayConcept;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteParticularIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a[]= {-1,2,3,4,2,1,2};
		System.out.println("Enter the index number");
		int index=s.nextInt();
		a[index]=0;
		int[] b=new int[a.length-1];
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=0)
			{
				b[count++]=a[i];
				
			}
		}
		System.out.println(Arrays.toString(b));
		
	}

}
