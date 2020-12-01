import java.io.*;
import java.util.*;
public class Goodiesprices{
	public static void main(String[] args)
	{
		String[] nameofItems= {"Fitbit plus","Ipods","Mi Brand","Cult Pass","Macbook Pro","Digital Camera","Alexa","Sandwich Toaster","Microwave Oven","Scale"};
		int[] priceofItems= {7980,22349,999, 2799,229900,11101,9999,2195,9800,4999};
		System.out.println("Number of the employees");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		int difference=0;
		int[] sortpricearray=new int[n];
		for(int i=0;i<n;i++)
		{
			sortpricearray[i]=priceofItems[i];
		}
		Arrays.sort(sortpricearray);
		System.out.println("Here the goodies that are selected for distribution are");
		for(int k=0;k<n;k++) {
			for(int l=0;l<n;l++)
			{
				System.out.println(""+nameofItems[k]+":"+priceofItems[k]);
				break;
			}
			System.out.println();
		}
		difference=sortpricearray[sortpricearray.length-1]-sortpricearray[0];
		
		System.out.println("And the difference between the chosen goodie with highest price and the lowest price is"+difference);	
	}

}