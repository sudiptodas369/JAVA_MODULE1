class Searching
{
	public static void main(String[] args)
	{
		int[] arr={13,12,14,12,15,18,16};
		int val=18;
		boolean flag=false;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==val)
			{
				System.out.println(val+" found at index "+i);
				flag=true;
			}
		}
		if(flag==false)
		{
			System.out.println(val+" is not found");
		}
	}
}