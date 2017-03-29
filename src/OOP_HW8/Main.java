package OOP_HW8;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws UnknownCmdException{
		SimpleCalculator cal = new SimpleCalculator();

		Scanner scanner = new Scanner(System.in);
		String cmd = null;

		System.out.println(cal.getMsg());
		while (scanner.hasNextLine()) {
			cmd = scanner.nextLine();
			try {
				if (cal.endCalc(cmd)) {
					break;
				}

				cal.calResult(cmd);
				System.out.println(cal.getMsg());
			} catch (UnknownCmdException e) {
				System.out.println(e.getMessage());
			}
		}

		System.out.println(cal.getMsg());
		scanner.close();
	}
}