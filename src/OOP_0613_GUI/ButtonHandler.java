package OOP_0613_GUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//implement ActionListener這個interface


//ButtonHandler裡面只有一個method: actionPerformed，帶一個參數ActionEvent
public class ButtonHandler implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		System.out.println("Action occurred");
		System.out.println("Button’s command is: "+ e.getActionCommand());
	}
}