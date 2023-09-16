package bmicaluclatorproject; 
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 
import java.util.EventObject;

public class caluclatorpgm extends JFrame implements ActionListener { JLabel tittle, height, weight;
JTextField htf, wtf, bmitf; JButton bmi;

caluclatorpgm() {

setVisible(true); setLayout(null); setLocation(30, 30);
setSize(840, 540); getContentPane().setBackground(Color.lightGray);

tittle = new JLabel("BMI CALUCLATOR (IN METRIC SCALE)");
tittle.setFont(Font.getFont(Font.SANS_SERIF)); tittle.setBounds(330, 30, 400, 90); tittle.setForeground(Color.black);
add(tittle);


height = new JLabel("HEIGHT(in cm): "); height.setBounds(100, 100, 300, 40); add(height);

htf = new JTextField(); htf.setBounds(300, 100, 200, 40); add(htf);

weight = new JLabel("WEIGHT(in kg): "); weight.setBounds(100, 200, 300, 40); add(weight);

wtf = new JTextField(); wtf.setBounds(300, 200, 200, 40); add(wtf);

bmi = new JButton("Caluclate BMI"); bmi.setBounds(310, 280, 150, 40); bmi.setBackground(Color.white); bmi.addActionListener(this); add(bmi);

bmitf = new JTextField(); bmitf.setBounds(250, 330, 270, 40); add(bmitf);
}

public void actionPerformed(ActionEvent ae) {
 
if (ae.getSource() == bmi) { try {
int h = Integer.parseInt(htf.getText()); int w = Integer.parseInt(wtf.getText());

double res = (((double) w /(h * h)) * 10000); String answer = String.valueOf(res); bmitf.setText(answer); System.out.println(bmitf.getText());

} catch (Exception e) {

}
}
}

public static void main (String[]args){ new caluclatorpgm();

}
}
