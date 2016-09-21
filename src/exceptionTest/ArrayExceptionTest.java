package exceptionTest;

public class ArrayExceptionTest {

	public static void main(String[] args) {
		int[] a = new int[5];

		
		for (int i = 0; i <= 5; i++) {	//i<5을 잘 못쓴것 논리적오류는 예외가 아니다
			a[i] = i;					//시스템 외적인 오류를 위해 try catch를 쓰는 것이다
		}
	}

}
