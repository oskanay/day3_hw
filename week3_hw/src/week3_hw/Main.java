package week3_hw;

public class Main {

	public static void main(String[] args) {
		
		Student student1 =new Student();
		student1.educationalLevel="Lise";
		student1.�d="15468574";
		student1.mail="adadgaa@gmail.com";
		student1.name="Oskan";
		student1.surName="Aydogdu";
		
		Instructer �nstructer1 =new Instructer();
		�nstructer1.profession="Yaz�l�m M�hendisi";
		�nstructer1.�d="146748741";
		�nstructer1.mail="engindemirog@gmail.com";
		�nstructer1.name="Engin";
		�nstructer1.surName="Demirog";
	
		UserManager userManager =new UserManager();
		User[] users = {student1,�nstructer1};
		userManager.addMultiple(users);
		
		
	}

}
