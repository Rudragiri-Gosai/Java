class p5
{
	public static void main(String args[])
	{
		add a = new add(3,4);
		a.Print();

	}
	
}

class add
{
	int a,b;
	add(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
	public void Print()
	{
		System.out.println("Add :: "+(a+b));
	}
	
	
}