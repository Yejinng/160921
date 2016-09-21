package chapter02;

public class StudentTest {

	public static void main(String[] args) {
		Person p = new Student();
		Person p2 = new Student(10);

		//Student s = new Student();
		//Person p3 = s;
		//이거랑 같음
	Person p3 = new Student();
		
		
		Student s= (Student)p3;	//down casting 명시적(explicit)캐스팅 해야한다
		
		Person p4 = s;			//up casting 암시적(implicit)캐스팅 안해줘도됨

	}

}
