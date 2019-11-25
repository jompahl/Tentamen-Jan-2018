package jan2018;

public class Test {

	public static void main(String[] args) {
		Parrot birdy = new Parrot();
		birdy.setName("Birdy");
		Dog fido = new Dog();
		fido.setName("Fido");
		 fido.talk();
	 birdy.talk();
		 fido.beQuiet();
		 fido.talk();
		 birdy.talk();
		 birdy.learn("Birdy want a cracker");
		 birdy.talk();
	fido.setName("Doggy");
		birdy.whatsYourName();
		fido.whatsYourName();
		
		
			String namn = "Mats";
			System.out.println("1. "+namn);
			change(namn);
			System.out.println("3. "+namn);
			}
			public static void change(String namn) {
			namn = "Erdogan";
			System.out.println("2. "+namn);
			}
			
}
