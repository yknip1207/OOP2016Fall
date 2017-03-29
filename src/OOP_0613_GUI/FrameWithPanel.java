package OOP_0613_GUI;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;

public class FrameWithPanel {

	private Frame f;
	private Panel p;
	public FrameWithPanel(String title){
		f = new Frame(title);
		p = new Panel();
	}
	
	public void launchFrame(){
		f.setSize(500, 200);
		f.setBackground(Color.CYAN);
		f.setLayout(null);
		
		
		p.setSize(100, 100);
		p.setBackground(Color.DARK_GRAY);
		f.add(p);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FrameWithPanel guiW = new FrameWithPanel("Frame with Panel");
		guiW.launchFrame();
	}

}
