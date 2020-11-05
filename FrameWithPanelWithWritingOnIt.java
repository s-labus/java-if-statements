// Straxinja Labus on 04/23/2020 
// Yes, I was, it's just the comment, explaining what code does

import javax.swing.*;
import java.awt.*;

public class FrameWithPanelWithWritingOnIt
{

	public static void main(String[] args){
	Frame613 f = new Frame613();
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	f.setVisible(true);
 }

}

class Frame613 extends JFrame{
	public Frame613(){
	setTitle("Ban rocks!");
	setSize(300, 200);
	setLocation(100, 150);

	Panel613 panel = new Panel613();
	Container cd = getContentPane();
	cd.add(panel);	
 }
}

class Panel613 extends JPanel{

	public void paintComponent(Graphics g){
 	super.paintComponent(g);
	g.drawString("Hi", 75, 100);
 }
}
