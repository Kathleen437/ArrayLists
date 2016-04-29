import java.util.ArrayList;
import java.util.Collections;

public class ArrayListChallenges
	{

		public static void main(String[] args)
					{
						takingTemp();
					

					}
				public static void takingTemp()
				{
					ArrayList<Double> myArray = new ArrayList<Double>();
					myArray.add(98.6);
					myArray.add(99.0);
					myArray.add(89.3);
					myArray.add(88.4);
					myArray.add(89.7);
					myArray.add(90.1);
					myArray.add(95.6);
					myArray.add(100.3);
					myArray.add(101.2);
					myArray.add(94.5);
					System.out.println("The temps are...");
					for(int o=0; o<myArray.size(); o++)
						{
					System.out.println(myArray.get(o) + " degrees Fahrenheit");
						}
					System.out.println("");
						
					System.out.println("Temps above 98.6 ...");
					int counter=0;
					for(int i=0; i<myArray.size(); i++)
						{
						if (myArray.get(i)>98.6)
								{
									System.out.println(myArray.get(i));
									counter++;
								}
						else if (myArray.get(i)==98.6)
								{
									System.out.println(myArray.get(i));
									counter++;
								}
						}
					System.out.println(counter);
					System.out.println("");
					for (int i=0; i<myArray.size(); i++)
						{
							System.out.println(myArray.get(i));
							System.out.println((myArray.get(i)-32)/1.8 + " degrees Celsius");
						}
					System.out.println("");
					
					System.out.println("Temps below 98.6...");
					for (int k=myArray.size()-1; k>=0; k--)
						{
							if (myArray.get(k)>=98.6)
								{
									myArray.remove(k);
								}
						}
					for(int j=0; j<myArray.size(); j++)
						{
					System.out.println(myArray.get(j));
						}
					
					System.out.println("");
					Collections.sort(myArray);
					System.out.println("The lowest temp is ... " + myArray.get(0));
					System.out.println("The highest temp is... " + myArray.get(myArray.size()-1));
					
				}	
				
				
				
	}
