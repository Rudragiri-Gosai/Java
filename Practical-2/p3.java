class p3
{
	public static void main (String args[])
	{
		add a = new add();
		add b = new add(4,4);
	}
} 

class add
{
	add()
	{
		System.out.println("Add :: "+(2+7));
	}
	add(int a, int b)
	{
		System.out.println("Add :: "+(a+b));
	}
}