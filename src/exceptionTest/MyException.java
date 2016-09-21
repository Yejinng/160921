package exceptionTest;

public class MyException extends Exception {
	private static final long serialVersionUID = -7894534;
	public MyException(){
		super ("MyException Occurs");
	}
	public MyException(String message){
		super(message);
	}
			
}
