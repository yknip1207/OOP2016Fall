package OOP_0613_GUI;
import java.awt.*; 
public class BorderExample {
	private Frame f;
	private Button bn, bs, bw, be, bc;

	public BorderExample() {
		f = new Frame("Border Layout");
		bn = new Button("B1");
//		bs = new Button("B2");
//		bw = new Button("B3");
		be = new Button("B4");
		bc = new Button("B5");
	}

	public void launchFrame() {
		//設定在邊邊的會在邊邊，剩下的中間填滿
		f.add(bn, BorderLayout.NORTH);
//		f.add(bs, BorderLayout.SOUTH);
//		f.add(bw, BorderLayout.WEST);
		f.add(be, BorderLayout.EAST);
		f.add(bc, BorderLayout.CENTER);
		f.setSize(200,200);
		f.setVisible(true);
	}

	public static void main(String args[]) {
		BorderExample guiWindow2 = new BorderExample();
		guiWindow2.launchFrame();
	}
}