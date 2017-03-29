package OOP_0613_GUI;
import java.awt.Color;
import java.awt.Frame;

public class FrameExample {

	private Frame f;
	public FrameExample(){
		f = new Frame("Hello");
	}
	
	public void launchFrame(){
		f.setSize(500, 170);
		f.setBackground(Color.CYAN);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FrameExample guiW = new FrameExample();
		guiW.launchFrame();
	}

}
