package kr.saeildamil.refact.duplicate_observed_data;

import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import net.miginfocom.swing.MigLayout;

public class IntervarPanel extends JPanel {
	private JTextField startfield;
	private JTextField endfield;
	private JTextField lengthfield;

	/**
	 * Create the panel.
	 */
	public IntervarPanel() {
		setLayout(new MigLayout("", "[][grow]", "[][][]"));
		
		JLabel lblNewLabel = new JLabel("start");
		add(lblNewLabel, "cell 0 0");
		
		startfield = new JTextField();
		add(startfield, "cell 1 0,growx");
		startfield.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("end");
		add(lblNewLabel_1, "cell 0 1,alignx trailing");
		
		endfield = new JTextField();
		add(endfield, "cell 1 1,growx");
		endfield.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("length");
		add(lblNewLabel_2, "cell 0 2,alignx trailing");
		
		lengthfield = new JTextField();
		add(lengthfield, "cell 1 2,growx");
		lengthfield.setColumns(10);

	}

	public JTextField getStartfield() {
		return startfield;
	}

	public void setStartfield(JTextField startfield) {
		this.startfield = startfield;
	}

	public JTextField getEndfield() {
		return endfield;
	}

	public void setEndfield(JTextField endfield) {
		this.endfield = endfield;
	}

	public JTextField getLengthfield() {
		return lengthfield;
	}

	public void setLengthfield(JTextField lengthfield) {
		this.lengthfield = lengthfield;
	}
	
	

}
