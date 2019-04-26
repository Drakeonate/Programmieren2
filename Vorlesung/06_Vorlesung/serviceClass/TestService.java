package serviceClass;

public class TestService {

	public static void main(String[] args) {
		IOService.write("Es lebt", "Huhu.txt");
		
		System.out.println(IOService.read("Huhu.txt"));
		
		Sonne sonne = new Sonne("Die Sonne scheint", 24.9, new Helium("Helium macht eine schöne Stimme", 2));
		IOService.writeObject("MyObject.txt", sonne);
		System.out.println(sonne);
		
		Object object = IOService.readObject("MyObject.txt");
		
		if(object instanceof Sonne) {
			Sonne readSonne = (Sonne) object;
			System.out.println(readSonne);
		}
		
	}
}
