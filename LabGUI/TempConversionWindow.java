import javax.swing.*;
import java.awt.*;//NEW STUFF!
import java.awt.event.*;

public class TempConversionWindow extends JFrame implements ActionListener{
    private Container pane;
    private JLabel j;
    private JTextField t;

    public TempConversionWindow() {
	this.setTitle("Temperature Converter!!!");
	this.setSize(600,400);
	this.setLocation(100,100);
	this.setDefaultCloseOperation(
				      EXIT_ON_CLOSE);

	pane = this.getContentPane();
	pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));

	JButton b = new JButton("Fahrenheit to Celcius");
	b.addActionListener(this);
	b.setActionCommand("FtoC");
	JButton b2 = new JButton("Celcius to Fahrenheit");
	b2.addActionListener(this);
	b2.setActionCommand("CtoF");


	t = new JTextField(10);

	//JCheckBox c = new JCheckBox("OverClock");
	j = new JLabel("Enter temperature in text field and press the button...");
	//pane.add(c);
	pane.add(t);
	pane.add(b);
	pane.add(b2);
	pane.add(j);
    }

    public void actionPerformed(ActionEvent e){
	String event = e.getActionCommand();//basically indicator of which button pressed
	String input = t.getText();//whatever the user types, is recorded
	/*if(event.equals("Byte")){
	    String s = t.getText();
	    s += "-0101000";
	    j.setText(s);
	}
	if(event.equals("NotByte")){
	    j.setText("Fish");
    
	    }*/
	//double num = Double.parseDouble(input);//parses into doubles
	try{
	    double num = Double.parseDouble(input);    
	}catch(NumberFormatException E){
	    j.setText("Type in a number!");
	}
	/*try{
            double num = Double.parseDouble(input);
        }catch(NullPointerException A){
            j.setText("Type in something! Preferably a number...");
	    }*/ 
	//looks like I didn't need the NullPointerException to be caught...the numberformat takes care of it
	double num = Double.parseDouble(input);
	if(event.equals("CtoF")){//method1
	    String s = "";
	    s += (num * (9.0/5.0) + 32);
	    s += " F";
	    j.setText(s);
	}
	if(event.equals("FtoC")){//method2
	    String s = "";
	    s += ((num - 32) * (5.0/9.0));
	    s += " C";
	    j.setText(s);
	} 
    }
}