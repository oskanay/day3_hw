package week3_hw;

public class InstructerManager extends UserManager{
	public void add(Instructer �nstructer) {
		System.out.println("Bran��= "+�nstructer.profession+" olarak kaydedildi.");
}
	public void addMultiple(Instructer[] �nstructers) {
		for(Instructer �nstructer : �nstructers) {
			add(�nstructer);
		}			
}}