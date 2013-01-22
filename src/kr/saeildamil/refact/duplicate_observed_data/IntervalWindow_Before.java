package kr.saeildamil.refact.duplicate_observed_data;

import java.awt.EventQueue;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.jgoodies.forms.factories.FormFactory;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.RowSpec;

public class IntervalWindow_Before extends JFrame {

	private JPanel contentPane;
	private JTextField _startField;
	private JTextField _endField;
	private JTextField _lengthField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IntervalWindow_Before frame = new IntervalWindow_Before();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public IntervalWindow_Before() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FormLayout(
				new ColumnSpec[] { ColumnSpec.decode("5dlu"),
						FormFactory.DEFAULT_COLSPEC, ColumnSpec.decode("5dlu"),
						ColumnSpec.decode("default:grow"), }, new RowSpec[] {
						FormFactory.RELATED_GAP_ROWSPEC,
						FormFactory.DEFAULT_ROWSPEC,
						FormFactory.RELATED_GAP_ROWSPEC,
						FormFactory.DEFAULT_ROWSPEC,
						FormFactory.RELATED_GAP_ROWSPEC,
						FormFactory.DEFAULT_ROWSPEC, }));

		JLabel lblStart = new JLabel("Start");
		contentPane.add(lblStart, "2, 2");

		_startField = new JTextField("0");
		_startField.addFocusListener(listener);
		contentPane.add(_startField, "4, 2, fill, default");
		_startField.setColumns(10);

		JLabel lblEnd = new JLabel("End");
		contentPane.add(lblEnd, "2, 4");

		_endField = new JTextField("0");
		_endField.addFocusListener(listener);
		contentPane.add(_endField, "4, 4, fill, default");
		_endField.setColumns(10);

		JLabel lblLength = new JLabel("Length");
		contentPane.add(lblLength, "2, 6");

		_lengthField = new JTextField("0");
		_lengthField.addFocusListener(listener);
		contentPane.add(_lengthField, "4, 6, fill, default");
		_lengthField.setColumns(10);
	}

	FocusAdapter listener = new FocusAdapter() {
		public void focusLost(FocusEvent e) {
			Object object = e.getSource();
			if (object == _startField)
				StartField_FocusLost(e);
			else if (object == _endField)
				EndField_FocusLost(e);
			else if (object == _lengthField)
				LengthField_FocusLost(e);
		}

		@Override
		public void focusGained(FocusEvent e) {
			Object object = e.getSource();
			if (object == _startField)
				_startField.selectAll();
			else if (object == _endField)
				_endField.selectAll();
			else if (object == _lengthField)
				_lengthField.selectAll();
		}
	};
	

	public void StartField_FocusLost(FocusEvent e) {
		if (isNotInteger(_startField.getText()))
			_startField.setText("0");
		calculateLength();
	}

	public void LengthField_FocusLost(FocusEvent e) {
		if (isNotInteger(_lengthField.getText()))
			_lengthField.setText("0");
		calculateEnd();
	}

	public void EndField_FocusLost(FocusEvent e) {
		if (isNotInteger(_endField.getText()))
			_endField.setText("0");
		calculateLength(); 		
	}
	
	private void calculateEnd() {
		try {
			int start = Integer.parseInt(_startField.getText());
			int length = Integer.parseInt(_lengthField.getText());
			int end = start + length;
			_endField.setText(String.valueOf(end));
		} catch (NumberFormatException e) {
			throw new RuntimeException("잘못된 숫자 형식 에러-end");
		}		
	}
	private void calculateLength() {
		try {
			int start = Integer.parseInt(_startField.getText());
			int end = Integer.parseInt(_endField.getText());
			int length = end - start;
			_lengthField.setText(String.valueOf(length));
		} catch (NumberFormatException e) {
			throw new RuntimeException("잘못된 숫자 형식 에러-len");
		}
	}

	private boolean isNotInteger(String text) {
		try {
			Integer.parseInt(text);
			return false;
		} catch (NumberFormatException e) {
			return true;
		}
	}
}
