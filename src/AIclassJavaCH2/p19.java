package AIclassJavaCH2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p19 {
	public static void main(String[] args) throws IOException
	{
		System.out.println("�аݧA�O�k�Ͷ�?");
		System.out.println("�п�JYes��No");
		
		BufferedReader br1=	
				new BufferedReader(new InputStreamReader(System.in));
		
		String str = br1.readLine();
		char letter=str.charAt(0);
		
		if(letter == 'Y' || letter =='y')
			System.out.println("�A�O�k�ͪ�");
		else if(letter == 'n' || letter =='N')
			System.out.println("�A�O�k�ͪ�");
		else
			System.out.println("�п�JY��N");
	}
}
