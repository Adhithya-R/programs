class ArmStrongNumber 
{
	public static void main(String[] args) 
	{
		int num = 153,temp1 = num, temp2 = num,count = 0,sum = 0;
		while (num>0)
		{
			num = num/10;
			count++;
		}
		while (temp1>0)
		{
			int last = temp1%10;
			int prod = 1,x=last, n=count;
			while(n>0)
			{
				prod = prod*x;
				n--;
			}
			sum = sum +prod;
			temp1 = temp1/10;
		}
          if(sum == temp2)
		{
          System.out.println(temp2 + " is an ArmStrong number");
		}
		else
		{
		  System.out.println(" is not an ArmStrong number");
		}		
	}
}
