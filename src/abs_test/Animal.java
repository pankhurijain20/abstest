package abs_test;

public enum Animal {

	CAT("tom"),DOG("tomy"),MOUSE("jerry");
	
	public String name;
	Animal(String name){
	/*	System.out.printf(" enum "+name());
		System.out.println();
		this.name=name();*/
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public String toString(){
		return ("this is "+name);
	}
}
