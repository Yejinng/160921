package exceptionTest;

import java.util.Scanner;

public class ExceptionTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("파일을 열었음>>");
		
		
		int a = scanner.nextInt();
		int k = 0;
		
		try {
			k = 1000 / a;
			System.out.println("more code...");
		} catch (ArithmeticException ex) {
			//1.로그 남기기(파일)
			//
			//
			//2.사과(정상종료)
			System.out.println("죄송합니다. 예기치않은 오류가 발생했습니다:(");
			//3. 이거라도 못하겠으면
			//ex.printStackTrace();
			//이거라도 써준다			//이거표시하면 어디서 에러났는지 표시해줌
			return;					//catch문에서  예외발생해도 안해도 return했을때 finally는 실행된다
			
		}finally {
			System.out.println("자원정리를 해야함");
		}
		System.out.println("결과는: " + k);
	}

}
