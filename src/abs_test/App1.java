package abs_test;
class Temp implements AutoCloseable{

	@Override
	public void close() throws Exception {
		
		System.out.println("closing");
		//throw new Exception();
	}
	
}
public class App1 {

	public static void main(String[] args) {
		
		try(Temp t = new Temp()){
	
		}catch(Exception e){
			System.out.println("efr");
		}
	}

}
