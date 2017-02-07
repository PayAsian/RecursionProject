package model;

public class RecursionTool 
{
	public double calculateFactorial(double currentNumber)
	{
		if(currentNumber == 0 || currentNumber == 1)
		{
			return 1;
		}
		else
		{
			return calculateFactorial(currentNumber - 1) * currentNumber;
		}
	}
	
	public int calculateFibonacci(int currentNumber)
	{
		if(currentNumber == 0 || currentNumber == 0)
		{
			return 1;
		}
		else
		{
			return calculateFibonacci(currentNumber - 1) + calculateFibonacci(currentNumber -2);
		}
	}
	
	public int calculateIterativeFIb(int n)
	{
		int f1 = 0;
		   int f2 = 1;
		   int fn;
		   for ( int i = 2; i < n; i++ )
		   {
		      fn = f1 + f2;
		      f1 = f2;
		      f2 = fn;
		   }
		   
		   return calculateIterativeFIb(0);
	}
	
	public int calculateIterativeFact(int N)
	{
		int product = 1;
		  for ( int j=1; j<=N; j++ )
		    product *= j;
		  return product;
	}
}
