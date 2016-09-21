package exceptionTest;

import java.io.IOException;

public class MyClass {

	public void dangerousMethod() throws MyException, IOException {
		
		System.out.println("normal...");
		boolean isDanger = true;
		if( isDanger ){
			//예외상황 발생
			//ex)네트워크오류 , io오류 등
			throw new MyException("예외상황 발생");
		}
			System.out.println("normal...");
	}
}
