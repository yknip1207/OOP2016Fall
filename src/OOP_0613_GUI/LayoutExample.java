package OOP_0613_GUI;
import java.awt.*;

public class LayoutExample {
	private Frame f;
	private Button b1;
	private Button b2;
	private Button b3;
	private Button b4;
	private Button b5;

	public LayoutExample() {
		f = new Frame("GUI example");
		b1 = new Button("Press Me");
		b2 = new Button("Don’t press Me");
		b3 = new Button("Button 3");
		b4 = new Button("Button 4");
		b5 = new Button("Button 5");
	}

	public void launchFrame() {
		//建一個新的管理員，以後東西搬進來由Layout manager管理
		//排在一排自動置中，排不下就換行
		f.setLayout(new FlowLayout());
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		//把他們打包，包緊一點
		f.pack();
		f.setVisible(true);
	}

	public static void main(String args[]) {
		LayoutExample guiWindow = new LayoutExample();
		guiWindow.launchFrame();
	}
}

