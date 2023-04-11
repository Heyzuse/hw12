//This is the driver program for CarbonFootprint.java. It also now implements a GUI. It prints out the carbon footprint of the Building, Car, and Bicycle objects
import java.util.*;
import java.awt.Scrollbar;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Driver {
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Carbon Footprint");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		
		JPanel panel = new JPanel();
		
		JButton button = new JButton("Finished");
		button.setBounds(50, 100, 100, 20);
		frame.add(button);
		
		button.addActionListener(e ->{
			frame.dispose();
		});
		
		Scrollbar scroll = new Scrollbar();
		scroll.setBounds(200, 30, 20, 100);
		frame.add(scroll);
		
		BoxLayout box = new BoxLayout(panel, BoxLayout.Y_AXIS);
		panel.setLayout(box);
		
		ArrayList<CarbonFootprint> carbonFootprint = new ArrayList<CarbonFootprint>();;
		carbonFootprint.add(new Building(8, 12.25f));
		carbonFootprint.add(new Car(800, 6.23f));
		carbonFootprint.add(new Bicycle());
	
		
		Iterator<CarbonFootprint>itr = carbonFootprint.iterator();
		while(itr.hasNext()) {
			panel.add(new JLabel(itr.next().getCarbonFootprint()));
		}
		
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
	}
}
