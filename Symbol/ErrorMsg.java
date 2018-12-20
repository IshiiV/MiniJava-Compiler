package symbol;

public class ErrorMsg {

	private boolean anyErrors;
	public ErrorMsg(){
		anyErrors = false;
	}
	public void complain(String msg){
		anyErrors = true;
		System.out.println(msg);
	}	
}