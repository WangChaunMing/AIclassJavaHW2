package AIclassJavaCH2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p12 {

	public static void main(String[] args) throws IOException
	{
		System.out.println("�п�J��ơG");
		
		BufferedReader br1=	
				new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br1.readLine());
		
		if(num == 1)
			System.out.println("��J���O1");
		else if (num==2)
			System.out.println("��J���O2");
		else 
			System.out.println("�п�J1��2");

	}
}
