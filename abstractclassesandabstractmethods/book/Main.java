package abstractclassesandabstractmethods.book;

import java.util.Scanner;

public class Main {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		Book book=new Book("JAVA","JAMES",21,2010);
		
		if(new LogIn().login())
		{
			System.out.println("MODIFY THE BOOKDETAILS:");
			boolean flag=true;
			while(flag)
			{
				System.out.println("PRESS 1 => MODIFY THE BOOK NAME\n"+"PRESS 2 => MODIFY THE BOOK AUTHOR\n"+"PRESS 3 => MODIFY THE PUBLICATION YEAR\n"+"PRESS 4 => MODIFY THE AVAILABLE COUNT\n"+"PRESS 5 => EXIT");
				int choice=sc.nextInt();
				switch(choice)
				{
				case 1:
					System.out.println("ENTER THE BOOK NAME:");
					String bookName=sc.next();
					book.setTitle(bookName);
					System.out.println("BOOK NAME CHANGED SUCCESSFULLY");
					break;
				case 2:
					System.out.println("ENTER THE BOOK AUTHOR:");
					String bookAuthor=sc.next();
					book.setAuthor(bookAuthor);
					System.out.println("AUTHOR NAME CHANGED SUCCESSFULLY");
					break;
				case 3:
					System.out.println("ENTER THE PUBLICATION YEAR:");
					int pubYear=sc.nextInt();
					book.setPubYear(pubYear);
					System.out.println("PUBLICATION YEAR CHANGED SUCCESSFULLY");
					break;
				case 4:
					System.out.println("ENTER THE AVAILABLE BOOK:");
					int ab=sc.nextInt();
					book.setAvailableBook(ab);
					System.out.println("AVAILABLE BOOKS CHANGED SUCCESSFULLY");
					break;
				case 5:
					flag=false;
					System.out.println("THANK YOU");
					break;
				}
				
			}
				}
		else
		{
			System.out.println("INVALID CREDENTIALS");
			new LogIn().login();
	     }
		
		
	}
}
