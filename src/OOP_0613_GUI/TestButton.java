package OOP_0613_GUI;

import java.awt.*;
import java.awt.event.ActionListener;
public class TestButton {
	private Frame f;
	private Button b1, b2;
	public TestButton() {
		f = new Frame("Test");
		b1 = new Button("Press Me!");
		b1.setActionCommand("Button1Pressed");
		b2 = new Button("Another");
		b2.setActionCommand("Button2Pressed");
	}
	public void launchFrame() {
		ActionListener h = new ButtonHandler();

		b1.addActionListener(h);   		//其實就是註冊,h(消防隊)向b1(住家)註冊，告訴b1一旦發生event要通知h
		b2.addActionListener(h);
		f.add(b1,BorderLayout.CENTER);
		f.add(b2,BorderLayout.EAST);
		f.pack();
		f.setVisible(true);
	}
	public static void main(String args[]) {
		TestButton guiApp = new TestButton();
		guiApp.launchFrame();
	} 
	
	//程式的架構
	//b1.addActionListener(h)，先把 ButtonHandler這個物件的reference傳進btn物件裡面(btn裡面的ref，記載h是誰)
	//再把這個btn塞進去frame（透過f.add(b1)） 
 
	//run的時候：
	//btn被按下去有兩步驟被隱藏
	//第一步：b被按下的同時，產生一個ActionEvent：ActionEvent e = new ActionEvent();  
	//第二步：b把e傳給ButtonHandler的actionPerformed()
}
