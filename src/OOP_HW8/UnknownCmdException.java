package OOP_HW8;

public class UnknownCmdException extends Exception {
	private String errorType;
	UnknownCmdException(){
		
	}
	
	UnknownCmdException(String errorType){
		this.errorType = errorType;
	}
	
	public String getMessage(){
		return this.errorType;
	}
}



