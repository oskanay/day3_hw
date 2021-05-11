package week3_hw;

public class InstructerManager extends UserManager{
	public void add(Instructer ınstructer) {
		System.out.println("Branşı= "+ınstructer.profession+" olarak kaydedildi.");
}
	public void addMultiple(Instructer[] ınstructers) {
		for(Instructer ınstructer : ınstructers) {
			add(ınstructer);
		}			
}}