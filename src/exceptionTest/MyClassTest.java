package exceptionTest;

import java.io.IOException;

public class MyClassTest {

	public static void main(String[] args) {
		MyClass myClass = new MyClass();
		
		try {
			myClass.dangerousMethod();
		} 
//		  catch (IOException e) {
//			// TODO Auto-generated catch block
//			System.out.println("오류발생");
//			e.printStackTrace();
//		} catch(MyException e){
//			e.printStackTrace();
//		}
		catch (Exception e){
			e.printStackTrace();		//위에 주석처럼 하지않고 더 간단하게 
										//다 Exception을 상속받은 애들이니까
			
		//catch (IOException | MyException e)	{
		//	e.printStackTrace():
		//이렇게 해도됨
		}

	}

}
