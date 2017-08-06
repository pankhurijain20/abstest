package abs_test;

public abstract class Machine {
	private int id;
	public void setId(int id){
		this.id=id;
	}
	public abstract void run();
}
