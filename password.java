import java.util.Scanner;

 class password 
 {

	public static void main(String[] args)
	{
		Scanner r=new Scanner(System.in);
		System.out.println("Enter the length");
		int len=r.nextInt();
		for(int i=0;i<len;i++)
		{
			System.out.println((char)((int)(Math.random()*93+33)));
		}
	}
 }
		