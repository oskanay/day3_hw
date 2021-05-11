package week3_hw;

public class Main {

	public static void main(String[] args) {
		
		Student student1 =new Student();
		student1.educationalLevel="Lise";
		student1.ıd="15468574";
		student1.mail="adadgaa@gmail.com";
		student1.name="Oskan";
		student1.surName="Aydogdu";
		
		Instructer ınstructer1 =new Instructer();
		ınstructer1.profession="Yazılım Mühendisi";
		ınstructer1.ıd="146748741";
		ınstructer1.mail="engindemirog@gmail.com";
		ınstructer1.name="Engin";
		ınstructer1.surName="Demirog";
	
		UserManager userManager =new UserManager();
		User[] users = {student1,ınstructer1};
		userManager.addMultiple(users);
		
		
	}

}
