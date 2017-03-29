package OOP_HW8;
import java.text.DecimalFormat;
import java.util.ArrayList;


public class SimpleCalculator {
	private double result;
	private int _switch = 1;
	private int count = 0;
	private String operator = "";
	private String operand = "";
	private double value = 0.0;
	private boolean exception = false;
	private String errorMsg = "";
	
	//TODO: any other variables are optional here.//TODO: any other variables are optional here.
	public void calResult(String cmd) throws UnknownCmdException {
	// Input: A 𝚂𝚝𝚛𝚒𝚗𝚐 which is the command// Input: A String which is the command
	// 　that the user just entered.// 　that the user just entered.
		this._switch = 0;
		ArrayList<String> operatorList = new ArrayList<String>();
		operatorList.add("+");
		operatorList.add("-");
		operatorList.add("*");
		operatorList.add("/");
		
		try{
			if(!cmd.matches("[\\S]+[ ][\\S]+"))
//			if(cmd.split("[ ]").length != 2)
				throw new UnknownCmdException("Please enter 1 operator and 1 value separated by 1 space");
			else{
				String[] cmd_split = cmd.split(" ");
				this.operator = cmd_split[0];
				this.operand = cmd_split[1];
//				System.out.println("{" + this.operator + "/" + this.operand+"}");
				this.value = Double.parseDouble(this.operand);
//				System.out.println("thisvalue=" + this.value);
//				if (!operand.matches("[0-9]*[.]?[0-9]+") && !operatorList.contains(this.operator)){
////					System.out.println("UnknownCmdException(both invalid);");
//					throw new UnknownCmdException(new String(this.operator + " is an unknown operator and " + operand + " is an unknown value"));
//				}
//				else if(!operand.matches("[0-9]*[.]?[0-9]+")){
				
//					System.out.println("throw new UnknownCmdException(invalid value);");
//					throw new UnknownCmdException(new String(operand + " is an unknown value"));
//				}
				if(!operatorList.contains(this.operator)){
////					System.out.println("throw new UnknownCmdException(invalid operator);");
					throw new UnknownCmdException(new String(this.operator + " is an unknown operator"));
				}
//				if(isNumeric(this.operator, operand)){
				else{
//					this.value = Double.parseDouble(operand);
					
					if (this.operator.equals("+"))
						this.result += this.value;
					else if (this.operator.equals("-"))
						this.result -= this.value;
					else if (this.operator.equals("*"))
						this.result *= this.value;
					else{
						if(this.value == 0.0)
							throw new UnknownCmdException("Can not divide by 0");
						else
							this.result /= this.value;
					}
					this.count++;
				}
			}
		
			
		}catch( NumberFormatException e){
			if(operatorList.contains(this.operator))
				throw new UnknownCmdException(new String(this.operand + " is an unknown value"));
			else
				throw new UnknownCmdException(new String(this.operator + " is an unknown operator and " + this.operand + " is an unknown value"));
		}catch(UnknownCmdException e){
			this.exception = true;
			this.errorMsg = e.getMessage();
		}
	}

	public String getMsg() {
		//打開
		if(this._switch == 1)
			return "Calculator is on. Result = " + round(this.result);
		//要關了
		else if(this._switch == -1)
			return "Final result = " + round(this.result);
		//運算
		else{
			if (this.exception){
				this.exception = false;
				return this.errorMsg;
			}
			else{
				//第一次運算
				if(this.count == 1)
					return "Result " + this.operator + " " + round(this.value) + " = " + round(this.result) + ". New result = " + round(this.result);
				//之後的運算
				else
					return "Result " + this.operator + " " + round(this.value) + " = " + round(this.result) + ". Updated result = " + round(this.result);
			}
		}
		
	// Output: Returns the result of the command,// Output: Returns the result of the command,
	// 　or throws an exception with an error message in it.// 　or throws an exception with an error message in it.
	// 　The output format is described in “Description.”// 　The output format is described in “Description.”
	}

	public boolean endCalc(String cmd) {
		if (cmd.toLowerCase().equals("r")){
			this._switch = -1;
			return true;
		}
		else 
			return false;
		
	// Input: A 𝚂𝚝𝚛𝚒𝚗𝚐 which is the command// Input: A String which is the command
	// 　that the user just entered.// 　that the user just entered.
	// Output: Returns 𝚝𝚛𝚞𝚎 if the input is a single letter "𝚛" or "𝚁".// Output: Returns true if the input is a single letter "r" or "R".
	}
	
	public String round(double x){
		DecimalFormat df = new DecimalFormat("0.0#");
//		df.setMaximumFractionDigits(8);
		return df.format(x);
	}

	

	// TODO: any other methods are optional here.// TODO: any other methods are optional here.
}