package week3_hw;

public class UserManager {
public void add(User user) {
	System.out.println("Numara= " + user.�d + " olarak kaydedildi.");
	System.out.println("Mail= " + user.mail + " olarak kaydedildi.");
	System.out.println("�sim= " + user.name + " olarak kaydedildi.");
	System.out.println("Soyisim= " + user.surName + " olarak kaydedildi."); }
	public void addMultiple(User[] users) {
		for(User user : users) {
			add(user);
		}//base/super class
}
}
