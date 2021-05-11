package week3_hw;

public class StudentManager extends UserManager {
	public void add(Student student) {
		System.out.println("Eğitim Durumu= "+ student.educationalLevel +" olarak kaydedildi.");}
		public void addMultiple(Student[] students) {
			for(Student student : students) {
				add(student);
			}			
}
}