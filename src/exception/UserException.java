package exception;

public class UserException extends Exception{
	public String toString(int a) {
		String res="";
		if(a<30000) {
			res =new String("This is below the min sallary");
		}
		return res;
	}

}
