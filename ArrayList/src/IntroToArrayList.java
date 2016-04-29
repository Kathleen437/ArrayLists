import java.util.Scanner;
import java.util.ArrayList;
import java.util.ArrayList;
public class IntroToArrayList
	{

		public static void main(String[] args)
			{
				instantiateArrayList();
			

			}
		public static void instantiateArrayList()
		{
			ArrayList<Double>myArray = new ArrayList<Double>();
			myArray.add(1.29);
			myArray.add(4.37);
			myArray.add(3.16);
			myArray.add(1.15);
			myArray.add(9.28);
			for(int o=0; o<myArray.size(); o++)
				{
			System.out.println(myArray.get(o));
				}
			System.out.println("");
			double sum = 0;
			for (int i=0; i<myArray.size(); i++)
				{
					sum=sum+myArray.get(i);
				}
			System.out.println(sum);
			System.out.println();
			
			myArray.remove(0);
			myArray.add(2.51);
			myArray.add(3.49);
			double sum2 = 0;
			for (int k=0; k<myArray.size(); k++)
				{
					sum2=sum2+myArray.get(k);
				}
			System.out.println(sum2/myArray.size());
		}
		
		
		
	}
