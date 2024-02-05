package oop.collection;
import java.util.ArrayList;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		List list = new ArrayList();
//		list.add(11);
//		list.add("ami ami");
//		for(Object object:list) {
//			System.out.println(object.toString());
//		}
		
		ArrayList<Student> studentList = new ArrayList<Student>();
		Student student2003 = new Student();
		student2003.setStudentId(2003);
		student2003.setStudentName("Miran");
		student2003.setAge(23);
		student2003.setSemester("8th");
		
		studentList.add(student2003);
		
		Student student20033 = new Student();
		student20033.setStudentId(20033);
		student20033.setStudentName("MiranIbrahim");
		student20033.setAge(33);
		student20033.setSemester("8th");
		
		studentList.add(student20033);
		
//		Student for 20034
		Student student20034 = new Student();
		student20034.setStudentId(20034);
		student20034.setStudentName("MiranIbrahimMoeenuddin");
		student20034.setAge(33);
		student20034.setSemester("8th");
		
		studentList.add(student20034);
		
		for(Student std: studentList) {
			System.out.println(std.getStudentId());
			System.out.println(std.getStudentName());
			System.out.println(std.getAge());
			System.out.println(std.getSemester());
			
			
		}
	}

}
