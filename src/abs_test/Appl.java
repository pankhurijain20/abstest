package abs_test;

public class Appl {

	public static void main(String[] args){
		
	Animal a = Animal.CAT;
	switch(a){

	case CAT:
		System.out.println("cat");
		break;
	case DOG:
		System.out.println("dog");
		break;
	default:
			break;
	}
	System.out.println(Animal.DOG);
	System.out.println(Animal.DOG instanceof Animal);
	System.out.println(Animal.DOG instanceof Enum);
	System.out.println(Animal.DOG.name());
	System.out.println(Animal.DOG.getName());
	System.out.println(Animal.DOG.getClass());
	Animal a1 = Animal.valueOf("CAT");
	System.out.println(a1);
	System.out.println(a);
	}
}
