package AIclassJavaCH2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p14 {

	public static void main(String[] args) throws IOException
	{
		System.out.println("�п�J��ơG");
		
		BufferedReader br1=	
				new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br1.readLine());
		
		switch(num)
		{
			case 1:
			{
				System.out.println("��J���O1");
				break;
			}
			case 2:
			{
				System.out.println("��J���O2");
				break;
			}
			default:
			{
				System.out.println("�п�J��1��2");
				break;
			}
		}
		
	}
}
