package com.simplemathsolver.webservices;
import javax.jws.WebService;

@WebService
public class Webservicemath {
	
	public String checkprime(int n)
	{
		//int no = Integer.parseInt(n);
		String result = "hello";
		
		result = n + " is"+  (isPrime(n)?"":" not ") + "a prime number.";
		
		return result;
	}

	public String findprimeseries(int num) {
		// TODO Auto-generated method stub
		//int no = Integer.parseInt(num);
		String data = "";
		
		data += "---- List of prime numbers ----";
		data += "\n 1";
		for(int i=2;i<=num;i++)
		{
				data += isPrime(i)? "\n "+ i :"" ;
		}
		
		return data;
	}
	
	
	public boolean isPrime(int no)
	{
		if(no == 1)
		{
			return false;
		}
		else if(no == 2)
		{
			return true;
		}
		else
		{
			int count = 0;
			for(int i=1;i<=no/2;i++)
			{
					if(no%i == 0)
					{
						count++;
					}
						
			}
			if(count > 1)
			{
				return false;
			}
			else
			{
				return true;
			}		
		}
	}
	
	

}
