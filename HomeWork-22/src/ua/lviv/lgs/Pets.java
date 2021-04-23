package ua.lviv.lgs;

public class Pets {
	public static void main(String[] args) {
		
		Entroducing cow = () -> System.out.println("ί κξπξβΰ- Μσσσ-Μσσσ");
		Entroducing cat = () -> System.out.println("ί κ³ς- Μÿσσσ-Μÿσσσ");
		Entroducing dog = () -> System.out.println("ί οερ - Γΰσσσ-Γΰσσσ");
		
		cow.voice();
		cat.voice();
		dog.voice();
		
		
	}

}

interface Entroducing{
	void voice();
}