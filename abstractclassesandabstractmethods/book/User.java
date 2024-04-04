package abstractclassesandabstractmethods.book;

public class User {
	
	String userName="navi123";
	String password="admin1";
	
	public boolean validateUser(String username,String password)
	{
		if(userName.equals(username)&&password.equals(password))
			return true;
		else
			return false;
	}		
		
	
	
	

}
